package edu.najah.eng.solid.is.assignment.impl;

import edu.najah.eng.solid.is.assignment.intf.IMolting;

public class Molting implements IMolting {
    @Override
    public void molt(int numberOfFeathers) {
        numberOfFeathers -= 1;
    }
}
