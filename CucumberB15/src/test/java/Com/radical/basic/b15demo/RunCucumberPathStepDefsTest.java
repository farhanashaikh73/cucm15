package Com.radical.basic.b15demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/Com/radical/basic/b15demo/CucumberPath.feature/"},
		glue={"Com/radical/basic/b15demo/"} //----folder path
		
		)


public class RunCucumberPathStepDefsTest {

}
