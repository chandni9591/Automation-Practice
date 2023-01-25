package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/FeatureWithTags",
        glue = {"StepDefinitions"},
      //  tags = {"@smoke","@regression"} // depricated
        //tags = "@smoke or @regression"
        //tags = "@smoke and @regression"
       // tags= "@smoke or @regression) and @important"
       tags = "@regression and not @smoke"
        //tags = "(@smoke or @regression) and not @important"

        //monochrome = true,
        //plugin = {"pretty", "json:target/JSONReports/report.json",
               // "html:target/HTMLReports"
         )
public class TestRunnerWithSingleTag {
}
