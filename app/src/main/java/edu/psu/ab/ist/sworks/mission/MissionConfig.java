/*
Project: PSA Grover Vehicle Sworks edition
Feature: Mission Configuration Details
Course: IST 440w Section 1 Fall 2019
Author: Joe Oakes
Date Developed: 4/8/2019
Last Date Changed:
Rev: development build 1
*/
package edu.psu.ab.ist.sworks.mission;

import edu.psu.ab.ist.sworks.exceptions.MissionConfigException;
import edu.psu.ab.ist.sworks.pojo.*;

public class MissionConfig {

    public MissionConfs getWebServiceMissionConfig() throws MissionConfigException {
        return new MissionConfs();
    }

    public void setWebServiceMissionConfig(MissionConfs missionConfs) throws MissionConfigException {

    }
}
