package otherprinciples;

/*
 * A tightly coupled object is an object that needs to know about other objects 
 * and is usually highly dependent on each other's interfaces.
 * Changing one object in a tightly coupled application often requires changes to a number of other objects
 * Loose coupling is a design goal to reduce the inter-dependencies between components of a system 
 * with the goal of reducing the risk that changes in one component will require changes in any other component
 */
public class TightlyLooslyCoupled {

	/*
	 * PRINCIPLE NOT MET EXAMPLE:
	 * Car and Bus has unique methods, so in order to call them, the client has to create specific instances of them.
	 * so if in the future, a new travel option will be added, the client has to change also (add if statement)
	 */
	public class Car{
		public void goByCar() {
			System.out.println("going by car");
		}
	}
	
	public class Bus{
		public void goByBus() {
			System.out.println("going by bus");
		}
	}
	
	public class Journey{
		public void startJourney(boolean byCar){
			if(byCar){
				Car car = new Car();
				car.goByCar();
			}
			else{
				Bus bus = new Bus();
				bus.goByBus();
			}
		}
	}
	
	/*
	 * PRINCIPLE MET EXAMPLE:
	 * Car and Bus has are implementing the Travel class now, so in order to call them, 
	 * the client has to obtain their interfaces so it doesn't really know, which object is passed on to it (Car or Bus).
	 * so if in the future, a new travel option will be added, the client doesn't have to change at all.
	 */
	public interface Travel{
		void go();
	}
	
	public class Car1 implements Travel{
		@Override
		public void go() {
			System.out.println("going by car");
		}
	}
	
	public class Bus1 implements Travel{
		@Override
		public void go() {
			System.out.println("going by bus");
		}
	}
	
	public class Journey1 {
		Travel travel;

		public void startJourney(){
			travel.go();
		}
		
		public Travel getTravel() {
			return travel;
		}

		public void setTravel(Travel travel) {
			this.travel = travel;
		}
	}

}
