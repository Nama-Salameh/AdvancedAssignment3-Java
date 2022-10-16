package edu.najah.eng.solid.is.assignment.impl;

import edu.najah.eng.solid.is.assignment.intf.IFlying;

public class Flying implements IFlying {
    @Override
    public void fly(String currentLocation) {
        currentLocation = "in the air";
    }
}
