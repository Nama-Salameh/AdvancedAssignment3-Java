# Solution of Liskov Substitution Principle (LSP)
* In the initial solution you create 3 classes, one of them (LimitedCustomer) extends to another class (Customer).
but this solution  broke principle (Liskov), which states that objects of superclass should be replaceable with objects of its subclasses without breaking the application, because the replacement between customer and LimitiedCustomer made a problems,
addOffers in LimitedCustomer having limitation but in Customer not having any limitation, limited customer don't having more 3 offers, so when create customer with 10 offers and then replace customer with LimitedCustomer don't create more than 3 offers .
* So, I created new class that a SuperCustomer (superclass) the having basic methods that shared between customer and limited customer and made customer & limited customer extends it (subclasses) and that achieves the Liskov principle.

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
