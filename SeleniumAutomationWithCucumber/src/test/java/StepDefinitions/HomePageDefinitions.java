package StepDefinitions;

import DriverManager.WebDriverInstance;
import PageObjects.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageDefinitions {
    HomePage hmp=new HomePage();


    @When("I click on sign-in button")
    public void clickOnsign(){
        //hmp=new HomePage();
        hmp.clickOnLoginButton();
    }
    @When("I enter username as {string}")
    public void enterUserNames(String userName){
        hmp.enterUserName(userName);
    }

    @Then("Verify Login is Successful")
    public void verifyLogin(){
        Assert.assertEquals("",WebDriverInstance.getInstance().getDriver().getTitle());
    }

    @When("I enter password as {string}")
    @When("I enter below password")
    public void enterPassword(String password){
        hmp=new HomePage();
        hmp.enterPassword(password);
    }
}
