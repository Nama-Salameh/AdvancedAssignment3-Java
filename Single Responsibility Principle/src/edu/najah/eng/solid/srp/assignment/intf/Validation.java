package edu.najah.eng.solid.srp.assignment.intf;

import edu.najah.eng.solid.srp.assignment.MailMessage;

public interface Validation {

    public boolean isValid(String mailAddressFrom, String mailAddressTo, String mailSubject, String mailBody);
}
