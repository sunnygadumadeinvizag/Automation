package com.HomeTasks.Strategy;

public abstract class CameraApp {
    void takePhoto(){
        System.out.println("Take a Photo");
    };
    abstract void editPhoto();
    void savePhoto(){
        System.out.println("Save a Photo");
    };
    void sharePhoto(SharePhoto sharePhoto){
        sharePhoto.sharePhotoTo();
    };
}
