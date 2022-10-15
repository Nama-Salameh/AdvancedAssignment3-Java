package edu.najah.eng.solid.lsp.assignment;

import java.util.ArrayList;

public class Customer extends superCustomer{
    @Override
    public void addOffers(Offer offer) {
        this.offers.add(offer);
    }
}
