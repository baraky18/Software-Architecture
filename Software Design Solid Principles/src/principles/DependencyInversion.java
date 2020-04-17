package principles;

/*
 * Abstractions should not depend on concrete implementations. 
 * concrete implementations should depend on abstractions.
 */
public class DependencyInversion {

	/*
	 * PRINCIPLE NOT MET EXAMPLE:
	 * when copying input to a certain device we depend on concrete implementation (while loop)
	 */
	enum outputDevice {printer, disk};
	
	public void copy(outputDevice device){
		int c = 0;
		while((c == readKeyboard()) != endOfFile()){
			if(device == outputDevice.printer){
				writePrinter(c);
			}
			else{
				writeDisk(c);
			}
		}
	}

	private void writeDisk(int c) {
		//implementation
	}

	private void writePrinter(int c) {
		//implementation
	}

	private boolean endOfFile() {
		//implementation
		return false;
	}

	/*
	 * PRINCIPLE MET EXAMPLE:
	 * now, each concrete class that will implement Reader and Writer interfaces 
	 * will be able to use the copy method without changing it. so the concrete implementation (while loop) depends on interfaces
	 */
	public void copy(Reader reader, Writer writer){
		char c = 0;
		while((c==reader.read()) != endOfFile()){
			writer.write(c);
		}
	}
	
	private int readKeyboard() {
		//implementation
		return 0;
	}
	
	public interface Writer{
		public char write(char c);
	}
	
	public interface Reader{
		public char read();
	}
}
