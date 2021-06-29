import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		// square test case
		Quadrilateral Shape = new Quadrilateral(new Point(-10,5), new Point(10,5), 
												new Point(10,-5), new Point(-10,-5));
		// rectangle test case
/*		Quadrilateral Shape = new Quadrilateral(new Point(-10,5), new Point(10,5), 
				new Point(10,-5), new Point(-10,-5));*/
		
		if (Shape.isSquare())
			System.out.println("This is a square");
		else if (Shape.isSquare() == false){
			System.out.println("This is not a square");
			if(Shape.isRectangle())
				System.out.println("This is a rectangle");
			else if (Shape.isRectangle() == false)
				System.out.println("This is not a rectangle either");		
				if(Shape.isParallelogram())
					System.out.println("Awesome! the angles added up , the lines are parallel");
				else if(Shape.isParallelogram() == false)
					System.out.println("Not a square, rectangle, or parallelogram");
			
		}
		/*
		else if(Shape.isRectangle())
			System.out.println("This is a rectangle");
		else if(Shape.isParallelogram();)
		System.out.println("This is a parallelogram");*/
	}

}
