package edu.psu.ab.ist.sworks.pojo;

/*
Project: PSA Grover Vehicle
Feature: Email POJO Class
Author: Daniel Hardcastle, Jennifer A'Harrah
Date Created: 3/13/2019
Revision: 2
 */

public class Email
{
    private String _recipient, _subject, _body;

    public Email() {}

    public Email(String to, String sub, String contents)
    {
        this._recipient = to;
        this._subject = sub;
        this._body = contents;
    }

    public String getRecipient()
    {
        return _recipient;
    }

    public void setRecipient(String recipient)
    {
        this._recipient = recipient;
    }

    public String getSubject()
    {
        return _subject;
    }

    public void setSubject(String subject)
    {
        this._subject = subject;
    }

    public String getBody()
    {
        return _body;
    }

    public void setBody(String body)
    {
        this._body = body;
    }
}
