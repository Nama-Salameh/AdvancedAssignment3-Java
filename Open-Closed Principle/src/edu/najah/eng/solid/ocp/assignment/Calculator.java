package edu.najah.eng.solid.ocp.assignment;


import edu.najah.eng.solid.ocp.assignment.impl.*;
import edu.najah.eng.solid.ocp.assignment.intf.RemovingNumber;
import edu.najah.eng.solid.ocp.assignment.intf.Result;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> numbers = null;


    //constructor
    public Calculator(){ numbers = new ArrayList<>();}

    //getter
    public ArrayList<Integer> getNumbers() { return numbers; }

    public void addNumber(int number){
        numbers.add(number);
    }

    public void removeNumberAtIndex(int index){
        RemovingNumber removingNumber = new RemoveNumber();
        removingNumber.removeNumber(index,numbers);
    }

    public int getOperationResult(Operation operation){
        Result result = new GettingResult();
        return result.gettingResult(operation,numbers);
    }
}
