/*
 * Author: Yi Chen
 * Date: May 27, 2024
 * Modified :
 * Description: Assignment 01
 * This program will compute the Torus item volume by enter inner radius and outer radius
 */
import java.util.Scanner;  							//import package Scanner
public class TorusVolume {
	public static void main(String[] args) {
		double innerRadius;
		double outerRadius;

		String name;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter item1 name");
		name = scanner.nextLine();
		System.out.println("Please enter innerRadius in cm");
		innerRadius = scanner.nextDouble();
		System.out.println("Please enter outerRadius in cm");
		outerRadius = scanner.nextDouble();
		scanner.nextLine();
		Torus torus1 = new Torus(name, innerRadius, outerRadius);
	
		System.out.println("Please enter item2 name");
		name = scanner.nextLine();	
		System.out.println("Please enter innerRadius in cm");
		innerRadius = scanner.nextDouble();
		System.out.println("Please enter outerRadius in cm");
		outerRadius = scanner.nextDouble();
		Torus torus2 = new Torus(name, innerRadius, outerRadius);
	
		System.out.printf("The Volume of %s is %f cm^3 %n",torus1.getName(), torus1.getCalculateVolume());
		System.out.printf("The Volume of %s is %.2f cm^3 %n",torus2.getName(), torus2.getCalculateVolume());

	}
	
}
