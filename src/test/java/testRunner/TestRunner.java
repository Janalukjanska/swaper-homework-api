package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/feature/SwaperFeature.feature", // Path to feature files
        glue = {"stepDefinitions"}, // Path to step definitions
        plugin = {"pretty"} // Output format
)
public class TestRunner {
    // This class is used to configure and run Cucumber tests
}