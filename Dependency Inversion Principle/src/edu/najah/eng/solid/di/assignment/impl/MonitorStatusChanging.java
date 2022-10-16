package edu.najah.eng.solid.di.assignment.impl;

import edu.najah.eng.solid.di.assignment.WindowsMachine;
import edu.najah.eng.solid.di.assignment.devices.Monitor;
import edu.najah.eng.solid.di.assignment.intf.IKeyboardStatusChanging;
import edu.najah.eng.solid.di.assignment.intf.IMonitorStatusChanging;

public class MonitorStatusChanging  implements IMonitorStatusChanging {
    @Override
    public void changeStatus(boolean status, Monitor monitor) {
        if (status) {
            monitor.turnOn();
        } else {
            monitor.turnOff();
        }
        System.out.println("changing Monitor status");
    }
}
