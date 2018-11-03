package com.webakruti.foodorder.Model;

import android.graphics.drawable.Drawable;


public class Restaurent {
    String restroName;
    String restroAddress;
    String restroType;
    Drawable foodImage;

    public Restaurent(String restroName, String restroAddress, String restroType, Drawable categoryImage) {
        this.restroName = restroName;
        this.restroAddress = restroAddress;
        this.restroType = restroType;
        this.foodImage = foodImage;
    }

    public String getRestroName() {
        return restroName;
    }

    public void setRestroName(String restroName) {
        this.restroName = restroName;
    }

    public String getRestroAddress() {
        return restroAddress;
    }

    public void setRestroAddress(String restroAddress) {
        this.restroAddress = restroAddress;
    }

    public String getRestroType() {
        return restroType;
    }

    public void setRestroType(String restroType) {
        this.restroType = restroType;
    }

    public Drawable getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(Drawable foodImage) {
        this.foodImage = foodImage;
    }
}
