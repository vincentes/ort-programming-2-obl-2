/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavi.ort.edu.uy.models;

import java.io.Serializable;

/**
 *
 * @author Vicente Bermúdez, Matías Sallé
 */
public enum ProductOrigin implements Serializable {
    NATIONAL("NACIONAL"),
    IMPORTED("IMPORTADO");

    private String name;

    private ProductOrigin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
