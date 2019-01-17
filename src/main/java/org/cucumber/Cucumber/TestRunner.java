package org.cucumber.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\sb61\\eclipse-workspace\\sivaws\\Cucumber\\src\\AddTariff.feature", glue = {
		"C:\\Users\\sb61\\eclipse-workspace\\sivaws\\Cucumber\\src\\main\\java\\org\\cucumber\\Cucumber" }, plugin = {
				"html:target" })

public class TestRunner {

}
