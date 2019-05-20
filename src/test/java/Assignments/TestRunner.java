package Assignments;



//import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		
	
		features = { "src\\test\\java\\resources\\FeatureTest.feature" },

		glue= {"src\\test\\java\\Assignments\\StepDefinition.java"},
		format={"pretty"},
		tags= {"@RegressionTest,@SmokeTest, @SmokeTest1, @SmokeTest2, @SmokeTest3"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}