package edu.najah.eng.solid.di.assignment.devices;

import edu.najah.eng.solid.di.assignment.intf.IMonitor;

public class Monitor implements IMonitor {
    @Override
    public void turnOn(){
        System.out.println("Turn on " + this.getClass().getName());
    }

    @Override
    public void turnOff(){
        System.out.println("Turn off " + this.getClass().getName());
    }

}
