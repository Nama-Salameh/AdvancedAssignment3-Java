package edu.najah.eng.solid.lsp.assignment;

public class Main {
    public static void main(String[] args) {
        Offer offer = null;
        Customer customer3 = new Customer();
        superCustomer customer1 = new Customer();
        superCustomer customer2 = new LimitedCustomer();

        customer1.getOffers();
        customer2.getOffers();
        customer2.addOffers(offer);
        customer1.addOffers(offer);
    }
}
