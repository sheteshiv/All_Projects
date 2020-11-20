package com.propDemoCucumber.demo.Shiv_Maven_Properties;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features = "featuresFiless",glue = {"stepDefinition"})


public class TestRunner 
    
{
    
}
