package com.model;

/**
 * Created with IntelliJ IDEA.
 * User: jhernandez
 * Date: 6/5/13
 * Time: 12:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class ComercioPan {

    private float latitude;
    private float longitude;
    private String name;

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComercioPan() {

    }

    public ComercioPan(float latitude, float longitude, String name)
    {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;

    }

}
