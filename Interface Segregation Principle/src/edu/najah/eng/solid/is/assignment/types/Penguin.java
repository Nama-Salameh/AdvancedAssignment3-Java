package edu.najah.eng.solid.is.assignment.types;

import edu.najah.eng.solid.is.assignment.impl.Molting;
import edu.najah.eng.solid.is.assignment.impl.Swimming;
import edu.najah.eng.solid.is.assignment.intf.ISwimming;

public class Penguin  {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        Molting molting = new Molting();
        molting.molt(numberOfFeathers);
    }

    public void swim() {
        ISwimming swimming = new Swimming();
        swimming.swim(currentLocation);
    }
}
