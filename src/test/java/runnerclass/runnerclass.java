package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\vijay\\eclipse-workspace\\irctcnewusersignup\\src\\test\\resources\\featurefile",glue="stepdefinition")

public class runnerclass {

}
