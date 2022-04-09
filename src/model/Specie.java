/**
 * Specie
 * @author JLasprilla
 * @since april 2022
 * @version 1.0
 */

package model; //Paquete

public class Specie{

	//Attributes

	private String category;
	private String name;
	private String scientificName;
	private boolean migratorySpecie;
	private String specieType;

	//Constructor

	public Specie (String category, String name, String scientificName, boolean migratorySpecie, String specieType){

		this.category = category;
		this.name = name;
		this.scientificName = scientificName;
		this.migratorySpecie = migratorySpecie;
		this.specieType = specieType;
	}

	public String toString(){
		return "Category: "+category+"\nName: "+name+"\nScientific name: "+scientificName+"\nMigratory specie: "+migratorySpecie+"\nType specie: "+specieType;
	}
	
	//Other methods

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

	//Relationships

	private Wetland[] wetlands;

}