package edu.najah.eng.solid.di.assignment.impl;

import edu.najah.eng.solid.di.assignment.devices.Keyboard;
import edu.najah.eng.solid.di.assignment.intf.IKeyboardStatusChanging;

public class KeyboardStatusChanging  implements IKeyboardStatusChanging {
    @Override
    public void changeStatus(boolean status, Keyboard keyboard) {
            if (status){
                keyboard.powerOn();
            } else {
                keyboard.powerOff();
            }
            System.out.println("changing keyboard status");

    }
}
