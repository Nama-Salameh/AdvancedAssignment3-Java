package edu.najah.eng.solid.ocp.assignment.impl;

import edu.najah.eng.solid.ocp.assignment.intf.Max;

import java.util.ArrayList;

public class MaxValue implements Max {
    @Override
    public int gettingMax(ArrayList<Integer> numbers){
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (max < number){
                max = number;
            }
        }
        return max;
    }
}
