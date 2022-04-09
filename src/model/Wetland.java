/**
 * Wetland
 * @author JLasprilla
 * @since april 2022
 * @version 1.0
 */

package model; //Paquete

public class Wetland{

	private Specie[] hasSpecie;
	private Event[] hasEvent;
	private EnviromentalPlan hasEnviromentalPlan;

	private String name;
	private String zone;
	private String security;
	private double km2;
	private String photoUrl;
	private boolean protectedArea;
	private String nameNeighborhood;
	private boolean lessSpecies;
	private boolean moreSpecies;
	private boolean enviromentalPlan;
	private String planPercentage;

	//Constructor

	public Wetland (String name, String zone, String security, double km2, String photoUrl, boolean protectedArea, String nameNeighborhood, boolean lessSpecies, boolean moreSpecies, boolean enviromentalPlan, String planPercentage){

		this.name = name;
		this.zone = zone;
		this.security = security;
		this.km2 = km2;
		this.photoUrl = photoUrl;
		this.protectedArea = protectedArea;
		this.nameNeighborhood = nameNeighborhood;
		this.lessSpecies = lessSpecies;
		this.moreSpecies = moreSpecies;
		this.enviromentalPlan = enviromentalPlan;
		this.planPercentage = planPercentage;
	}

	public String toString(){
		return "\nName: "+name+"\nZone: "+zone+"\nSecurity: "+security+"\nKm2: "+km2+"\nPhoto Url: "+photoUrl+"\nProtected Area: "+protectedArea+"\nNeighborhood: "+nameNeighborhood+"\nLess Species of flora: "+lessSpecies+"\nGreater number of animals: "+moreSpecies+"\nEnviromental plan: "+enviromentalPlan+"\nEnviromental plan percentage: "+planPercentage+"";
	}
	
	//Other methods

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getZone(){
		return zone;
	}
	
	public void setZone(String Zone){
		this.zone = zone;
	}

	public String getSecurity(){
		return security;
	}

	public void setSecurity(String security){
		this.security = security;
	}

	public double getKm2(){
		return km2;
	}
	
	public void setKm2(double km2){
		this.km2 = km2;
	}

	public String getPhotoUrl(){
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl){
		this.photoUrl = photoUrl;
	}

	public boolean getProtectedArea(){
		return protectedArea;
	}
	
	public void setProtectedArea(boolean protectedArea){
		this.protectedArea = protectedArea;
	}

	public String getNameNeighborhood(){
		return nameNeighborhood;
	}

	public void setNameNeighborhood(String name){
		this.nameNeighborhood = nameNeighborhood;
	}

	public boolean getLessSpecies(){
		return lessSpecies;
	}

	public void setLessSpecies(boolean lessSpecies){
		this.lessSpecies = lessSpecies;
	}

	public boolean getMoreSpecies(){
		return moreSpecies;
	}

	public void setMoreSpecies(boolean moreSpecies){
		this.moreSpecies = moreSpecies;
	}

	public boolean getEnviromentalPlan(){
		return enviromentalPlan;
	}

	public void setEnviromentalPlan(boolean enviromentalPlan){
		this.enviromentalPlan = enviromentalPlan;
	}

	public String getPlanPercentage(){
		return planPercentage;
	}

	public void setPlanPercentage(String planPercentage){
	this.planPercentage = planPercentage;
	}
}