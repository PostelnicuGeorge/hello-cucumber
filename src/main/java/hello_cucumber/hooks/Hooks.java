package hello_cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void before(Scenario scenario) {
		logLine("Before :: ", scenario);
	}

	@After
	public void after(Scenario scenario) {
		logLine("After :: ", scenario);
	}

	private void logLine(String prefix, Scenario scenario) {
		System.out.println(prefix + Thread.currentThread().getName() + " :: " + scenario.getName());
	}
}
