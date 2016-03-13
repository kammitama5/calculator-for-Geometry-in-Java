import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Main {
	static DecimalFormat df = new DecimalFormat("#.##");

	public static void main(String[] args) {
		double choice; // The user's menu choice

	    
	     {
	        // Get the user's menu choice.
	        choice = getMenu();
	        

	        if (choice == 1) {
	            CircleArea();
	        } else if (choice == 2) {
	            RectangleArea();
	        } else if (choice == 3) {
	            TriangleMethod();
	        } else if (choice == 4) {
	            JOptionPane.showMessageDialog(null, "You chose to quit. \n" +
	                                          "Thank you for using the Geometry Calculator!");
	            System.exit(0);
	        }
	        else {
	        	JOptionPane.showMessageDialog(null, "That is not a valid number. Please try again.");
	        	System.exit(0);
	        }
	       
	        
	        
	     }
	}

	  
	



	private static void CircleArea() {
		// Get input from user
	     String userinput1 = JOptionPane.showInputDialog(null, "What is the radius of the Circle?\n"+ "Enter a positive number: ");
	    double radius = Double.parseDouble(userinput1);
	    {
	    if (radius < 0){
	    	JOptionPane.showMessageDialog(null, "This is not a valid option. Please read instructions next time.");
	    	System.exit(0);
	    }
	    else {
	    	radius = Double.parseDouble(userinput1);
	    }
	    
	    double areaCircle = Math.PI * (radius * radius);

	    // Display output
	    JOptionPane.showMessageDialog(null, "The Area of the circle is " + df.format(areaCircle) + " metre(s).");
	}
		
	}






	private static void RectangleArea() {
		// Get input from user
		
	    String userinput1 = JOptionPane.showInputDialog(null, "What is the length of the Rectangle?\n " + "Enter a positive number: ");
	    double length = Double.parseDouble(userinput1);
	    {
	    if (length < 0){
	    	JOptionPane.showMessageDialog(null,  "This is not a valid option. Please read instructions next time.");
	    	System.exit(0);
	    }
	    
	    String userinput2 = JOptionPane.showInputDialog(null, "What is the width of the Rectangle?\n " + "Enter a positive number: ");
	    double width = Double.parseDouble(userinput2);
	    
	    if (width < 0){
	    	JOptionPane.showMessageDialog(null,  "This is not a valid option. Please read instructions next time.");
	    	System.exit(0);
	    }
	    double areaRectangle = (length * width);
	    

	    // Display output
	   JOptionPane.showMessageDialog(null, "The Rectangle's area is  " + df.format(areaRectangle) + " metre(s).");
	}
		
	}






	private static void TriangleMethod() {
		// Get input from user
	    String userinput1 = JOptionPane.showInputDialog(null, "What is the base of the Triangle?\n" + "Enter a positive number: ");
	    double base = Double.parseDouble(userinput1);
	    {
	    if (base < 0){
	    	JOptionPane.showMessageDialog(null, "This is not a valid option. Please read instructions next time");
	    	System.exit(0);
	    }
	    String userinput2 = JOptionPane.showInputDialog(null, "What is the height of the Triangle?\n " + "Enter a positive number: ");
	    double height = Double.parseDouble(userinput2);
	    if (height < 0){
	    	JOptionPane.showMessageDialog(null, "This is not a valid option. Please read instructions next time.");
	    	System.exit(0);
	    }
	    double areaTriangle = ((base * height) * 0.5);

	    // Display output
	    JOptionPane.showMessageDialog(null, "The area of the Triangle is " + df.format(areaTriangle) + " meter(s).");
	}
		
	}






	public static double getMenu() {
		
		String userinput1 = JOptionPane.showInputDialog(null,
				"Geometry Calculator\n"
				+" Please choose a number 1 through 4 to make a selection:\n"
				+ "---------------------------------------------------------\n"
				+ "1. Calculate the Area of a Circle\n"
				+ "2. Calculate the Area of a Rectangle\n"
				+ "3. Calculate the Area of a Triangle\n"
				+ "4. Quit\n"
				);

	    double userChoice = Double.parseDouble(userinput1);

	    

	    return userChoice;
	}
	

}
