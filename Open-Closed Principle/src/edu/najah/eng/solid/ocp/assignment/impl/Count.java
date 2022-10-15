package edu.najah.eng.solid.ocp.assignment.impl;

import edu.najah.eng.solid.ocp.assignment.intf.ICount;

import java.util.ArrayList;

public class Count implements ICount {
    @Override
    public int gettingCount(ArrayList<Integer> numbers){
        return numbers.size();
    }
}
