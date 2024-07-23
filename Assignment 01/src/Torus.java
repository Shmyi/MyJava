/*
 * Author: Yi Chen
 * Date: May 27, 2024
 * Modified :
 * Description: Assignment 01
 * This program will compute the Torus item volume by enter inner radius and outer radius
 * This class is about the variables of the torus. 
 */
import java.lang.Math; //import math package , API : pi method & exponent
public class Torus {

	private String name;						//declare name of item
	private double innerRadius;					//declare inner radius cm 
	private double outerRadius;					//declare outer radius cm
	
	public Torus() {						//default constructor 
		this.name = "donuts";				//default value
		this.innerRadius= 10.0;
		this.outerRadius= 20.0;
	}
	public Torus(String name, double innerRadius, double outerRadius) { //constructor with name, innerRadius, outerRadius 
		this.name = name ;
		this.innerRadius = innerRadius;
		this.outerRadius = outerRadius;		
	}
	//accessor for name
	public String getName() {
		return name;
	}
    //mutator for name
	public void setName(String name) {
		this.name = name;
	}
	//accessor for innerRadius
	public double getInputRadius1() {
		return innerRadius;
	}
	//mutator for innerRadius
	public void setInnerRadius(double innerRadius) {
		this.innerRadius = innerRadius;
	}
	//accessor for outerRadius
	public double getOuterRadius() {
		return outerRadius;
	}
	//mutator for outerRadius
	public void setOuterRadius(double outerRadius) {
		this.outerRadius = outerRadius;
	}
	//calculate Torus volume. Returns result of calculation = 2 × R × π^2 × r^2 
	public double getCalculateVolume() {
		return 2*(innerRadius+outerRadius)*0.5*Math.pow((Math.PI*(outerRadius-innerRadius)*0.5),2);
	}

//Author Yi Chen	
}

