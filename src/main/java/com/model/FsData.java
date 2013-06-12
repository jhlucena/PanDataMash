package com.model;

/**
 * Created with IntelliJ IDEA.
 * User: jhernandez
 * Date: 6/6/13
 * Time: 11:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class FsData {

    private int county_fips;
    private float percent;

    public FsData(int anInt, float aFloat) {
        county_fips = anInt;
        percent = aFloat;
    }

    public int getCounty_fips() {
        return county_fips;
    }

    public void setCounty_fips(int county_fips) {
        this.county_fips = county_fips;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }
}
