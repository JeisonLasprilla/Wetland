/**
 * EnviromentalPlan
 * @author JLasprilla
 * @since april 2022
 * @version 1.0
 */

package model;

public class EnviromentalPlan{

	//Attributes	
	private boolean compiles;
	private double percentage;

	//Constructor
	public EnviromentalPlan(boolean compiles, double percentage){
		this.compiles = compiles;
		this.percentage = percentage;
	}

	//Other methods
	public boolean getCompiles(){
		return compiles;
	}

	public void setCompiles(boolean compiles){
		this.compiles = compiles;
	}

	public double getPercentage(){
		return percentage;
	}

	public void setPercentage(double percentage){
		this.percentage = percentage;
	}
}