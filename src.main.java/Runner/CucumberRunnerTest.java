package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features={"featuresfile/Login.feature"},
		glue={"Steps"},
		plugin={"pretty","html:testreport"},
		monochrome = true,
		tags={"@SmokeTest,@Regression"}
		)
public class CucumberRunnerTest {	

}