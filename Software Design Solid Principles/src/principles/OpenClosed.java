package principles;

/*
 * software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification. 
 * that is, such an entity can allow its behavior to be extended without modifying its source code.
 */
public class OpenClosed {

	/*
	 * PRINCIPLE NOT MET EXAMPLE:
	 * class Shape shouldn't calculate area for it's extensions since if tomorrow we will need to add a new shape
	 * (for e.g Square), we will need to change class Shape
	 */
	public class Shape1{
		public double area(Shape1[] shapes){
			double area = 0;
			for (Shape1 shape : shapes) {
				if(shape instanceof Rectangle1){
					Rectangle1 rectangle = (Rectangle1) shape;
					//calculate area for rectangle
				}
				else{
					Circle1 circle = (Circle1) shape;
					//calculate area for circle
				}
			}
			return area;
		}
	}

	public class Rectangle1 extends Shape1{}

	public class Circle1 extends Shape1{}

	/*
	 * PRINCIPLE MET EXAMPLE:
	 * if I want to add a new shape, I don't need to change any area method, 
	 * I am just creating a new class that's extends Shape class and implementing the abstract method of Shape.
	 * so I am CLOSED for modification, but OPEN for extension
	 */
	public abstract class Shape2{

		public abstract double area();
	}

	public class Rectangle2 extends Shape2{

		@Override
		public double area() {
			double area = 0;
			//calculate area of rectangle
			return area;
		}
	}

	public class Circle2 extends Shape2{

		@Override
		public double area() {
			double area = 0;
			//calculate area of circle
			return area;
		}
	}






}
