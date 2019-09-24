package cucumber1.test1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"json:src/test/java/cucumber1/test1/output/cucumber.json"}
		
		
		)


public class runnerfile {
	

}
