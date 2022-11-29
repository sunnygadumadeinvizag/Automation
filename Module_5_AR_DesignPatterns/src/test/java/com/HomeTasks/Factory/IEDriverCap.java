package com.HomeTasks.Factory;

public class IEDriverCap implements Driver{
    @Override
    public void initializeDriver() {
        System.out.println("Initialized IE Driver with Capabilties");
    }
}
