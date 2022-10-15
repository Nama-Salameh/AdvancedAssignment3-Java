package edu.najah.eng.solid.lsp.assignment;

public class LimitedCustomer extends superCustomer{

    private static final int MAX_ALLOWED_OFFER = 3;

    @Override
    public void addOffers(Offer offer) {
        if (isReachedMaxAllowedOffers()) {
            System.err.println("Limited customer can not add more that " + MAX_ALLOWED_OFFER + " offers");
            return;
        }
    }

    private boolean isReachedMaxAllowedOffers() {
        return this.offers.size() >= MAX_ALLOWED_OFFER;
    }

}
