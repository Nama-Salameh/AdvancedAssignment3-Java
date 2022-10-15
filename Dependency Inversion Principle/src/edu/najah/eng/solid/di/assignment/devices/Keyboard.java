package edu.najah.eng.solid.di.assignment.devices;

import edu.najah.eng.solid.di.assignment.intf.Power;

public class Keyboard implements Power {
    @Override
    public void powerOn(){
        System.out.println("Power on " + this.getClass().getName());
    }

    @Override
    public void powerOff(){
        System.out.println("Power off " + this.getClass().getName());
    }
}
