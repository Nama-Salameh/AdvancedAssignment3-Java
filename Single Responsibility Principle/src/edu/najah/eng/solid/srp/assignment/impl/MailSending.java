package edu.najah.eng.solid.srp.assignment.impl;

import edu.najah.eng.solid.srp.assignment.MailMessage;

public class MailSending {
    public void sendMail(MailMessage mailMessage){
        if (mailMessage.isValidMessage()){
            // Code for getting Email setting and send invoice mail
        } else {
            //show error message for the user
            System.err.println("Not Valid Message");
        }

    }
}
