package edu.najah.eng.solid.di.assignment.impl;

import edu.najah.eng.solid.di.assignment.WindowsMachine;
import edu.najah.eng.solid.di.assignment.intf.IStatusChanging;

public class MonitorStatusChanging extends WindowsMachine implements IStatusChanging {
    @Override
    public void changeStatus(boolean status) {
        if (status) {
            monitor.turnOn();
        } else {
            monitor.turnOff();
        }
        System.out.println("changing Monitor status");
    }
}
