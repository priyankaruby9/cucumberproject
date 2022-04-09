package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		plugin= {"html:target/html-cucumber","json:target/cucumber.jason"},//use this to get report
		features="src/test/java/features",
		//tags= {"@F_1234"}, //to run feature file
		tags = {"@Sanity"},  //to run one single Tag
		        
		//tags = {"@Sanity,@Regression"}, //to run multiple tags using OR
		//tags = {"@Sanity or @Regression"}, //to run multiple tags using OR
		        
		//tags = {"@Regression","@Rapid"}, //to run multiple tags using And
		//tags = {"@Regression and @Rapid"}, //to run multiple tags using And
		//tags = {"not @Sanity"} , //dont run sanity
		//tags = {"@Regression and not @Ignore"},//run regression only
		//tags= {"@Sanity or (@Regression and @Rapid)"},
		glue={"stepDefs"}
		)

public class TestRunner {
	

}
