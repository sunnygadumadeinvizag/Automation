package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.When;

public class HomePageDefinitions {
    HomePage hmp;
    public HomePageDefinitions(){
        hmp=new HomePage() ;
    }

    @When("I click on sign-in button")
    public void clickOnsign(){
        hmp.clickOnLoginButton();
    }
}
