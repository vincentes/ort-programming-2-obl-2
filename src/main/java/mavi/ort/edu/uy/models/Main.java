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
 * @author matiassalle
 */
public class Main {

    private static List<Pilot> pilots;
    private static List<Technic> technics;

    public Main() {
        pilots = new ArrayList<>();
        technics = new ArrayList<>();
    }

    public List<Pilot> getPilotsList() {
        return pilots;
    }

    public static void addPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    public boolean validatePilotExistence(String ci) {
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

    public static void addTechnic(Technic technic) {
        technics.add(technic);
    }

    public boolean validateTechnicExistence(String ci) {
        boolean isTechnicPresent = false;
        for (Technic t : technics) {
            if (t.getCi().equals(ci)) {
                isTechnicPresent = true;
            }
        }
        return isTechnicPresent;
    }

}
