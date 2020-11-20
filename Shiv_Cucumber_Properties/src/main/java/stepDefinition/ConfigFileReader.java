package stepDefinition;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	
	private Properties prop;
	
	private final String propFilePath = "Config/configure.properties";
	
	
	public void readPropFile() {
		
		try {
		BufferedReader br = new BufferedReader(new FileReader(propFilePath));
		
		 prop = new Properties();
		 
		 try {
		prop.load(br);
		
		br.close();
		 }
		 catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
			throw new RuntimeException("Not able to find the Properties filed at " +propFilePath);
		}
		
}
	
	public String getDriverPath() {
		
		String driverPath= prop.getProperty("driverPath");
		
		if(driverPath!=null) {
			
			return driverPath;
			
		}
		
		else {
			
			throw new RuntimeException("Not able to find the dripetPath in the configure.properties file");
		}
	}
	
	public long getImpWait() {
		
		String impWait =  prop.getProperty("implicitWait");
		
		if (impWait!=null) {
			
			return Long.parseLong(impWait);
			
			}
		
		else {
			
			throw new RuntimeException("Implicit wait not specified in the configure.properties file");
		}
	}
	
	public String getApplicationUrl() {
		
		String url = prop.getProperty("baseUrl");
		
		
		if (url!=null) {
			
			return url;
			
		}
		
		else {
			
			throw new RuntimeException("Url not specified in the configure.properties file");
		}
	}
	
}
