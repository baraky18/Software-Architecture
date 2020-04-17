package principles;

import java.io.File;

/*
 * every module or class should have responsibility over a single part of the functionality provided by the software, 
 * and that responsibility should be entirely encapsulated by the class, module or function. 
 * All its services should be narrowly aligned with that responsibility
 */
public class SingleResponsibility {

	/*
	 * PRINCIPLE NOT MET EXAMPLE:
	 * class Task has multiple responsibilities. we cannot reuse this class anywhere else
	 */
	public class Task{
		
		public void downloadFile(String location){}
		
		public void parseTheFile(File file){}
		
		public void persistTheData(Object data){}
	}
	
	/*
	 * PRINCIPLE MET EXAMPLE:
	 * each class has one responsibility and therefore, can be reused
	 */
	public class DownloadFile{}
	
	public class ParseTheFile{}
	
	public class PersistTheData{}
}
