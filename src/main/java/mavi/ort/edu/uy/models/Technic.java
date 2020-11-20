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
public class Technic implements Serializable {

    private String name;
    private String ci;
    private String email;

    public Technic(String name, String ci, String email) {
        this.setName(name);
        this.setCi(ci);
        this.setEmail(email);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ci
     */
    public String getCi() {
        return ci;
    }

    /**
     * @param ci the ci to set
     */
    public void setCi(String ci) {
        this.ci = ci;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(this.ci + " " + this.name);
    }

}
