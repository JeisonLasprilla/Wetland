/**
 * Wetland
 * @author JLasprilla
 * @since april 2022
 * @version 1.1
 */

package model;

public class Wetland{

	private static final int MAX_EVENTS = 800;
	private static final int MAX_SPECIES = 800;

	protected Specie[] hasSpecies;
	protected Event[] hasEvents;

	private String name;
	private String zone;
	private String security;
	private double km2;
	private String photoUrl;
	private boolean protectedArea;
	private String nameNeighborhood;
	private int totalFlora;
	private int totalFauna;
	private boolean enviromentalPlan;
	private String planPercentage;

	/**
	 *Constructor Wetland
	 * */
	public Wetland (String name, String zone, String security, double km2, String photoUrl, boolean protectedArea, String nameNeighborhood, int totalFlora, int totalFauna, boolean enviromentalPlan, String planPercentage){

		hasEvents = new Event [MAX_EVENTS];
        hasSpecies = new Specie [MAX_SPECIES];

		this.name = name;
		this.zone = zone;
		this.security = security;
		this.km2 = km2;
		this.photoUrl = photoUrl;
		this.protectedArea = protectedArea;
		this.nameNeighborhood = nameNeighborhood;
		this.totalFlora = totalFlora;
		this.totalFauna = totalFauna;
		this.enviromentalPlan = enviromentalPlan;
		this.planPercentage = planPercentage;
	}

	/**
	 *to String method
	 * */
	public String toString(){
		return "\nName: "+name+"\nZone: "+zone+"\nSecurity: "+security+"\nKm2: "+km2+"\nPhoto Url: "+photoUrl+"\nProtected Area: "+protectedArea+"\nNeighborhood: "+nameNeighborhood+"\nCount Species of flora: "+totalFlora+"\nCount number of animals: "+totalFauna+"\nEnviromental plan: "+enviromentalPlan+"\nEnviromental plan percentage: "+planPercentage+"";
	}

	/**
     * Search the first empty position in hasSpecies array
     * @return position, the number of the first empty position
     */ 
    public int getEmptyPositionHasSpecies(){
    
        boolean emptyPosition = false;
        int position = -1;
        for (int i=0; i<MAX_SPECIES && !emptyPosition; i++){

            if (hasSpecies[i]==null){
                emptyPosition = true;
                position=i;
            }
        }
        return position;
    }

    /**
     * Search the first empty position in hasEvents array
     * @return position, the number of the first empty position
    */ 
    public int getEmptyPositionHasEvents(){
    
        boolean emptyPosition = false;
        int position = -1;
        for (int i=0; i<MAX_EVENTS && !emptyPosition; i++){

            if (hasEvents[i]==null){
                emptyPosition = true;
                position=i;
            }
        }
        return position;
    }

	
	//getters and setters

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

	public int getTotalFlora(){
		return totalFlora;
	}

	public void setTotalFlora(int totalFlora){
		this.totalFlora = totalFlora;
	}

	public int getTotalFauna(){
		return totalFauna;
	}

	public void setTotalFauna(int totalFauna){
		this.totalFauna = totalFauna;
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