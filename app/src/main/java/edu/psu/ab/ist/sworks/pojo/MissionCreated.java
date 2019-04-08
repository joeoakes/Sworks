package edu.psu.ab.ist.sworks.pojo;

/**
Project: PSA Grover Vehicle
Feature: Mission Climate Templates
Course: IST 440w Section 1 Fall 2019
Author: Conghao Lu
Date Developed: 3/16/19
Last Date Changed: 3/16/19
Rev: 4
*/

public class MissionCreated {

    //climate type
    private String _climateType;

    //GPS
    private double _altitude;
    private double _latitude;
    private double _longitude;

    //Date/Time
    private String _dateAndTime;

    //photoCapture
    private String _photo;

    //missionCommander
    private String _missionCommander;

    public MissionCreated(){};


    public MissionCreated(String _climateType, double _altitude, double _latitude, double _longitude, String _dateAndTime, String _photo, String _missionCommander) {
        this._climateType = _climateType;
        this._altitude = _altitude;
        this._latitude = _latitude;
        this._longitude = _longitude;
        this._dateAndTime = _dateAndTime;
        this._photo = _photo;
        this._missionCommander = _missionCommander;
    }

    public String get_climateType() {
        return _climateType;
    }

    public void set_climateType(String _climateType) {
        this._climateType = _climateType;
    }

    public double get_altitude() {
        return _altitude;
    }

    public void set_altitude(double _altitude) {
        this._altitude = _altitude;
    }

    public double get_latitude() {
        return _latitude;
    }

    public void set_latitude(double _latitude) {
        this._latitude = _latitude;
    }

    public double get_longitude() {
        return _longitude;
    }

    public void set_longitude(double _longitude) {
        this._longitude = _longitude;
    }

    public String get_dateAndTime() {
        return _dateAndTime;
    }

    public void set_dateAndTime(String _dateAndTime) {
        this._dateAndTime = _dateAndTime;
    }

    public String get_photo() {
        return _photo;
    }

    public void set_photo(String _photo) {
        this._photo = _photo;
    }

    public String get_missionCommander() {
        return _missionCommander;
    }

    public void set_missionCommander(String _missionCommander) {
        this._missionCommander = _missionCommander;
    }
}
