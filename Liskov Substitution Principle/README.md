# Liskov Substitution Principle (LSP)

Simply put, the Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with objects of its subclasses without breaking the application. 

<br/>

In other words, what we want is to have the objects of our subclasses behaving the same way as the objects of our superclass.

## Let us go by an example:

![image](https://user-images.githubusercontent.com/23558509/193647442-127f1a58-8f10-4f6d-8a02-0b86240937f5.png)
<br/>
![image](https://user-images.githubusercontent.com/23558509/193647476-0054da90-d3fe-4ada-92ca-2d193c916302.png)
<br/>

By looking at the above scenario you might still argue that it looks pretty consistent. That is true for the language you are coding in and also for Mathematics but a Square might not always satisfy the behavior of a Rectangle.

This is what I mean:
<br/>
![image](https://user-images.githubusercontent.com/23558509/193647572-a8006229-cd0e-450f-8833-28d58aa79378.png)
<br/>

# Solution of Liskov Substitution Principle (LSP)
* In the initial solution you create 3 classes, one of them (LimitedCustomer) extends to another class (Customer).
but this solution  broke principle (Liskov), which states that objects of superclass should be replaceable with objects of its subclasses without breaking the application, because the replacement between customer and LimitiedCustomer made a problems,
addOffers in LimitedCustomer having limitation but in Customer not having any limitation. also, in limited customer having another method not exists in Customer .
* So, I created new class that a SuperCustomer (superclass) the having basic methods that shared between customer and limited customer and made customer & limited customer extends it (subclasses) and that achieves the Liskov principle, can identify each of them Customer and LimitedCustomer from one class (superClass) .

```java
public abstract class superCustomer {
    protected ArrayList<Offer> offers = null;
    public superCustomer(){
        offers = new ArrayList<>();
    }
    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }
     abstract void addOffers(Offer offer);
}
```
```java
public class LimitedCustomer extends superCustomer
```
```java
public class Customer extends superCustomer
```

![Liskov Substituation Principle drawio](https://user-images.githubusercontent.com/92352860/196255281-ad633273-9e81-4701-b0bf-02fa6aacffe0.png)
