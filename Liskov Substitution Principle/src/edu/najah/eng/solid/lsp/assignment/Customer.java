package edu.najah.eng.solid.lsp.assignment;

import java.util.ArrayList;

public class Customer extends superCustomer{

    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }

    @Override
    public void addOffers(Offer offer) {
        this.offers.add(offer);
    }
}
