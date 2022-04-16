package MyTestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
         features = ".//Features/Winbet.feature",
         glue = "MyStepsDefinitions",
         //dryRun = false,
         plugin = {"pretty", "html:test-output"}
        )


public class TestRunner
{

}
