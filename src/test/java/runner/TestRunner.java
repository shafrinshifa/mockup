package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:Features"}, glue = "stepDef",
                 monochrome = true,
                 dryRun = !true,
                 tags="",
				 plugin = {"pretty",
						    "html:target/cucumber-reports/Cucumber.html",
						    "json:target/cucumber-reports/Cucumber.json"})
public class TestRunner {

}
