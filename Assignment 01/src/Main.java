/*
 * Author: Yi Chen
 * Date: May 27, 2024
 * Modified :
 * Description: Assignment 01
 * This program will compute the Torus item volume by enter inner radius and outer radius
 */
public class Main {
	
	public static void main(String[] arg) {

		Torus torus1 = null;
		Torus torus2 = null;
		
		double radius1;
		double radius2;
		String name;
				
		Calculation calculation = new Calculation();
		
		calculation.message("Please enter item1 name");
		name = calculation.inputName();
		
		calculation.message("Please enter item1 innerRadius (cm)");
		radius1 = calculation.inputinnerRadius();
		
		calculation.message("Please enter item1 outerRadius (cm)");
		radius2 = calculation.inputouterRadius();
		
		torus1 = new Torus(name, radius1, radius2);
		
		calculation.message("Please enter item2 name");
		name = calculation.inputName();
		
		calculation.message("Please enter item2 innerRadius (cm)");
		radius1 = calculation.inputinnerRadius();
		
		calculation.message("Please enter item2 outerRadius (cm)");
		radius2 = calculation.inputouterRadius();
		
		torus2 = new Torus(name, radius1, radius2);
		
		double torus1Volume = torus1.getCalculateVolume();
		double torus2Volume = torus2.getCalculateVolume();
		
		//calculation.message("The Volume of"+ torus1.getName() + " is " + torus1Volume +" cm^3");
		//calculation.message("The Volume of"+ torus2.getName() + " is " + torus2Volume +" cm^3");
		System.out.printf("The Volume of %s is %.2f, cm^3 %n",torus1.getName(), torus1Volume);
		System.out.printf("The Volume of %s is %.2f, cm^3 %n",torus2.getName(), torus2Volume);
	}
}
