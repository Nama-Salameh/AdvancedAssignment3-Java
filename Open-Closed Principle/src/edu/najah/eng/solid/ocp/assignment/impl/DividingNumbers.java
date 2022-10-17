package edu.najah.eng.solid.ocp.assignment.impl;

import edu.najah.eng.solid.ocp.assignment.intf.Division;

import java.util.ArrayList;

public class DividingNumbers implements Division {

    @Override
    public static int divideNumbers(ArrayList<Integer> numbers) {
        int result = 1;
        for (Integer number : numbers) {
            result /= number;
        }
        return result;
    }
}
