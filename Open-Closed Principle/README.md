# Open-Closed Principle
The application or module entities the methods, functions, variables, etc. The open-closed principle states that according to new requirements the module should be open for extension but closed for modification. The extension allows us to implement new functionality to the module. Let's understand the principle through an example.
<br/>
Suppose, VehicleInfo is a class and it has the method vehicleNumber() that returns the vehicle number.

<br/>

```java


public class VehicleInfo {  
  public double vehicleNumber(Vehicle vcl){  
    if (vcl instanceof Car){  
      return vcl.getNumber();  
    if (vcl instanceof Bike){  
        return vcl.getNumber();  
    }  
  }  
}}

```

If we want to add another subclass named Truck, simply, we add one more if statement that violates the open-closed principle. The only way to add the subclass and achieve the goal of principle by overriding the vehicleNumber() method, as we have shown below.

VehicleInfo.java

```java

public class VehicleInfo  {  
  public double vehicleNumber(){  
  //functionality   
  }  
}  
public class Car extends VehicleInfo {  
  public double vehicleNumber(){  
    return this.getValue();  
  }  
public class Car extends Truck {  
  public double vehicleNumber() {  
    return this.getValue();  
  }
}}

```

# Solution for Open-Closed Principle

* In the initial solution you put only 2 classes (main & calculator) and the enum.
the first class is calculator: which involves all the operations in it . and this make the code complex, not easy to read and understand and the basic problem it's hard to add any operation on this.
1. I added 2 packages (impl contains classes , intf contains interfaces)
2. I create 7 interfaces, 5 of them for operations and one for getting result and the final one for removing number from calculator . 
3. Then create 7 classes that implements the interfaces, also 5 of them for operations and one for getting result and the final one for removing number from calculator. 
4. Then call them in calculator class (dependence on interfaces no depends on concrete).
in this way, we don't able to modify on these , but I can be able to add (open for extensions, close for modification)
if we need to add any operation, we create a new version class that extends the current version and added the operation in this new calculator .
5. For example, I added new version of calculator and adding in this division operation , this version contains all operation in v1 and division operation.

```java
public class GettingResult2 extends GettingResult {
    @Override
    public int gettingResult(Operation operation, ArrayList<Integer> numbers) {
        int result = super.gettingResult(operation, numbers);

        if (operation.equals(Operation.Division)) {
            Division division = new DividingNumbers();
            return DividingNumbers.divideNumbers(numbers);
        }
        return result;
    }
}
```
![Open Closed Principle2 drawio](https://user-images.githubusercontent.com/92352860/196235496-653f5ac2-1f3f-4f89-b949-a58348779077.png)
