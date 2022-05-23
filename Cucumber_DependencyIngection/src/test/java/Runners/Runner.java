package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = {"stepdefinitions"},
        plugin= {"pretty","html:target/cucumber-reports","json:target/cucumber.json"})

public class Runner extends AbstractTestNGCucumberTests {

}
