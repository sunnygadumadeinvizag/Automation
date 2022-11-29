package com.HomeTasks.Strategy;

public class SharePhotoContext {
    private  SharePhoto sharePhoto;

    public void setSharePhoto(SharePhoto photo){
        this.sharePhoto=photo;
    }

    public void sharePhoto(){
        sharePhoto.sharePhotoTo();
    }
}
