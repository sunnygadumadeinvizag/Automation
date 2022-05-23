package StepDefinitions;

import DriverManager.WebDriverInstance;
import org.openqa.selenium.WebDriver;

public class BaseDefinitions {
    public WebDriver driver;
    public BaseDefinitions(){
        driver= WebDriverInstance.getInstance().getDriver();
    }
}
