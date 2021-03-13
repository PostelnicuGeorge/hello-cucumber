package ro.agile_testing.hello_cucumber.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ro.agile_testing.hello_cucumber.services.IsItFriday;

import static org.testng.Assert.assertEquals;

public class StepDefinitions {
	private String today;
	private String actualAnswer;

	@Given("today is {string}")
	public void today_is(String today) {
		logLine();
		this.today = today;
	}

	private void logLine() {
		System.out.println(Thread.currentThread().getId() + "_" + Thread.currentThread().getName());
	}

	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
		logLine();
		actualAnswer = IsItFriday.isItFriday(today);
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String expectedAnswer) {
		logLine();
		assertEquals(expectedAnswer, actualAnswer);
	}

	@When("I ask whether it's a special day")
	public void iAskWhetherItSASpecialDay() {
		logLine();
		actualAnswer = IsItFriday.isItSpecial(today);
	}
}
