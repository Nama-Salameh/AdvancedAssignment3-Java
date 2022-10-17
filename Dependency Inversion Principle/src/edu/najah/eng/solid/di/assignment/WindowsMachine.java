package edu.najah.eng.solid.di.assignment;

import edu.najah.eng.solid.di.assignment.devices.Keyboard;
import edu.najah.eng.solid.di.assignment.devices.Monitor;
import edu.najah.eng.solid.di.assignment.impl.KeyboardStatusChanging;
import edu.najah.eng.solid.di.assignment.impl.MonitorStatusChanging;
import edu.najah.eng.solid.di.assignment.intf.IKeyboard;
import edu.najah.eng.solid.di.assignment.intf.IKeyboardStatusChanging;
import edu.najah.eng.solid.di.assignment.intf.IMonitor;
import edu.najah.eng.solid.di.assignment.intf.IMonitorStatusChanging;

public class WindowsMachine {

    public final IKeyboard keyboard;
    public final IMonitor monitor;

    public WindowsMachine(){
        monitor = new Monitor();  //instance of monitor class
        keyboard = new Keyboard(); //instance of keyboard class
    }

    //for changing status to monitor and keyboard
    public IKeyboardStatusChanging changeKeyStatus = new KeyboardStatusChanging();
    public void changeKeyboardStatus(boolean status){
        changeKeyStatus.changeStatus(status, (Keyboard) keyboard);
    }
    public IMonitorStatusChanging changeMonitorStatus = new MonitorStatusChanging();
    public void changemonitorStatus(boolean status){
        changeMonitorStatus.changeStatus(status, (Monitor) monitor);
    }
}

