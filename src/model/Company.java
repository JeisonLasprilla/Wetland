package model;
/**
 * Company
 * @author JLasprilla
 * @since april 2022
 * @version 1.1
 */
import model.Event;
import model.Wetland;
import model.Specie;
import java.text.SimpleDateFormat; //Date format
import java.util.Date;

public class Company{

    /*
    * Number of wetlands that can be created
    **/
 	public final int MAX_WETLANDS = 80;

    /*
    * Number of events that can be created
    **/
 	public final int MAX_EVENTS = 800;
 	
    /*
    * Number of species that can be created
    **/
    public final int MAX_SPECIES = 800;

 	private Wetland [] wetlands;
 	private Event [] events;
 	private Specie [] species;

 	/**
	 * Constructor
	 */
 	public Company(){
 		wetlands = new Wetland [MAX_WETLANDS];
 		events = new Event [MAX_EVENTS];
 		species = new Specie [MAX_SPECIES];
 	}

    /**
     * add the wetland in the empty position
     * @param emptyPos, int with the empty position in the array
     * @param name
     * @param zone
     * @param security
     * @param km2
     * @param photoUrl
     * @param protectedArea
     * @param nameNeighborhood
     * @param totalFlora
     * @param totalFauna
     * @param enviromentalPlan
     * @param planPercentage
     * @return void
     */ 
    public void addWetland(int emptyPos, String name, String zone, String security,double km2, String photoUrl, boolean protectedArea, String nameNeighborhood,int totalFlora, int totalFauna, boolean enviromentalPlan, String planPercentage){     
        wetlands[emptyPos] = new Wetland(name, zone, security, km2, photoUrl, protectedArea, nameNeighborhood, totalFlora, totalFauna, enviromentalPlan, planPercentage);
    }

     /**
     * add the new specie in the empty position of species, add the specie in the hasSpecies array, count the wildlife and plants
     * @param emptyPos, int with the empty position in the array
     * @param wetlandIndicator, indicator for wetland
     * @param category
     * @param name
     * @param scientificName
     * @param migratorySpecie
     * @param specieType
     * @return void
     */ 
    public void addSpecie(int emptyPos, int wetlandIndicator, String category, String name, String scientificName, boolean migratorySpecie, String specieType){
        species[emptyPos] = new Specie (wetlands, wetlandIndicator, category, name, scientificName, migratorySpecie, specieType);
        wetlands[wetlandIndicator].hasSpecies[wetlands[wetlandIndicator].getEmptyPositionHasSpecies()] = species[emptyPos];
        
        if(species[emptyPos].getCategory().equals("fauna")){
            wetlands[wetlandIndicator].setTotalFauna(wetlands[wetlandIndicator].getTotalFauna() + 1);
        } else if (species[emptyPos].getCategory().equals("flora")){
            wetlands[wetlandIndicator].setTotalFlora(wetlands[wetlandIndicator].getTotalFlora() + 1);
        }
    }

     /**
     * add the new event in the empty position of events, add the event in the hasEvents array
     * @param wetlandIndicator, indicator for wetland     
     * @param emptyPos, int with the empty position in the array
     * @param name
     * @param eventType
     * @param nameCustomer
     * @param value
     * @param description
     * @param eventDate
     * @return void
     */ 
    public void addEvent(int wetlandIndicator, int emptyPos, String name, String eventType, String nameCustomer, double value, String description, String eventDate){
        events [emptyPos] = new Event (name, eventType, nameCustomer, value, description, eventDate);
        wetlands[wetlandIndicator].hasEvents[wetlands[wetlandIndicator].getEmptyPositionHasEvents()] = events[emptyPos];
    }


     /**
     * Find the index for wetland with less Species of plants
     * @return lessSpecies, index for wetland with less species of plants
     */ 
    public int indexLessSpeciesFlora (){

        int lessSpecies = -1;
        int less = 800;
        boolean end = false;
        for (int i = 0; i < MAX_WETLANDS && end == false; i++){

            if (wetlands[0] == null){
                System.out.println ("There are no wetlands");
                System.exit(0);
            }
            if (wetlands[i] == null){
                end = true;
            } else if (wetlands[i].getTotalFlora() < less){
                less = wetlands[i].getTotalFlora();
                lessSpecies = i;
            }
        }
        return lessSpecies;
    }

     /**
     * Print the wetland name with less species of flora and show the number
     * @return void
     */ 
    public void showLessSpecies(){
        System.out.println ("\nThe wetland with less species is: "+wetlands[indexLessSpeciesFlora()].getName()+"\nTotal species:"+wetlands[indexLessSpeciesFlora()].getTotalFlora()+"");
    }

     /**
     * Find the index for wetland with more wildlife
     * @return moreSpecies, index for wetland with more wildlife
     */ 
    public int indexMoreSpeciesFauna (){

        int moreSpecies = 0;
        int greater = 800;
        boolean end = false;
        for (int i = 0; i < MAX_WETLANDS && end == false; i++){

            if (wetlands[0] == null){
                System.out.println ("There are no wetlands");
                System.exit(0);
            }
            if (wetlands[i] == null){
                end = true;
            } else if (wetlands[i].getTotalFauna() > greater){
                greater = wetlands[i].getTotalFauna();
                moreSpecies = i;
            }
        }
        return moreSpecies;
    }

    /**
     * Print the wetland name with more wildlife species and show the count
     * @return void
     */ 
    public void showMoreSpecies(){
        System.out.println ("\nThe wetland with more species is: "+wetlands[indexMoreSpeciesFauna()].getName()+"\nTotal species:"+wetlands[indexMoreSpeciesFauna()].getTotalFlora()+"");
    }

    /**
     * Print all the wertlands
     * @return void
     */ 
    public void showInfoWetlands(){
  
        if (wetlands[0] == null){
            System.out.println("There are no wetlands");
            System.exit(0);
        }

        for (int i = 0; i < MAX_WETLANDS && wetlands[i] != null; i++){
            System.out.println("\n"+wetlands[i]+"\n");
        }
    }

    /**
     * print the wetlands where the species lives
     * @return void
     */ 
    public void speciesInWetlands(String name){

        if (wetlands[0] == null){
            System.out.println("There are no wetlands");
        } else {
            boolean end = false;
            for (int i = 0 ; i < MAX_WETLANDS && end == false; i++){
                
                if (wetlands[i] == null){
                    end = true;
                } else {

                    boolean end2 = false;
                    for (int j = 0; j < wetlands[i].hasSpecies.length && end2 == false; j++){

                        if (wetlands[i].hasSpecies[j] == null){
                            end2 = true;
                        } else if (wetlands[i].hasSpecies[j].getScientificName().equals(name)){
                            System.out.println (wetlands[i]);
                        }

                    }
                }
            }
        }
    }

    /**
     * print the number of maintencance over a period of time
     * @return void
     */ 
    public void countMaintenance(String since, String until){
        if (wetlands[0] == null){
            System.out.println ("There are no wetlands");
            System.exit(0);
        }

        SimpleDateFormat dayMonthYear = new SimpleDateFormat("dd/MM/yyyy");

        try{
            Date sinceDate = dayMonthYear.parse(since); //Date 1

            try{
               Date untilDate = dayMonthYear.parse(until); //Date 2

                boolean end = false;
                for (int i = 0; i < MAX_WETLANDS && end == false; i++){         //for each wetland

                    if (wetlands[i] == null){
                        end = true;
                    } else {


                        boolean end2 = false;
                        int count = 0;
                        for (int j = 0; j < MAX_EVENTS && end2 == false; j++){      //for each event in this wetland

                            if (wetlands[i].hasEvents[j] == null){
                                 end2 = true;
                            } else {

                                try{
                                    Date eventDate = dayMonthYear.parse(wetlands[i].hasEvents[j].getEventDate());
                                    if (wetlands[i].hasEvents[j].getEventType().equals("maintenance") && sinceDate.getTime() <= eventDate.getTime() && eventDate.getTime() <= untilDate.getTime()){
                                        count++; //repeats
                                    }
                                } catch(Exception ex ){
                                    System.exit(0);
                                }
                            }
                        }
                        System.out.println("Wetland: "+wetlands[i].getName()+" Maintenance during the period: "+count+""); //print the number of maintenance during the period
                    }
                }
            } catch(Exception ex ){
                System.exit(0);
            }
        } catch(Exception ex ){
            System.exit(0);
        }
    }


     /**
     * Indicates the wetland position on the wetlands array 
     * @return wetlandIndicator, index in int format
     **/
    public int wetlandIndicator(int wetlandIndicator, String wetlandName){

        if (wetlands[0] == null){
            System.out.println("There are no Wetlands");
            wetlandIndicator = 82;
        } else {            
            int i = 0;
            while (wetlandIndicator < 0 && wetlandIndicator != -2){

                if (wetlands[i] == null){
                    System.out.println ("The name doesn't match with any wetlands");
                    wetlandIndicator = -2;

                } else if (wetlands[i] == null){
                   wetlandIndicator = -2;
                } else if (wetlandName.equals(wetlands[i].getName())){
                    wetlandIndicator = i;
                } else{
                    i++;
                }
            }
        }
        return wetlandIndicator;    
    }

    /**
     * Search the first empty position in wetlands array
     * @return position, the number of the first empty position
     */ 

    public int getEmptyPositionWetland(){
    
        boolean emptyPosition = false;
        int position = -1;
        for (int i=0; i<MAX_WETLANDS && !emptyPosition; i++){

            if (wetlands[i]==null){
                emptyPosition = true;
                position=i;
            }
        }
        return position;
    }

    /**
     * Search the first empty position in species array
     * @return position, the number of the first empty position
     */ 
    public int getEmptyPositionSpecies(){
    
        boolean emptyPosition = false;
        int position = -1;
        for (int i=0; i<MAX_SPECIES && !emptyPosition; i++){

            if (species[i]==null){
                emptyPosition = true;
                position=i;
            }
        }
        return position;
    }

    /**
     * Search the first empty position in events array
     * @return position, the number of the first empty position
     */ 
    public int getEmptyPositionEvents(){
    
        boolean emptyPosition = false;
        int position = -1;
        for (int i=0; i<MAX_EVENTS && !emptyPosition; i++){

            if (events[i]==null){
                emptyPosition = true;
                position=i;
            }
        }
        return position;
    }
}

