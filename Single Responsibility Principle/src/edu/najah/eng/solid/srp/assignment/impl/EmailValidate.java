package edu.najah.eng.solid.srp.assignment.impl;

import edu.najah.eng.solid.srp.assignment.MailMessage;
import edu.najah.eng.solid.srp.assignment.intf.Validation;

public class EmailValidate implements Validation {

    @Override
    public boolean isValid(String mailAddressFrom, String mailAddressTo, String mailSubject, String mailBody) {
        if(mailAddressFrom == null || mailAddressFrom.isEmpty() || !mailAddressFrom.contains("@") || !mailAddressFrom.contains(".")){
            return false;
        }

        //Validate the input (email)
        if(mailAddressTo == null || mailAddressTo.isEmpty() || !mailAddressTo.contains("@") || !mailAddressTo.contains(".")){
            return false;
        }

        //Validate the input
        if(mailSubject == null || mailSubject.isEmpty() || mailSubject.length() > 30){
            return false;
        }

        //Validate the input
        if(mailBody == null && mailBody.isEmpty() ){
            return false;
        }
        return true;
    }
}
