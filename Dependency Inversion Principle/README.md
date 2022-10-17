# Solution of Dependency Inversion Principle

* In the initial solution you create 3 classes and dependent on each other. 
<br /> such as : windowsMachine class depends on concrete , and the 3 classes having the body in it, 
which makes it difficult to adding, modifying and understanding the code.
* So:
1. First, I created 2 interfaces for Keyboard and monitor to solve the dependency on concrete.
2. Then, I created also 2 interfaces for changing status one of them for keyboard status (IKeyboardStatusChanging) and the other for monitor status (IMonitorStatusChanging), 
and implemented these interface by new 2 classes for changing the status, and finally used it in methods in  the windowsMachine class.

* The interfaces: 

```java
public interface IKeyboard {
    void powerOn();
    void powerOff();
}

public interface IMonitor {
    void turnOn();
    void turnOff();
}

public interface IKeyboardStatusChanging {
    void changeStatus(boolean status, Keyboard keyboard);
}

public interface IMonitorStatusChanging {
    void changeStatus(boolean Status, Monitor monitor);
}

![Dependency Inversion Principle drawio](https://user-images.githubusercontent.com/92352860/196273809-09ac6a6d-e4db-49e7-9316-a9250dad6294.png)
