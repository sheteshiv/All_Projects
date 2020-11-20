package Shiv_Maven.com.shiv.maven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "myFile", glue = {"/shiv/maven"})

public class TestRunner {

}
