import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"hooks", "PageObject.PageSteps", "PageObject.PageElements"},
        features = "src/test/resources/features",
        tags = "@all"
)

public class RunnerTest {
}