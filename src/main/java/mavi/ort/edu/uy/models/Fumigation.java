/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavi.ort.edu.uy.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vicentebermudez
 */
public class Fumigation {
    private static Fumigation fumigation = null; 
    private List<Product> products = new ArrayList<Product>();
    private int lastIdProduct = 0;
    
    // private constructor restricted to this class itself 
    private Fumigation() 
    { 
        
    } 
  
    // static method to create instance of Singleton class 
    public static Fumigation getInstance() 
    { 
        if (fumigation == null) {
            fumigation = new Fumigation(); 
        }
  
        return fumigation; 
    } 

    public void addProduct(String name, double cost, ProductOrigin origin) {
        products.add(new Product(lastIdProduct++, name, cost, origin));
    }
}
