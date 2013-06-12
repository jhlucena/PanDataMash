package com.model;

/**
 * Created with IntelliJ IDEA.
 * User: jhernandez
 * Date: 6/6/13
 * Time: 11:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class FipsCodes {

    private String county;
    private int    code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
