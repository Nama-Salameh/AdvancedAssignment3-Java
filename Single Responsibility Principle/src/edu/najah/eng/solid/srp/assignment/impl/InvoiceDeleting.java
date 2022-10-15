package edu.najah.eng.solid.srp.assignment.impl;

public class InvoiceDeleting extends Database{
    public void deleteInvoice(){
        // connect to database
        connectDatabase();;
        // execute delete command to delete the invoice from the database
        deleteRecord();
        //close the database connection
        closeDatabase();
    }
}
