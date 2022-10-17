package edu.najah.eng.solid.ocp.assignment.v2calculator;

import edu.najah.eng.solid.ocp.assignment.Calculator;
import edu.najah.eng.solid.ocp.assignment.Operation;
import edu.najah.eng.solid.ocp.assignment.impl.Add;
import edu.najah.eng.solid.ocp.assignment.impl.DividingNumbers;
import edu.najah.eng.solid.ocp.assignment.impl.GettingResult;
import edu.najah.eng.solid.ocp.assignment.intf.Division;

import java.util.ArrayList;

public class calculator2 extends GettingResult {
    @Override
    public int gettingResult(Operation operation, ArrayList<Integer> numbers) {
        int result = super.gettingResult(operation, numbers);

        if (operation.equals(Operation.Division)){
            Division division = new DividingNumbers();
            return DividingNumbers.divideNumbers(numbers);
        }
        return result;
    }
}

