package principles;

/*
 * no client should be forced to depend on methods it does not use. 
 * this principle splits interfaces that are very large into smaller and more specific ones 
 * so that clients will only have to know about the methods that are of interest to them. 
 * this principle is intended to keep a system decoupled and thus easier to refactor, change, and redeploy
 */
public class InterfaceSegregation {

	/*
	 * PRINCIPLE NOT MET EXAMPLE:
	 * since Animal class has groom method that don't apply to Tiger class (since we are not grooming a wild animal),
	 * the Tiger class will have a dummy implementation of that method
	 */
	public abstract class Animal1{
		
		public abstract void feed();
		public abstract void groom();
	}
	
	public class Dog1 extends Animal1{

		@Override
		public void feed() {
			//implementation
		}

		@Override
		public void groom() {
			//implementation
		}
	}
	
	public class Tiger1 extends Animal1{

		@Override
		public void feed() {
			//implementation
		}

		@Override
		public void groom() {
			//dummy implementation
		}
	}
	
	public abstract class Animal2{
		
		public abstract void feed();
	}
	
	/*
	 * PRINCIPLE MET EXAMPLE:
	 * Pet class should extend Animal class and present an abstract method groom. Dog will extend Pet 
	 * and Tiger will extend Animal
	 */
	public abstract class Pet extends Animal2{
		
		public abstract void groom();
	}
	
	public class Dog2 extends Pet{

		@Override
		public void feed() {
			//implementation
		}

		@Override
		public void groom() {
			//implementation
		}
	}
	
	public class Tiger2 extends Animal2{

		@Override
		public void feed() {
			//implementation
		}
	}
}
