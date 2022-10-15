package edu.najah.eng.solid.ocp.assignment.intf;

import edu.najah.eng.solid.ocp.assignment.Operation;

import java.util.ArrayList;

public interface Result {
    int gettingResult(Operation operation, ArrayList<Integer> numbers);
}
