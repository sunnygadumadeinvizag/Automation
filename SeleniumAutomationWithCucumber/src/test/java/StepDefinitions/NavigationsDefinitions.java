package StepDefinitions;

import io.cucumber.java.en.Given;


public class NavigationsDefinitions extends BaseDefinitions{
    @Given("I navigate to flipkart website")
    public void nagivatetomainSite()   {
        driver.get("http://www.flipkart.com/");
    }
}
