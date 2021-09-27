package com.ilongross.patterns.structural.facade;

public class WindowPlan {

    private float width;
    private float height;
    private String profileName;
    private String glassType;

    public WindowPlan(float width, float height, String profileName, String glassType) {
        this.width = width;
        this.height = height;
        this.profileName = profileName;
        this.glassType = glassType;
    }

    @Override
    public String toString() {
        return "WindowPlan{" +
                "width=" + width +
                ", height=" + height +
                ", profileName='" + profileName + '\'' +
                ", glassType='" + glassType + '\'' +
                '}';
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getGlassType() {
        return glassType;
    }

    public void setGlassType(String glassType) {
        this.glassType = glassType;
    }


}
