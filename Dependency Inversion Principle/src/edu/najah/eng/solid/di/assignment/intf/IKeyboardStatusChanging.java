package edu.najah.eng.solid.di.assignment.intf;

import edu.najah.eng.solid.di.assignment.WindowsMachine;
import edu.najah.eng.solid.di.assignment.devices.Keyboard;

public interface IKeyboardStatusChanging {
    void changeStatus(boolean status, Keyboard keyboard);
}
