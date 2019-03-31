/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.EmailOperation;
import java.util.Random;
import org.apache.commons.mail.*;

/**
 *
 * @author leonardyuan
 */
public class EmailSection {
    private static String USERNAME = "crystal.liu621@gmail.com";
    private static String PASSWORD = "liumingyu95621";
    private int confirmCode;

    public EmailSection() {
        this.confirmCode = new Random().nextInt();
    }
    
    public boolean sendEmail(String emailaddress) throws EmailException{
        Email email = new SimpleEmail();
        email.setHostName("imap.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(USERNAME, PASSWORD));
        email.setSSLOnConnect(true);
        email.setFrom(USERNAME);
        email.setSubject("Email CONFIRM");
        email.setMsg("Confirm Code: " + confirmCode);
        email.addTo(emailaddress);
        email.send();
        
        return true;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static void setUSERNAME(String USERNAME) {
        EmailSection.USERNAME = USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        EmailSection.PASSWORD = PASSWORD;
    }

    public int getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(int confirmCode) {
        this.confirmCode = confirmCode;
    }
    
}
