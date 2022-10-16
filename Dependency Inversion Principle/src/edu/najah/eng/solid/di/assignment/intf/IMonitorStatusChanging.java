package edu.najah.eng.solid.di.assignment.intf;

import edu.najah.eng.solid.di.assignment.devices.Monitor;

public interface IMonitorStatusChanging {
    void changeStatus(boolean Status, Monitor monitor);
}
