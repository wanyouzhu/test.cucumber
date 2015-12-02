package cn.com.servision.cucumbertest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;
import cucumber.api.java.en.*;

public class SampleFeatureSteps {
	private Accumulator accumulator;

	@Given("^I have an empty accumulator$")
	public void iHaveAnEmptyAccumulator() throws Throwable {
		accumulator = new Accumulator();
		assumeThat(accumulator.accumulation(), is(0));
	}

	@When("^I enter a number (\\d+)$")
	public void iEnterANumber(int number) throws Throwable {
		accumulator.enter(number);
	}

	@Then("^The accumulation is (\\d+)$")
	public void theAccumulationIs(int expectation) throws Throwable {
		assertThat(accumulator.accumulation(), is(expectation));
	}
}
