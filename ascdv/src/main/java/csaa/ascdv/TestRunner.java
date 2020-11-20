package csaa.ascdv;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)

@CucumberOptions(features= "awsff",glue = {"/ascdv/src/test/java/csaa/ascdv"})




public class TestRunner {

}