package edu.najah.eng.solid.is.assignment.types;

import edu.najah.eng.solid.is.assignment.intf.Molting;
import edu.najah.eng.solid.is.assignment.intf.Swimming;

public class Penguin implements Swimming, Molting {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {

        this.currentLocation = "in the water";
    }
}
