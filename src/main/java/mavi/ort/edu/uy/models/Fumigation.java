/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavi.ort.edu.uy.models;

import java.io.Serializable;
import mavi.ort.edu.uy.utils.StringUtils;

/**
 *
 * @author vicentebermudez
 */
public class Fumigation implements Serializable {
    private Pilot pilot;
    private Technic technic;
    private Product product;
    private int day;
    private String zone;

    public Fumigation() {
    }

    public Fumigation(Pilot pilot, Technic technic, Product product, int day, String zone) {
        this.pilot = pilot;
        this.technic = technic;
        this.product = product;
        this.day = day;
        this.zone = zone;
    }
    
    public int getColumnA() {
        return Integer.parseInt(zone.split("-")[1].trim()) - 1;
    }
    
    public String getRowA() {
        return zone.split("-")[0];
    }
    
    public int getColumnB() {
        return Integer.parseInt(zone.split("-")[3].trim()) - 1;
    }    
    
    public String getRowB() {
        return zone.split("-")[2];
    }
    
    public int getRowAbsDifference() {
        return Math.abs(getRowDifference());
    }
    
    public int getColumnAbsDifference() {
        return Math.abs(getColumnDifference());
    }
    
    public int getColumnDifference() {
        return getColumnB() - getColumnA();
    }
    
    public int getRowDifference() {
        return StringUtils.alphabeticPosition(getRowB()) - StringUtils.alphabeticPosition(getRowA());
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Technic getTechnic() {
        return technic;
    }

    public void setTechnic(Technic technic) {
        this.technic = technic;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    
    
    
    public static boolean isValidZone(String zone) {
        if(zone == null) {
            return false;
        }
        
        String[] tokens = zone.split("-");
        if(tokens.length != 4) {
            return false;
        }
        
        String colA = tokens[0];
        String rowA = tokens[1];
        String colB = tokens[2];
        String rowB = tokens[3];
        
        if(rowA.length() > 1 || rowB.length() > 1 || colA.length() > 2 || colB.length() > 2) {
            return false;
        }
        return true;
    }
}
