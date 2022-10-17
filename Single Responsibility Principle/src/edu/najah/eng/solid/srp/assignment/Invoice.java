package edu.najah.eng.solid.srp.assignment;

import edu.najah.eng.solid.srp.assignment.impl.Database;
import edu.najah.eng.solid.srp.assignment.impl.InvoiceAdding;
import edu.najah.eng.solid.srp.assignment.impl.InvoiceDeleting;
import edu.najah.eng.solid.srp.assignment.impl.MailSending;

import java.util.Date;

/**
 * What are the responsibilities for this class?
 * Do the required change to make this class single responsibility
 */
public class Invoice {

    private long amount;
    private Date invoiceDate;

    public Invoice(long amount, Date invoiceDate) {
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }

    public void add()  {
        InvoiceAdding invoiceAdding = new InvoiceAdding();
        invoiceAdding.AddInvoice();
    }
    public void delete()  {
        InvoiceDeleting invoiceDeleting = new InvoiceDeleting();
        invoiceDeleting.deleteInvoice();
    }

}
