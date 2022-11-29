package com.HomeTasks.Strategy;

public class Runner {
    public static void main(String[] args) {
        CameraApp cameraPlusApp=new CameraPlusApp();
        CameraApp basicCamerApp=new BasicCameraApp();
        SharePhotoContext sharePhotoContext=new SharePhotoContext();
        cameraPlusApp.takePhoto();
        cameraPlusApp.savePhoto();
        cameraPlusApp.editPhoto();
        sharePhotoContext.setSharePhoto(new SharePhotoEmail());
        sharePhotoContext.sharePhoto();
        sharePhotoContext.setSharePhoto(new SharePhotoText());
        sharePhotoContext.sharePhoto();
        sharePhotoContext.setSharePhoto(new SharePhotoSocialMedia());
        sharePhotoContext.sharePhoto();

        basicCamerApp.takePhoto();
        basicCamerApp.savePhoto();
        basicCamerApp.editPhoto();
        sharePhotoContext.setSharePhoto(new SharePhotoEmail());
        sharePhotoContext.sharePhoto();
        sharePhotoContext.setSharePhoto(new SharePhotoText());
        sharePhotoContext.sharePhoto();
        sharePhotoContext.setSharePhoto(new SharePhotoSocialMedia());
        sharePhotoContext.sharePhoto();

    }
}
