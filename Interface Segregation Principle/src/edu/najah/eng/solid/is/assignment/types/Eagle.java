package edu.najah.eng.solid.is.assignment.types;

import edu.najah.eng.solid.is.assignment.intf.Flying;
import edu.najah.eng.solid.is.assignment.intf.IMolting;

public class Eagle implements Flying{

    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

    public void molt(int numberOfFeathers) {
        Molting molting = new Molting();
        molting.molt(numberOfFeathers);
    }

}
