package edu.najah.eng.solid.srp.assignment.impl;

import edu.najah.eng.solid.srp.assignment.MailMessage;

public class InvoiceAdding extends Database{
    public void AddInvoice(){
        // connect to database
        connectDatabase();
        // execute insert command to add new record in database
        insertRecord();
        //close the database connection
        closeDatabase();
        //Once Invoice has been added , send mail
        MailMessage mailMessage = new MailMessage("MailAddressFrom","MailAddressTo","MailSubject","MailBody");
        //this.sendEmail(mailMessage);
    }

}
