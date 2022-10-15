package edu.najah.eng.solid.ocp.assignment.impl;

import edu.najah.eng.solid.ocp.assignment.intf.Min;

import java.util.ArrayList;

public class MinValue implements Min {
    @Override
    public int gettingMin(ArrayList<Integer> numbers){
        int min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (min > number){
                min = number;
            }
        }
        return min;
    }
}
