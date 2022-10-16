package edu.najah.eng.solid.is.assignment.impl;

import edu.najah.eng.solid.is.assignment.intf.ISwimming;

public class Swimming implements ISwimming {
    @Override
    public void swim(String currentLocation) {
        currentLocation = "in the water";
    }
}
