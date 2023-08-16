package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Invalid {


@Given("enter username1 and password1")
public void enter_username1_and_password1() {
 
	System.out.println("kumar1");
}
@When("enter submit1")
public void enter_submit1() {
	System.out.println("ajay1");
}
@Then("validate username1 and password1")
public void validate_username1_and_password1() {
	System.out.println("matam1");
}

}
