package managers;

public class dACSV {

	
	private static dACSV instance = null;
	
	 public String s;
	 
	private dACSV() {
		
		
		 s ="shivsandesh shete";
		
	}
	
	public static dACSV getInstance() {
		
		
		if (instance==null) {
			
			dACSV obj = new dACSV();
			
			return instance;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
