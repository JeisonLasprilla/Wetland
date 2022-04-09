package model;
/**
 * Company
 * @author JLasprilla
 * @since april 2022
 * @version 1.0
 */

import model.Event;
import model.Wetland;
import model.Specie;

public class Company{

    /*
    * Number of wetlands that can be created
    **/
 	public static final int MAX_WETLANDS = 80;

    /*
    * Number of events that can be created
    **/
 	public static final int MAX_EVENTS = 800;
 	
    /*
    * Number of species that can be created
    **/
    public static final int MAX_SPECIES = 800;

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
        hasWetlands = new Wetland [MAX_WETLANDS];
        hasEvents = new Event [MAX_EVENTS];
        hasSpecies = new Specie [MAX_SPECIES];

 	}

    public void addWetland(int emptyPos, String name, String zone, String security,double km2, String photoUrl, boolean protectedArea, String nameNeighborhood,boolean lessSpecies, boolean moreSpecies, boolean enviromentalPlan, String planPercentage){
        wetlands[emptyPos] = new Wetland(name,zone, security, km2, photoUrl, protectedArea, nameNeighborhood, lessSpecies, moreSpecies, enviromentalPlan, planPercentage);
    }

    //primero ubicar el humedal donde se quiere agregar
    public void addSpecie(int emptyPos,int westlandIndicator, String category, String name, String scientificName, boolean migratorySpecie, String specieType){

        hasWetlands[getEmptyPositionHasWetlands()] = wetlands[westlandIndicator];
        species[emptyPos] = new Specie (category, name, scientificName, migratorySpecie, specieType);
    }

    //Lo mismo
    public void addEvent(int emptyPos, String name, String typeEvent, String nameCustomer, double value, String description){
        //primero ubicar el humedal donde se quiere agregar
        events [emptyPos] = new Event (name, typeEvent, nameCustomer, value, description);
    }

    /*
     * Indicates if the wetlands array has space
     * @return emptyPosition, false or true     
    public boolean hasSpaceWetland(){
        
        boolean emptyPosition = false;
        for (int i=0; i<MAX_WETLANDS && !emptyPosition; i++){

            if (wetlands[i]==null){
                emptyPosition = true;
            }
        }
        return emptyPosition;
    }
    */

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

     /**
     * Search the first empty position in hasWetlands array
     * @return position, the number of the first empty position
     */ 
    public int getEmptyPositionHasWetlands(){
    
        boolean emptyPosition = false;
        int position = -1;
        for (int i=0; i<MAX_WETLANDS && !emptyPosition; i++){

            if (hasWetlands[MAX_WETLANDS]==null){
                emptyPosition = true;
                position=i;
            }
        }
        return position;
    }

}

