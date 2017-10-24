 package com.suite;


import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

	// runner class
	
@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(features = {"src\\main\\resources\\com\\suite\\"},plugin={"pretty","html:target/site/cucumber-pretty",
		"json:target/cucumber.jason"},tags = {"~@ignore"})
	public class Runner {
	
		
		
	
		
	
}
