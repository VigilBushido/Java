
public class isSquare {
	// indicates if the quadrilateral is a square
	/**
	public boolean isSquare{
	return areAllSidesSameLength() && areAllRightAngles();
	}
	**/
	public double length(double p1 , double p2){
		double length = p1 - p2;
		return length;
	}
	
	public boolean areAllEqual(double a, double b, double c, double d) {
		return a == b && a == c && a == d;
	}
	
	// call to isRectangle();
	private boolean areAllSidesSameLength(double p1, double p2, double p3, double p4) {
	double a = length(p1 , p2);
	double b = length(p2 , p3);
	double c = length(p3 , p4);
	double d = length(p4 , p1);
	
	return areAllEqual(a, b, c, d);
}}