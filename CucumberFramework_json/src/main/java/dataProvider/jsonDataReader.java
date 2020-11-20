package dataProvider;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import com.google.gson.Gson;

import testDataTypes.Customer;

public class jsonDataReader {
	
	
	
	private List<Customer> getCustomerData(){
		
		
		
		Gson gson = new Gson();
		
		BufferedReader reader = null;
		
		reader = new BufferedReader(new FileReader(customerFilePath));
		
		
		Customer[] customerData =  gson.fromJson(reader, Customer[].class);
		
		
	}
	
	
	 private List<Customer> getCustomerData() {
		 Gson gson = new Gson();
		 BufferedReader bufferReader = null;
		 try {
		 bufferReader = new BufferedReader(new FileReader(customerFilePath));
		 Customer[] customers = gson.fromJson(bufferReader, Customer[].class);
		 return Arrays.asList(customers);
		 }catch(FileNotFoundException e) {
		 throw new RuntimeException("Json file not found at path : " + customerFilePath);
		 }finally {
		 try { if(bufferReader != null) bufferReader.close();}
		 catch (IOException ignore) {}
		 }
		 }
		 
		 public final Customer getCustomerByName(String customerName){
		 return customerList.stream().filter(x -> x.firstName.equalsIgnoreCase(customerName)).findAny().get();
		 }
		 
		 
		}
	

}
