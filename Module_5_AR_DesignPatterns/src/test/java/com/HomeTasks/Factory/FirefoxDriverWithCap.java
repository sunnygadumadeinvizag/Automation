package com.HomeTasks.Factory;

public class FirefoxDriverWithCap implements Driver{
    @Override
    public void initializeDriver() {
        System.out.println("Initialized FIrefox Driver with Capabilities");
    }
}
