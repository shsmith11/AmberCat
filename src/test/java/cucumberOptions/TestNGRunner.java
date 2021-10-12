package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        tags = "@MobileTest or @RegTest",
        monochrome = true, // detailed report in output
        plugin = {"pretty", "html:target/cucumber.html"})  //pretty activates html report
public class TestNGRunner extends AbstractTestNGCucumberTests {


}
