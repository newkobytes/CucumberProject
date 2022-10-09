package stepdefs;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CalculatorStepdef {

int result =0;
	
	@Given("I have a calculator")
	public void i_have_a_calculator() {
	    // Write code here that turns the phrase above into concrete actions
	   
		System.out.println("Calculator Opened");
	}

	@When("I add {int} and {int}")
	public void i_add_and(int int1, int int2) {
	    // Write code here that turns the phrase above into concrete actions
	    
		result = int1+int2;
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expResult) {
	    // Write code here that turns the phrase above into concrete actions
	    
		Assert.assertEquals(expResult, result);
	}
	
	@When("I add below numbers")
	public void i_add_below_numbers(List<Integer> numbers) {
		
		for(Integer num:numbers) {
			
			result = result +num;
		}
		
	}



}
