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
public class Pilot implements Serializable {

    private String name;
    private String ci;
    private String address;
    private int yearsOfExperience;

    public Pilot(String name, String ci, String address, int yearsOfExperience) {
        this.setName(name);
        this.setCi(ci);
        this.setAddress(address);
        this.setYearsOfExperience(yearsOfExperience);
    }

    public Pilot() {

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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the yearsOfExperience
     */
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    /**
     * @param yearsOfExperience the yearsOfExperience to set
     */
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return String.format(this.ci + " " + this.name + " " + this.yearsOfExperience);
    }

}
