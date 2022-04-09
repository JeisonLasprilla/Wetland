/**
 * Event
 * @author JLasprilla
 * @since april 2022
 * @version 1.0
 */
package model;

public class Event{

	//Atributos
	private String name;
	private String typeEvent;
	private String nameCustomer;
	private double value;
	private String description;

	//Constructor
	public Event(String name, String typeEvent, String nameCustomer, double value, String description){
		this.name = name;
		this.typeEvent = typeEvent;
		this.nameCustomer = nameCustomer;
		this.value = value;
		this.description = description;
	}

	//Other methods
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getTypeEvent(){
		return typeEvent;
	}
	
	public void setTypeEvent(String typeEvent){
		this.typeEvent = typeEvent;
	}

	public String getNameCustomer(){
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer){
		this.nameCustomer = nameCustomer;
	}

	public double getValue(){
		return value;
	}

	public void setValue(double value){
		this.value = value;
	}

	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}

	//Relationships
	private Date eventDate;
}