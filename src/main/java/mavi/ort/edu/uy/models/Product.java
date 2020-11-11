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
public class Product {
    private int id;
    private String name;
    private double cost;
    private ProductOrigin origin;

    public Product(int id, String name, double cost, ProductOrigin origin) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.origin = origin;
    }

    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(int id) {
        this.id = id;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public ProductOrigin getOrigin() {
        return origin;
    }

    public void setOrigin(ProductOrigin origin) {
        this.origin = origin;
    }
    
    
}
