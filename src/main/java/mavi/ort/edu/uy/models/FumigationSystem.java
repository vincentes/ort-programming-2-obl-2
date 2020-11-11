/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavi.ort.edu.uy.models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vicentebermudez
 */
public class FumigationSystem {
    private static FumigationSystem fumigation = null;
    private List<Pilot> pilots;
    private List<Technic> technics;
    private List<Product> products = new ArrayList<Product>();
    private int lastIdProduct = 0;
    
    // private constructor restricted to this class itself 
    private FumigationSystem() 
    { 
        load();
    } 
  
    // static method to create instance of Singleton class 
    public static FumigationSystem getInstance() 
    { 
        if (fumigation == null) {
            fumigation = new FumigationSystem(); 
        }
  
        return fumigation; 
    } 

    public void addProduct(String name, double cost, ProductOrigin origin) {
        products.add(new Product(lastIdProduct++, name, cost, origin));
        persist();
    }

    public String[] getProductsAsStringArray() {
        String[] result = new String[products.size()];
        for(int i = 0; i < result.length; i++) {
            result[i] = products.get(i).toString();
        }
        return result;
    }

    public void addPilot(String name, String ci, String address, int yearsOfExperience) {
        pilots.add(new Pilot(name, ci, address, yearsOfExperience));
        persist();
    }


    public boolean doesPilotExist(String ci) {
        boolean isPilotPresent = false;
        for (Pilot p : pilots) {
            if (p.getCi().equals(ci)) {
                isPilotPresent = true;
            }
        }
        return isPilotPresent;
    }

    public List<Technic> getTechnicsList() {
        return technics;
    }

    public void addTechnic(String name, String ci, String email) {
        technics.add(new Technic(name, ci, email));
        persist();
    }

    public boolean doesTechnicExist(String ci) {
        boolean isTechnicPresent = false;
        for (Technic t : technics) {
            if (t.getCi().equals(ci)) {
                isTechnicPresent = true;
            }
        }
        return isTechnicPresent;
    }

    public List<Pilot> getPilotsList() {
        return pilots;
    }

    public void load() {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("data.txt"));
            // Products
            products = (List<Product>) in.readObject();
            lastIdProduct = (int) in.readObject();
            // Pilots
            pilots = (List<Pilot>) in.readObject();
            // Technics
            technics = (List<Technic>) in.readObject();
        } catch(ClassNotFoundException ex) {
            Logger.getLogger(FumigationSystem.class.getName()).log(Level.INFO, "Could not find the data file. Will continue as this may be the first time running the program.");
        } catch (IOException ex) {
            Logger.getLogger(FumigationSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void persist() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.txt"));
            // Products
            out.writeObject(products);
            out.writeObject(lastIdProduct);
            // Pilots
            out.writeObject(pilots);
            // Technics
            out.writeObject(technics);
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(FumigationSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
