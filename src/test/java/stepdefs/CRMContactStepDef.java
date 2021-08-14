package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMContactStepDef {
	@Given("user is logged in")
	public void user_is_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is logged in");
	}

	@When("user create a new contact")
	public void user_create_a_new_contact() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user create a new contact");
	}

	@When("user view contact details")
	public void user_view_contact_details() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user view contact details");
	}

	@When("user edit Contact details")
	public void user_edit_contact_details() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user edit Contact details");
	}

	@When("user delete a contact")
	public void user_delete_a_contact() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user delete a contact");
	}

	@When("user logout")
	public void user_logout() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user logout");
	}
	
	@Before("@FunctionalTest")
	public void setup() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Read from Property File");
	}
	
	@Before("@RegressionTest")
	public void setup_Regression() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Set up DB Connection");
	}
	
	@Before("@SmokeTest")
	public void setupSmoke() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Initialize Browser");
	}

}
