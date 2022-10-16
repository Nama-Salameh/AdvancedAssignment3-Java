package edu.najah.eng.solid.srp.assignment.impl;

import edu.najah.eng.solid.srp.assignment.intf.IInvoiceDeleting;

public class InvoiceDeleting extends Database implements IInvoiceDeleting {
    @Override
    public void deleteInvoice(){
        // connect to database
        connectDatabase();;
        // execute delete command to delete the invoice from the database
        deleteRecord();
        //close the database connection
        closeDatabase();
    }
}
