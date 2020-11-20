package MavenWIthJenkins.MavenWIthJenkins;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)

@CucumberOptions(features= "Features",glue = {"src/test/java/wordpressSteps"})




public class TestRunner {

}
