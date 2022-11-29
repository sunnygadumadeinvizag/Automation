package com.HomeTasks.Factory;

public class DriverRunner {
    public static void main(String[] args) {
        DriverFactory.initiateDriver("chrome").initializeDriver();
        DriverFactory.initiateDriver("firefox").initializeDriver();
        DriverFactory.initiateDriver("IE").initializeDriver();
        DriverFactory.initiateDriver("chromecap").initializeDriver();
        DriverFactory.initiateDriver("firefoxcap").initializeDriver();
        DriverFactory.initiateDriver("IEcap").initializeDriver();
    }
}
