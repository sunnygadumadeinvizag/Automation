package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import DriverManager.*;

public class Hooks {
    private  WebDriver driver;
    WebDriverInstance dri;
    @Before
    public void instatiateDriver(){
        dri= WebDriverInstance.getInstance();
        driver=dri.getDriver();
    }
    @After
    public void closeDriver(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) dri.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        dri.closeDriver();
    }
}
