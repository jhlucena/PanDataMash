package com.model;

/**
 * Created with IntelliJ IDEA.
 * User: jhernandez
 * Date: 6/5/13
 * Time: 4:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class FormBean {

    private String status;
    private String estName;
    private String Municipality;


    public FormBean() {
        this.status = "";
        this.estName = "";
        this.Municipality = "";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMunicipality() {
        return Municipality;
    }

    public void setMunicipality(String municipality) {
        Municipality = municipality;
    }

    public String getEstName() {
        return estName;
    }

    public void setEstName(String estName) {
        this.estName = estName;
    }
}

