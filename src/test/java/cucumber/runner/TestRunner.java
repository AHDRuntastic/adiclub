package cucumber.runner;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import adidasRuntastic.base.TestBase;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/AdiClub.feature",
        glue = {"cucumber/stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-report.json"},
        monochrome = true
)
public class TestRunner extends TestBase {
}
