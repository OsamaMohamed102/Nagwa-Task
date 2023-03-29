package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/Features",
        glue = "StepsDef",
        tags = "@Valid",
        plugin = {"pretty","html:target/cucmber report.html"

        }
)
public class runner extends AbstractTestNGCucumberTests {
}
