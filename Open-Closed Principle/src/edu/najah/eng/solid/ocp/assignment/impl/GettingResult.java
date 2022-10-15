package edu.najah.eng.solid.ocp.assignment.impl;

import edu.najah.eng.solid.ocp.assignment.Operation;
import edu.najah.eng.solid.ocp.assignment.intf.Result;

import java.util.ArrayList;

public class GettingResult implements Result {

    @Override
    public int gettingResult(Operation operation, ArrayList<Integer> numbers) {

        if (operation.equals(Operation.Count)){
            Count count = new Count();
            return count.gettingCount(numbers);
        }
        if (operation.equals(Operation.Addition)){
            Add addition = new Add();
            return addition.additionNumbers(numbers);
        }

        if (operation.equals(Operation.Multiplication)){
            Multiplication multiplication = new Multiplication();
            return multiplication.multiplicative(numbers);
        }
        if (operation.equals(Operation.Max)){
            MaxValue maxValue = new MaxValue();
            return maxValue.gettingMax(numbers);
        }
        if (operation.equals(Operation.Min)){
            MinValue minValue = new MinValue();
            return minValue.gettingMin(numbers);
        }
        System.err.println("Invalid operation");
        return -1111111;
    }
}
