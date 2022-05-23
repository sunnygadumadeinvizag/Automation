package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import DriverManager.WebDriverInstance;

public class WaitUtils {
    public WebDriver driver= WebDriverInstance.getInstance().getDriver();
    WebDriverWait webwait;
    public void waitUntilElementIsClickable(WebElement ele,int timeout){
        webwait=new WebDriverWait(driver,timeout);
        webwait.until(ExpectedConditions.elementToBeClickable(ele));
    }
}
