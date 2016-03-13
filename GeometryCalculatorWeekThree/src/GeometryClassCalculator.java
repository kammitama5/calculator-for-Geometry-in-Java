
public class GeometryClassCalculator {
	
	//Area of circle = PI * (r x r)
		//Area of Rectangle = Width x Length
		//Area of Triangle = (base x height) x 0.5
		
		 public static double AreaCircle(double radius) {
		        return Math.PI * radius * radius;
		    }

		    public static double AreaRectangle(double length, double width) {
		        return length * width;
		    }

		    public static double AreaTriangle (double base, double height) {
		        return base * height * 0.5;
		    
		} 

}
