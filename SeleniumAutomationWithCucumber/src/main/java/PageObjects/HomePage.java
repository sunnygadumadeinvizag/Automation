package PageObjects;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    final String loginButtonXpath="//*[@class=\"login\"]";
    public void clickOnLoginButton(){
        wt.waitUntilElementIsClickable(driver.findElement(By.xpath(loginButtonXpath)),20);
        driver.findElement(By.xpath(loginButtonXpath)).click();
    }
}
