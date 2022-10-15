package edu.najah.eng.solid.di.assignment.impl;

import edu.najah.eng.solid.di.assignment.WindowsMachine;
import edu.najah.eng.solid.di.assignment.intf.IStatusChanging;

public class KeyboardStatusChanging extends WindowsMachine implements IStatusChanging {
    @Override
    public void changeStatus(boolean status) {
            if (status){
                keyboard.powerOn();
            } else {
                keyboard.powerOff();
            }
            System.out.println("changing keyboard status");

    }
}
