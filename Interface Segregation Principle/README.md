# Solution of Interface Segregation Principle
* In the initial solution you create one interface (bird) and 2 classes (Penguin, Eagle) that implements the interface (bird).
* the problem is the interface having 3 methods and each of classes must involve and override all these methods (fly, molt and swim) .
In this case Eagle class must override and contain swim method, but it's unsupported it , and Penguin  must override and contain fly method, but it's also unsupported it.
* So, I create 3 interfaces each of them for only one method (IFlying, IMolting, ISwimming) , and these interfaces also implemented by 3 new classes (Flying, Molting,Swimming)
The result :
1. Penguin class implemented only Swim and Molt.
2. Eagle class also implemented only Fly and molt.
3. And if wee need another type of birds, it can implement only the methods that supported in it .
4. That made the code more fixable, easy to understand and the basic thing is each classes having only one reason to modifying it.
5. And classes depends on interfaces, not depends on concrete.

* The interfaces: 
```java
public interface IMolting {
    public void molt(int numberOfFeathers);
}
public interface ISwimming {
    public void swim(String currentLocation);
}
public interface IFlying {
    public void fly(String currentLocation);
}

```
![Interfaces Segregation Principle drawio](https://user-images.githubusercontent.com/92352860/196272634-c0794ea4-4fe6-4f9d-a3d3-b0a57a311bbb.png)
