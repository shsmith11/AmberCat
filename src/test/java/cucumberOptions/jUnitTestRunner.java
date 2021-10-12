package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/features",
            glue = "stepDefinitions",
            stepNotifications = true,
            tags = "@RegTest and @SmokeTest",
            plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml"})  //pretty activates html report

    public class jUnitTestRunner {

}
