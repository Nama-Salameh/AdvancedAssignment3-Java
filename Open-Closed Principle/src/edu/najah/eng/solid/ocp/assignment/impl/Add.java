package edu.najah.eng.solid.ocp.assignment.impl;

import edu.najah.eng.solid.ocp.assignment.Calculator;
import edu.najah.eng.solid.ocp.assignment.intf.Addition;

import java.util.ArrayList;

public class Add extends Calculator implements Addition {
    @Override
   public int additionNumbers(ArrayList<Integer> numbers){
       int result = 0;
       for (Integer number : numbers) {
           result += number;
       }
       return result;
   }
}
