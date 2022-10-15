package edu.najah.eng.solid.ocp.assignment.impl;

import edu.najah.eng.solid.ocp.assignment.intf.RemovingNumber;

import java.util.ArrayList;

public class RemoveNumber implements RemovingNumber {

    @Override
    public void removeNumber(int index, ArrayList<Integer> numbers) {
        if (index < 0 || index >= numbers.size()){
            System.out.println("Invalid number: " + index);
            return;
        }
        numbers.remove(index);
    }
}
