package com.HomeTasks.Factory;

public class FirefoxDriver implements Driver{
    @Override
    public void initializeDriver() {
        System.out.println("Initialized FIrefox Driver");
    }
}
