package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {

	 @Given("^user lands at the page with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_lands(String arg1,String arg2)
	{
		System.out.println(arg1+" "+arg2);
	}
	
	
	@When("^he enter his details$")
	public void user_enters()
	{
		System.out.println("when");
	}
	
	@Then("^he gets a success message$")
	public void success_message()
	{
		System.out.println("then");
	}
	
	@Then("^he gets a failure message$")
	public void failure_message()
	{
		System.out.println("then");
	}
	
	@And("^he becomes happy$")
	public void happy()
	{
		System.out.println("and");
	}
	
}



