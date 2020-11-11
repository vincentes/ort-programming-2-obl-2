/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavi.ort.edu.uy.models;

/**
 *
 * @author vicentebermudez
 */
public enum ProductOrigin {
    NATIONAL("NATIONAL"),
    IMPORTED("IMPORTED");

    private String name;

    private ProductOrigin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
