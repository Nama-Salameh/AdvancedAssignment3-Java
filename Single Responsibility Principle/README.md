# Single Responsibility Principle


This principle states that a class should only have one responsibility. Furthermore, it should only have one reason to change.
<br />
How does this principle help us to build better software? Let's see a few of its benefits:
<br />
- Testing – A class with one responsibility will have far fewer test cases.
- Lower coupling – Less functionality in a single class will have fewer dependencies.
- Organization – Smaller, well-organized classes are easier to search than monolithic ones.

<br />

For example: The Vehicle class below has three separate responsibilities: reporting, calculation, and database. By applying SRP, we can separate the above class into three classes with separate responsibilities.

```java

public class Vehicle {
    public void printDetails() {}
    public double calculateValue() {}
    public void addVehicleToDB() {}
}

```
# Solution for Single Responsibility Principle
* The initial code contains only two classes with all methods that implements it in the same class, and if we need to add or modify anything in this code, we will have to modify the entire class, and we may have problems with it, so I used several classes and Interfaces to solve this problem (having more than one reason to change the class), another problem is the class( MailMessage) contains a lot of test cases, Also we have a problem sendMail is not related directly to Invoice class, should add it in the MailMessage class .
So, for solve these problems,  
- first I deleted sendMail from Invoice class and added it in MailMessage class.
- Then I put each method (adding to invoice, deleting from it, send mail and validation) in different classes until I have one reason to edit it. (that reduce dependencies and achieving Single Responsibility principle).
- - the validation code contains a lot of test cases and when I put it in a different class, I reduced the duplication of test cases and reduce problem when modifying it.
- Then create objects related to methods in Invoice and MailMessage classes .
- - like this in Invoice class :
![Invoice](https://user-images.githubusercontent.com/92352860/196209615-f710b00d-523b-45ff-8fd1-e79510825690.png)

- - And this in MailMessage class :
   ![MailM](https://user-images.githubusercontent.com/92352860/196210545-46fb03de-ff21-457b-aeaa-4b620fcf5006.png)

- Also, I applied another principle :
Interface Segregation principle, added for each class an interface contains the methods without body , and make classes implements this interfaces and override the methods .
- And finally :
- I notice in method addingInvoice you adding comments to the body for databases, so I create Interface (the cause of interface --> if we need to add different types of database) for database (IDatabase) and put in this 4 methods (connectDatabase(), insertRecord() , deleteRecord(), closeDatabase()) and implements this interface in a class (Database) and then uses these methods in the codes needed it(delete invoice and add invoice).
