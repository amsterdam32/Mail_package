package ru.home.mail;

/**
 * Created by Wladimir on 13.04.2016.
 */
public class UntrustworthyMailWorker implements MailService {
    Sendable mail;

    public UntrustworthyMailWorker(MailService[] arr, Sendable mail) {
        for(int i=0;i<arr.length;i++){
            mail = arr[i].processMail(mail);
        }
        this.mail = mail;
    }

    /*public RealMailService getRealMailService (){
        return this.processMail(mail);
    }*/

    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }
}
