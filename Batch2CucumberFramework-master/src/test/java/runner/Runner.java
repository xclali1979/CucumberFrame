package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = { "pretty", "json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/Cucumber.xml","html:target/cucumber-reports" },
        features ="src/test/resources/uiFeatures",
        glue = "stepDefs",
        dryRun =false,
        tags = "@TEC-201"
)
public class Runner {
}
