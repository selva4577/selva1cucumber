package cucumber1.test1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
	
	@Given ("I enter 50 in this calculator")
public void abc()
{
		System.out.println("I enter 50 in this calculator");
}
	@And ("I press add")
	public void abc1()
	{
			System.out.println("I press add");
	}
	@And ("I have entered 50 in this calculator")
	public void abc2()
	{
			System.out.println("I have entered 50 in this calculator");
	}
    @When("I press equal symbol")
    public void abc3()
   {
		System.out.println("I press equal symbol");
   }
   @Then("The result should be 100 on the screen")
    public void abc4()
   {
		System.out.println("The result should be 100 on the screen");
   }
	
	

}
