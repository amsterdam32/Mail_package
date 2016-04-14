package ru.home.mail;

/**
 * Created by Wladimir on 02.04.2016.
 */
public interface MailService {
    Sendable processMail(Sendable mail);
}
