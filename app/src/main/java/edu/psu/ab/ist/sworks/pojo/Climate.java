package edu.psu.ab.ist.sworks.pojo;

import android.app.Activity;
import android.util.Log;

//import edu.psu.ab.ist.sworks.MissionTemplateWebService;

/*
Project: PSA Grover Vehicle
Feature: Mission Climate Templates
Course: IST 440w Section 1 Fall 2019
Author: Nathan Hull, Jennifer A'Harrah
Date Developed: 3/09/19
Last Date Changed: 3/13/19
Rev: 4
*/

public class Climate
{
    private String _climateType;
    private float _tempMin, _tempMax, _humidMin, _humidMax, _baroMin, _baroMax;

    /**
     * Gets climate type.
     *
     * @return the climate type
     */
    public String get_climateType()
    {
        return _climateType;
    }

    /**
     * Sets climate type.
     *
     * @param climateType the climate type
     */
    public void set_climateType(String climateType)
    {
        this._climateType = climateType;

    }

    /**
     * Gets temp max.
     *
     * @return the temp max
     */
    public float get_tempMax()
    {
        return _tempMax;
    }

    /**
     * Sets temp max.
     *
     * @param tempMax the temp max
     */
    public void  set_tempMax(float tempMax) {this._tempMax = tempMax; }

    /**
     * Gets temp min.
     *
     * @return the temp min
     */
    public float get_tempMin()
    {
        return _tempMin;
    }

    /**
     * Sets temp min.
     *
     * @param tempMin the temp min
     */
    public void  set_tempMin(float tempMin) {this._tempMin = tempMin; }

    /**
     * Gets humid min.
     *
     * @return the humid min
     */
    public float get_humidMin() { return _humidMin; }

    /**
     * Sets humid min.
     *
     * @param humidMin the humid min
     */
    public void set_humidMin(float humidMin) {this._humidMin = humidMin; }

    /**
     * Gets humid max.
     *
     * @return the humid max
     */
    public float get_humidMax() { return _humidMax; }

    /**
     * Sets humid max.
     *
     * @param humidMax the humid max
     */
    public void set_humidMax(float humidMax) {this._humidMax = humidMax; }

    /**
     * Gets baro min.
     *
     * @return the baro min
     */
    public float get_baroMin() { return _baroMin; }

    /**
     * Sets baro min.
     *
     * @param baroMin the baro min
     */
    public void set_baroMin(float baroMin) {this._baroMin = baroMin; }

    /**
     * Gets baro max.
     *
     * @return the baro max
     */
    public float get_baroMax() { return _baroMax; }

    /**
     * Sets baro max.
     *
     * @param baroMax the baro max
     */
    public void  set_baroMax(float baroMax) {this._baroMax = baroMax; }

    /**
     * Calls the MissionTemplateWebService based on the climate type specified by the user.
     * The web service will contact ServiceNow and retrieve the mission parameters for that climate.
     * If successful, onPostExecute will set the temperature, humidity and barometric pressure.
     *
     * @param climateType The climate type selected by the user from the drop down menu.
     * @param activity    The current activity from the mission fragment when the method is invoked
     * @author Nathan Hull
     */
    public void getMissionTemplate(String climateType, Activity activity)
    {
        try
        {
            if (climateType != "")
            {
               // MissionTemplateWebService getMission = new MissionTemplateWebService(activity);
                //Removes the whitespace from the climate type, if any, to match the database
                //climateType = get_climateType().replaceAll("\\s","");
                //getMission.execute(climateType);
            }

        } catch (Exception e)
        {
            Log.e("Climate/FragmentMission", e.toString());
        }
    }
}

