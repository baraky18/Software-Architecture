package principles;

/*
 * if T1 is a sub type of T, then objects of type T may be substituted with objects of type T1 
 * without altering any of the desirable properties of the program
 */
public class LiskovSubstitution {

	/*
	 * PRINCIPLE NOT MET EXAMPLE:
	 * Square cannot extend Rectangle only because it has also height and width. when calculating an area for example,
	 * the calculation is different. so, we cannot substitute Rectangle with Square.
	 */
	public static void main(String[] args){
		LiskovSubstitution liskovSubstitution = new LiskovSubstitution();
		Rectangle1 rectangle = liskovSubstitution.new Rectangle1();
		rectangle.setHeight(4);
		rectangle.setWidth(5);
		double area = rectangle.getHeight()*rectangle.getWidth()/2;
	}
	
	public class Square1 extends Rectangle1{}

	public class Rectangle1{

		private double height;
		private double width;

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}
	}
	
	/*
	 * PRINCIPLE MET EXAMPLE:
	 * create Shape abstract class and make Rectangle and Square extends it and implement area method differently
	 */
	
	public abstract class Shape{

		public abstract double area();
	}

	public class Rectangle2 extends Shape{

		@Override
		public double area() {
			double area = 0;
			//calculate area of rectangle
			return area;
		}
	}

	public class Square2 extends Shape{

		@Override
		public double area() {
			double area = 0;
			//calculate area of square
			return area;
		}
	}
}
