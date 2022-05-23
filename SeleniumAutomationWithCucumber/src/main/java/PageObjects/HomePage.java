package PageObjects;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    final String loginButtonXpath="//span[text()=\"Login\"]/../../button";
    final String usernameXpath="//span[text()=\"Enter Email/Mobile number\"]/../../input";
    final String passwordXpath="//span[text()=\"Enter Password\"]/../../input";
    public void clickOnLoginButton(){
        wt.waitUntilElementIsClickable(driver.findElement(By.xpath(loginButtonXpath)),20);
        driver.findElement(By.xpath(loginButtonXpath)).click();
    }
    public void enterUserName(String userName){
        wt.waitUntilElementIsVisible(driver.findElement(By.xpath(usernameXpath)),20);
        driver.findElement(By.xpath(usernameXpath)).sendKeys(userName);
    }
    public void enterPassword(String password){
        wt.waitUntilElementIsVisible(driver.findElement(By.xpath(passwordXpath)),20);
        driver.findElement(By.xpath(passwordXpath)).sendKeys(password);
    }
}
