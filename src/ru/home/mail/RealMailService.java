package ru.home.mail;

/**
 * Created by Wladimir on 02.04.2016.
 */
public class RealMailService implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }
}
