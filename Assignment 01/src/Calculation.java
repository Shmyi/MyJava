import java.util.Scanner;//import package Scanner
/*
 *Calculation class has methods for output, input
 * */
public class Calculation {
	
	//instance of class Scanner for inputs, variable named scanner/
    private Scanner scanner = new Scanner(System.in);
    
    /*
     * Returns a reference to String read from the standard input stream 
     * using instance of class Scanner
     */
    public String inputName() {
    	return scanner.nextLine(); //grab all texts including /n
    }
    public double inputinnerRadius() {
    	double innerRadius = scanner.nextDouble();
    //	scanner.nextLine();
    	return innerRadius;
    }
    public double inputouterRadius() {
    	double outerRadius = scanner.nextDouble();
    	scanner.nextLine();
    	return outerRadius;   	
    }
    public void message(String message) {
    	System.out.println(message);
    }
}
//Reference
//[1]“Java Development Kit Version 17 API Specification,” docs.oracle.com. https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#PI (accessed May 26, 2024).

