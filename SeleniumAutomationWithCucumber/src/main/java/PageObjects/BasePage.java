package PageObjects;

import org.openqa.selenium.WebDriver;
import DriverManager.WebDriverInstance;
import utils.WaitUtils;

public class BasePage{
    public WebDriver driver;
    WebDriverInstance dri=WebDriverInstance.getInstance();
    WaitUtils wt;
    public BasePage(){
        driver= dri.getDriver();
        wt=new WaitUtils();
    }
}
