/**
 * Date
 * @author JLasprilla
 * @since april 2022
 * @version 1.0
 */

package model;

public class Date{

	//Attributes	
	private int day;
	private int month;
	private int year;
	private String fullDate;

	//Constructor
	public Date(int day, int month, int year, String fullDate){
		this.day = day;
		this.month = month;
		this.year = year;
		this.fullDate = fullDate;
	}

	//Other methods
	public int getDay(){
		return day;
	}

	public void setDay(int day){
		this.day = day;
	}

	public int getMonth(){
		return month;
	}

	public void setMonth(int month){
		this.month = month;
	}

	public int getYear(){
		return year;
	}

	public void setYear(int year){
		this.year = year;
	}

	public String getFullDate(){
		return fullDate;
	}

	public void setFullDate(String fullDate){
		this.fullDate = fullDate;
	}

	//to String
	public String toString(){
		return day + "/" + month + "/" + year;
	}

}