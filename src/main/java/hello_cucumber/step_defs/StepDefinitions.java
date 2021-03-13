package hello_cucumber.step_defs;

import hello_cucumber.services.IsItFriday;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

public class StepDefinitions {
	private String today;
	private String actualAnswer;

	@Given("today is {string}")
	public void today_is(String today) {
		this.today = today;
	}

	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
		actualAnswer = IsItFriday.isItFriday(today);
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String expectedAnswer) {
		assertEquals(expectedAnswer, actualAnswer);
	}

	@When("I ask whether it's a special day")
	public void iAskWhetherItSASpecialDay() {
		actualAnswer = IsItFriday.isItSpecial(today);
	}
}
