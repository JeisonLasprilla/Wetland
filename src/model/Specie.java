/**
 * Specie
 * @author JLasprilla
 * @since april 2022
 * @version 1.1
 */

package model;

public class Specie{

	private Wetland [] hasWetlands;

	private static final int MAX_WETLANDS = 80;

	private String category;
	private String name;
	private String scientificName;
	private boolean migratorySpecie;
	private String specieType;

	/**
	 *Constructor Specie
	 * */
	public Specie (Wetland wetlands[],int wetlandIndicator, String category, String name, String scientificName, boolean migratorySpecie, String specieType){

		hasWetlands = new Wetland [MAX_WETLANDS];
		hasWetlands[getEmptyPositionHasWetlands()] = wetlands[wetlandIndicator];

		this.category = category;
		this.name = name;
		this.scientificName = scientificName;
		this.migratorySpecie = migratorySpecie;
		this.specieType = specieType;
	}

	/**
     * Search the first empty position in hasWetlands array
     * @return position, the number of the first empty position
     */ 
    public int getEmptyPositionHasWetlands(){
    
        boolean emptyPosition = false;
        int position = -1;
        for (int i=0; i<MAX_WETLANDS && !emptyPosition; i++){

            if (hasWetlands[i]==null){
                emptyPosition = true;
                position=i;
            }
        }
        return position;
    }


	/**
	 *to String method
	 * */
	public String toString(){
		return "Category: "+category+"\nName: "+name+"\nScientific name: "+scientificName+"\nMigratory specie: "+migratorySpecie+"\nType specie: "+specieType;
	}
	
	//getters and setters

	public String getCategory(){
		return category;
	}
	
	public void setCategory(String category){
		this.category = category;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getScientificName(){
		return scientificName;
	}

	public void setScientificName(String scientificName){
		this.scientificName = scientificName;
	}

	public boolean getMigratorySpecie(){
		return migratorySpecie;
	}
	
	public void setMigratorySpecie(boolean migratorySpecie){
		this.migratorySpecie = migratorySpecie;
	}

	public String getSpecieType(){
		return specieType;
	}

	public void setSpecieType(String specieType){
		this.specieType = specieType;
	}
}