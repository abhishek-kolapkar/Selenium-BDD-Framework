package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "../features", glue = "steps", monochrome = true)

public class testRunner extends AbstractTestNGCucumberTests {
}
