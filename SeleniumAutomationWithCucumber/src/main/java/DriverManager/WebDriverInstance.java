package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebDriverInstance {
    private WebDriver driver = null;
    private static WebDriverInstance webDIns=null;
    private WebDriverInstance(){

    }
    public static WebDriverInstance getInstance(){
            if (webDIns==null){
                webDIns=new WebDriverInstance();
                return webDIns;
            }
            else{
                return webDIns;
            }

    }

    private void setUPDriver() {

        String gridURL = "http://localhost:4444/wd/hub";

        boolean status = false;

        String browser = "chrome";

        if (browser.equalsIgnoreCase("chrome")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "chrome");    //To specify the browser
            capabilities.setCapability("network", true);        // To enable network logs
            capabilities.setCapability("visual", true);    // To enable step by step screenshot
            capabilities.setCapability("video", true);            // To enable video recording
            capabilities.setCapability("console", true);        // To capture console logs
            try {
                driver = new RemoteWebDriver(new URL(gridURL), capabilities);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            } catch (MalformedURLException e) {
                System.out.println("Invalid grid URL");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (browser.equalsIgnoreCase("Firefox")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "Firefox");    //To specify the browser
            capabilities.setCapability("network", true);        // To enable network logs
            capabilities.setCapability("visual", true);        // To enable step by step screenshot
            capabilities.setCapability("video", true);        // To enable video recording
            capabilities.setCapability("console", true);        // To capture console logs
            try {
                driver = new RemoteWebDriver(new URL(gridURL), capabilities);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            } catch (MalformedURLException e) {
                System.out.println("Invalid grid URL");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }
    }
    public WebDriver getDriver(){
        if (this.driver==null || ((RemoteWebDriver)this.driver).getSessionId() ==null ){
            setUPDriver();
            return this.driver;
        }
        else
            return this.driver;
    }
    public void closeDriver(){
        if (this.driver!=null){
            this.driver.close();
            this.driver.quit();
        }
        //this.driver=null;

    }
}
