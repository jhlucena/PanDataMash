package com.model;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jhernandez
 * Date: 6/5/13
 * Time: 5:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResponseData {

    private final List<ComercioPan> comercios;

    public ResponseData(List<ComercioPan> comercios) {
        super();
        this.comercios = comercios;
    }

    public List<ComercioPan> getComercios() {
        return comercios;
    }
}
