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

    /**
     * Get Barometer Data from the Phone sensor
     *
     * @param
     * @param
     * @return          Barometer POJO
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public Barometer getBarometerData() throws MissionCaptureException {
        return new Barometer();
    }

    /**
     * Save the Barometer Data from the Phone sensor
     *
     * @param           Barometer POJO
     * @param
     * @return
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public void saveBarometerData(Barometer barometer) throws MissionCaptureException {
        //TODO saveBarometer to DB
    }

    /**
     * Get GPS Data from the Phone sensor
     *
     * @param
     * @param
     * @return          GPS POJO
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public GPS getGPSData() throws MissionCaptureException {
        return new GPS();
    }

    /**
     * Save the GPS Data from the Phone sensor
     *
     * @param           GPS POJO
     * @param
     * @return
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public void saveGPSData(GPS gps) throws MissionCaptureException {
        //TODO save GPS to DB
    }

    /**
     * Get Gyroscope Data from the Phone sensor
     *
     * @param
     * @param
     * @return          Gyroscope POJO
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public Gyroscope getGyroscopeData() throws MissionCaptureException {
        return new Gyroscope();
    }

    /**
     * Save the Gyroscope Data from the Phone sensor
     *
     * @param           Gyroscope POJO
     * @param
     * @return
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public void saveGyroscopeData(Gyroscope gyroscope) throws MissionCaptureException {
        //TODO save Gyroscope to DB
    }

    /**
     * Get Humidity Data from the Phone sensor
     *
     * @param
     * @param
     * @return          Humidity POJO
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public Humidity getHumidityData() throws MissionCaptureException {
        return new Humidity();
    }

    /**
     * Save the Humidity Data from the Phone sensor
     *
     * @param           Humidity POJO
     * @param
     * @return
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public void saveHumidityData(Humidity humidity) throws MissionCaptureException {
        //TODO save Humidity to DB
    }

    /**
     * Get Magnetometer Data from the Phone sensor
     *
     * @param
     * @param
     * @return          Magnetometer POJO
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public Magnetometer getMagnetometerData() throws MissionCaptureException {
        return new Magnetometer();
    }

    /**
     * Save the Magnetometer Data from the Phone sensor
     *
     * @param           Magnetometer POJO
     * @param
     * @return
     * @throws          MissionCaptureException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public void saveMagnetometerData(Magnetometer magnetometer) throws MissionCaptureException {
        //TODO save Humidity to DB
    }


}
