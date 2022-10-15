package edu.najah.eng.solid.di.assignment;

public class Main {
    public static void main(String[] args) {
        WindowsMachine windowsMachine = new WindowsMachine();
        windowsMachine.keyboard.powerOff();
        windowsMachine.monitor.turnOn();
        //windowsMachine.changeStatus(true);
        windowsMachine.changemonitorStatus(true);
        windowsMachine.changeKeyboardStatus(false);
    }
}
