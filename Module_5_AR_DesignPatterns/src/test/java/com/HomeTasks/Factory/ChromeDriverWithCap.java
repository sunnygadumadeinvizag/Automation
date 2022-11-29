package com.HomeTasks.Factory;

public class ChromeDriverWithCap implements Driver{
    @Override
    public void initializeDriver() {
        System.out.println("Initialized Chrome Driver with capabilities");
    }
}
