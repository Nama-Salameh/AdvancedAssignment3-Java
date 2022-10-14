package edu.najah.eng.solid.is.assignment.types;

import edu.najah.eng.solid.is.assignment.intf.Flying;
import edu.najah.eng.solid.is.assignment.intf.Molting;

public class Eagle implements Flying, Molting {

    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

    @Override
    public void molt() {

        this.numberOfFeathers -= 1;
    }
}
