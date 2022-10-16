package edu.najah.eng.solid.di.assignment;

import edu.najah.eng.solid.di.assignment.devices.Keyboard;
import edu.najah.eng.solid.di.assignment.devices.Monitor;
import edu.najah.eng.solid.di.assignment.impl.KeyboardStatusChanging;
import edu.najah.eng.solid.di.assignment.impl.MonitorStatusChanging;
import edu.najah.eng.solid.di.assignment.intf.IStatusChanging;

public class WindowsMachine {

    public final Keyboard keyboard;
    public final Monitor monitor;

    public WindowsMachine(){
        monitor = new Monitor();  //instance of monitor class
        keyboard = new Keyboard(); //instance of keyboard class
    }

    //for changing status to monitor and keyboard
    public KeyboardStatusChanging changeKeyStatus;
    public void changeKeyboardStatus(boolean status){
        changeKeyStatus.changeStatus(status);
    }
    public MonitorStatusChanging changeMonitorStatus;
    public void changemonitorStatus(boolean status){
        changeMonitorStatus.changeStatus(status);
    }
}
