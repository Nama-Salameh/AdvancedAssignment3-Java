package edu.najah.eng.solid.srp.assignment;

import edu.najah.eng.solid.srp.assignment.impl.EmailValidate;
import edu.najah.eng.solid.srp.assignment.intf.Validation;

public class MailMessage {

    public String getMailAddressFrom() {
        return mailAddressFrom;
    }

    private String mailAddressFrom;

    public String getMailAddressTo() {
        return mailAddressTo;
    }

    private String mailAddressTo;

    public String getMailSubject() {
        return mailSubject;
    }

    private String mailSubject;

    public String getMailBody() {
        return mailBody;
    }

    private String mailBody;

    //this method to validate and create new message
    public MailMessage(String mailAddressFrom, String mailAddressTo, String mailSubject, String mailBody) {
        EmailValidate emailValidate = new EmailValidate();
        if (emailValidate.isValid(mailAddressFrom,mailAddressTo,mailSubject,mailBody)) {
            this.mailAddressFrom =  mailAddressFrom;
            this.mailAddressTo =  mailAddressTo;
            this.mailSubject =  mailSubject;
            this.mailBody =  mailBody;
        }
    }

    //this method to validate a message
    public boolean isValidMessage(){
        EmailValidate emailValidate = new EmailValidate();
        return emailValidate.isValid(mailAddressFrom,mailAddressTo,mailSubject,mailBody);
    }
}
