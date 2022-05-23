package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:features", glue = {"classpath:StepDefinitions"},
        plugin= {"pretty","html:target/cucumber-reports/cucuberreport.html","json:target/cucumber/cucumber.json"})

public class Runner extends AbstractTestNGCucumberTests {

}
