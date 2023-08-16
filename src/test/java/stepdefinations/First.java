package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First {

	@Given("enter username and password")
	public void enter_username_and_password() {
	   System.out.println("ajay");
	}
	@When("enter submit")
	public void enter_submit() {
	  
		System.out.println("kumar");
	}
	@Then("validate username and password")
	public void validate_username_and_password() {
	   
		System.out.println("matam");
	}

}
