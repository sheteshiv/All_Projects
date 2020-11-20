package managers;

public class FileReaderManager {
	
	
	private static FileReaderManager fileReadmanager = new FileReaderManager();
	
	
	
	private FileReaderManager() {
		
		
		
		
	}
	
	
	public static FileReaderManager getInstance() {
		
		
		return fileReadmanager;
				
	}

}
