package edu.psu.ab.ist.sworks.pojo;

/*
Project: PSA Grover Vehicle
Feature: SMS POJO Class
Author: Daniel Hardcastle
Date Created: 3/16/2019
Revision: 1
 */

public class SMS {
    private String _phoneNum, _messageTxt;

    public SMS() {
    }

    public SMS(String phone, String message)
    {
        this._phoneNum = phone;
        this._messageTxt = message;
    }

    public String get_phoneNum() {return _phoneNum;}

    public void set_phoneNum(String phoneNum) {this._phoneNum = phoneNum;}

    public String get_messageTxt() {return _messageTxt;}

    public void set_messageTxt(String message) {this._messageTxt = message;}
}
