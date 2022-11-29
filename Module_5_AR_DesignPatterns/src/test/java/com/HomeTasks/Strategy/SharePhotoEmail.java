package com.HomeTasks.Strategy;

public class SharePhotoEmail implements SharePhoto{
    @Override
    public void sharePhotoTo() {
        System.out.println("Share photo by Email");
    }
}
