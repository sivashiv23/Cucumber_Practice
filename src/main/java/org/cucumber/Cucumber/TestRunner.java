package org.cucumber.Cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sb61\\eclipse-workspace\\sivaws\\Cucumber\\src\\CheckCredit.feature", glue = {
		"org.cucumber.Cucumber" }, plugin = { "html:target" })

public class TestRunner {

}
