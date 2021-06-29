import java.awt.Point;

public class Quadrilateral  {
	private Point p1, p2, p3, p4;
	//private double a, b, c, d;
	
	public Quadrilateral (Point p1, Point p2, Point p3, Point p4) {
		
		// used to represent a quadrilateral. 
		//Point location1 = new Point(3,4);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;


	    System.out.println("Point 1 X equals " + this.p1.x);
	    System.out.println("Point 1 Y equals " + this.p1.y);

	    System.out.println("Point 2 X equals " + this.p2.x);
	    System.out.println("Point 2 Y equals " + this.p2.y); 

	    System.out.println("Point 3 X equals " + this.p3.x);
	    System.out.println("Point 3 Y equals " + this.p3.y);
	    
	    System.out.println("Point 4 X equals " + this.p4.x);
	    System.out.println("Point 4 Y equals " + this.p4.y);
	}
	
	public double length(Point point1, Point point2){
		//distance forumla
		double distance = Math.hypot(point1.getX()-point2.getX(), point1.getY()-point2.getY());
		System.out.println("Distance: " + distance);
		return distance;
	}
	
	public boolean areAllEqual(double a, double b, double c, double d) {
		return a == b && a == c && a == d;}
	
	public boolean isSquare() {
		// indicates if the quadrilateral is a square
		/**
		public boolean isSquare{
		return areAllSidesSameLength() && rightAngle;**/
		
		// are all sides same length
		double a = length(p1 , p2); // top horizontal
		double b = length(p2 , p3); // right vertical 
		double c = length(p3 , p4); // bottom horizontal
		double d = length(p4 , p1); // left vertical
		
		return areAllEqual(a, b, c, d) && isRight();
	}
	
	public boolean areTwoSidesEqualandOtherTwoEqual(double a, double b, double c, double d, double e, double f) {
		return (a == b && c == d && e == f);
	}
	
	public boolean isRight() {
		
	    Double side1 = length(p1,p2);
	    Double side2 = length(p2,p3);
	    Double side3 = length(p1,p3);

	    return (Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)) == side3) ||
	           (Math.sqrt(Math.pow(side1, 2) + Math.pow(side3, 2)) == side2) ||
	           (Math.sqrt(Math.pow(side3, 2) + Math.pow(side2, 2)) == side1);
	}
	    
	public boolean isRectangle() {
		double a = length(p1, p2); // top horizontal
		double b = length(p4, p3); // bottom horizontal
		double c = length(p1, p4); // left vertical 
		double d = length(p2, p3); // right vertical 
		double e = length(p1, p3); // left diagnal 
		double f = length(p2, p4); // right diagnal
		// Check all the lengths
		return areTwoSidesEqualandOtherTwoEqual(a, b, c, d, e, f);
	}
	// get angle in radians given sides a, b, and c , and a is side opposite of angle A
	public float getAngle(double f, double a, double c) {
		return (float) Math.acos((Math.pow(f, 2) - Math.pow(a, 2) - Math.pow(c, 2)) / (-2 * a * c));}
	
	public boolean isParallelogram() {
		double a = length(p1, p2); // top horizontal
		double b = length(p4, p3); // bottom horizontal
		double c = length(p1, p4); // left vertical 
		double e = length(p1, p3); // left diagnal 
		double f = length(p2, p4); // right diagnal
		
		double angle1 = getAngle(f, a, c);
		double angle2 = getAngle(e, c, b);
		double sum = 3.1415927410125732;
		double rightAngle = 1.5707963705062866;
		if (angle1 == rightAngle && angle2 == rightAngle) {
			System.out.println("Bummer its a Right angle!");
			System.out.println("Angle1: " + angle1);
			System.out.println("This is the sum: "+ sum);
			System.out.println("Concluding Parallelogram Test: \n");}
		
		else if (angle1 + angle2 == sum)
			System.out.println("Both angles are equal to 180 degrees together!");
			System.out.println("they are supplementary angles! hence they are Parallel");
			
		return (angle1 < rightAngle && angle1 + angle2 == sum) || (angle1 > rightAngle && angle1 + angle2 == sum);
	}

}
