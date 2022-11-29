package com.HomeTasks.Factory;

public class ChromeDriver implements Driver{
    @Override
    public void initializeDriver() {
        System.out.println("Initialized Chrome Driver");
    }
}
