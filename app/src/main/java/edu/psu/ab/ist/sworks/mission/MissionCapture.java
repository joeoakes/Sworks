/*
Project: PSA Grover Vehicle Sworks edition
Feature: Mission Data Capture
Course: IST 440w Section 1 Fall 2019
Author: Joe Oakes
Date Developed: 4/8/2019
Last Date Changed:
Rev: development build 1
*/
package edu.psu.ab.ist.sworks.mission;

import edu.psu.ab.ist.sworks.exceptions.MissionCaptureException;
import edu.psu.ab.ist.sworks.pojo.*;

public class MissionCapture {

     /**
     * Get Accelerometer Data from the Phone sensor
     *
     * @param
     * @param
     * @return          Accelerometer POJO
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public Accelerometer getAccelerometerData() throws MissionCaptureException {
        return new Accelerometer();
        //throw new MissionCaptureException("Accelerometer Cannot get Data");
    }

    /**
     * Save Accelerometer Data from the Phone sensor
     *
     * @param           Accelerometer POJO
     * @param
     * @return
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public void saveAccelerometerData(Accelerometer accelerometer) throws MissionCaptureException {
        //TODO save accelerometer to DB
        //throw new MissionCaptureException("Accelerometer Cannot save the Data");
    }

    /**
     * Get Ambient Light Data from the Phone sensor
     *
     * @param
     * @param
     * @return          AmbientLight POJO
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public AmbientLight getAmbientLightData() throws MissionCaptureException {
        return new AmbientLight();
    }

    /**
     * Save the Ambient Light Data from the Phone sensor
     *
     * @param           AmbientLight POJO
     * @param
     * @return
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public void saveAmbientLightData(AmbientLight ambientLight) throws MissionCaptureException {
        //TODO save AmbientLight to DB
    }




}
