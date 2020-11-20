package Shiv_Maven.com.maven.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.java.StepDefAnnotation;

import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

@CucumberOptions(features = "Feature_Two",glue = {"stepDefinition"})


public class App 
{
   }
