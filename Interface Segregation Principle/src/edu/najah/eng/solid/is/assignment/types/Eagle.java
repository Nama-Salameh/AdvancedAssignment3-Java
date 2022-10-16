package edu.najah.eng.solid.is.assignment.types;

import edu.najah.eng.solid.is.assignment.impl.Flying;
import edu.najah.eng.solid.is.assignment.impl.Molting;
import edu.najah.eng.solid.is.assignment.intf.IFlying;

public class Eagle  {

    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }


    public void fly() {
        IFlying flying = new Flying();
        flying.fly(currentLocation);
    }

    public void molt() {
        Molting molting = new Molting();
        molting.molt(numberOfFeathers);
    }

}
