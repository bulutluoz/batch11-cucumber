package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber_reports.html"},
        features="src/test/resources/features",
        glue="stepdefinitions",
        dryRun = false,
        tags="@wip"
)

public class Runner {

}
