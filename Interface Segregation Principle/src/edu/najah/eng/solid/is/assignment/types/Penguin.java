package edu.najah.eng.solid.is.assignment.types;

import edu.najah.eng.solid.is.assignment.intf.IMolting;
import edu.najah.eng.solid.is.assignment.intf.Swimming;

public class Penguin implements Swimming {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt(int numberOfFeathers) {
        Molting molting = new Molting();
        molting.molt(numberOfFeathers);
    }

    public void swim() {

        this.currentLocation = "in the water";
    }
}
