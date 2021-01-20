package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        tags={"@SmokeTest"},
        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinitions"},
        dryRun = false,
        plugin = { //basit rapor oluşturan plugin
                "html:target/cucumber-report",
                "json:target/cucumber.json"}
)

public class RunSmokeTests extends AbstractTestNGCucumberTests {

}
