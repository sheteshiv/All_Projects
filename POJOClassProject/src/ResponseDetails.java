import java.io.IOException;
import java.util.ArrayList;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.core.JsonParseException;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.JsonMappingException;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseDetails {

	
	public PersonDetails personDetails;
	
	public ArrayList<ContactDetails> contactDetails;

	public PersonDetails getPersonDetails() {
		return personDetails;
	}

	public void setPersonDetails(PersonDetails personDetails) {
		this.personDetails = personDetails;
	}

	public ArrayList<ContactDetails> getContactDetails() {
		
		return contactDetails;
	}

	public void setContactDetails(ArrayList<ContactDetails> contactDetails) {
		this.contactDetails = contactDetails;
	}
	
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		ResponseDetails response = new ResponseDetails();
		response=mapper.readValue("C:\\Users\\TLP 62\\Desktop\\Details.json", ResponseDetails.class);
		
		response.getContactDetails().get(1).getLandline();
		response.getContactDetails().get(1).setLandline("XYZ");
		response.getPersonDetails().getFname();
		response.getPersonDetails().setLname("shete");
		
	}
	
}