package com.HomeTasks.Strategy;

public class SharePhotoText implements SharePhoto{
    @Override
    public void sharePhotoTo() {
        System.out.println("Share photo by Text");
    }
}
