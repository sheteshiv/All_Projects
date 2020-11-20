package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;






public class configFileReader {

	private Properties properties;
	private final String propertyFilePath = "configs/Configuration.properties";

	public configFileReader() {

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));

			properties = new Properties();

			try {
				properties.load(reader);
			}

			catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			throw new RuntimeException("Properties file not found at the path" + propertyFilePath);
		}

		finally {

			try {

				if (reader != null) {

					reader.close();

				}

			} catch (IOException ignore) {

			}

		}

	}

	
	public String getDriverPath() {
		
		
		String driverPath =  properties.getProperty("driverPath");
		
		
		if (driverPath!=null) {
			
			return driverPath;
			
		}
		
		else {
			
			throw new RuntimeException("DriverPath is not specified in the Configuration.properties file");
		}
	}
	
	
	
	
	public long getImplicitlyWait() {

		String implicitlyWait = properties.getProperty("implicitlyWait");

		if (implicitlyWait != null) {

			try {
				return Long.parseLong(implicitlyWait);
			}

			catch (NumberFormatException e) {
				throw new RuntimeException("Not able to parse the value" + implicitlyWait + "into the Long");
			}
		}
		return 30;

	}

	public String getApplicationurl() {
		
		
		String appUrl = properties.getProperty("url");
		
		if (appUrl!=null) {
			
			return appUrl;
		}
		
		else {
				throw new RuntimeException("Application URL not specified in the Configuration.properties file");
		}
	}

	public DriverType getBrowser() {
		
		
		String browserName = properties.getProperty("browser");
		 if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		 else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		 else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		 else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
		
	}


	 
	 
	
	public EnvironmentType getEnvironment() {
		
				String environmentName = properties.getProperty("environment");
		
		if (environmentName==null || environmentName.equalsIgnoreCase("local")) {
			
			return  EnvironmentType.LOCAL;
			
		}
		
		else if (environmentName.equalsIgnoreCase("remote")) {
			
			return EnvironmentType.REMOTE;
			
		}
		else {
			throw new RuntimeException("Environment type key value is not matched"+environmentName);
		}
	}
	
	
	
	public boolean getWindowSize() {
		
		String windowSize = properties.getProperty("windowMaximize");
		
		if (windowSize!=null) {
			
			return Boolean.valueOf(windowSize);
			
		}
		
	}
	
	
	
	public String getTestDataResourcePath() {
		
		String testDataResourcePath = properties.getProperty("testDataResourcePath");
		
		if (testDataResourcePath!=null) {
			
			return testDataResourcePath;
			
			
		}
		
		else {
			throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties");
		}
		
	}

}
