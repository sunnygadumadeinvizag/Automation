package com.HomeTasks.Factory;

public class DriverFactory {
    public static Driver initiateDriver(String browser){
        Driver driver=null;
        if(browser.equalsIgnoreCase("chrome"))
            driver=new ChromeDriver();
        else if (browser.equalsIgnoreCase("firefox"))
            driver=new FirefoxDriver();
        else if (browser.equalsIgnoreCase("IE"))
            driver=new IEDriver();
        else if(browser.equalsIgnoreCase("chromecap"))
            driver=new ChromeDriverWithCap();
        else if (browser.equalsIgnoreCase("firefoxcap"))
            driver=new FirefoxDriverWithCap();
        else if (browser.equalsIgnoreCase("IEcap"))
            driver=new IEDriverCap();

        return driver;


    }
}
