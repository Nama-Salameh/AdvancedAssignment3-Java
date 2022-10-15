package edu.najah.eng.solid.ocp.assignment.impl;

import edu.najah.eng.solid.ocp.assignment.intf.Multiplicative;

import java.util.ArrayList;

public class Multiplication implements Multiplicative {
    @Override
    public int multiplicative(ArrayList<Integer> numbers){
        int result = 1;
        for (Integer number : numbers) {
            result *= number;
        }
        return result;
    }

}
