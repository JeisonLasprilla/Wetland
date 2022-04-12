/**
 * Event
 * @author JLasprilla
 * @since april 2022
 * @version 1.1
 */
package model;

public class Event{

	//Atributos
	private String name;
	private String eventType;
	private String nameCustomer;
	private double value;
	private String description;
	private String eventDate;

	/**
	 *Constructor wetland
	 * */
	public Event(String name, String eventType, String nameCustomer, double value, String description, String eventDate){

		this.name = name;
		this.eventType = eventType;
		this.nameCustomer = nameCustomer;
		this.value = value;
		this.description = description;
		this.eventDate = eventDate;
	}

	//getters and setters

	public String getEventDate(){
		return eventDate;
	}
	
	public void setEventDate(String eventDated){
		this.eventDate = eventDate;
	} 

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getEventType(){
		return eventType;
	}
	
	public void setEventType(String eventType){
		this.eventType = eventType;
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
}