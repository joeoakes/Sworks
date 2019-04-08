package edu.psu.ab.ist.sworks.pojo;

/*
Project: PSA Grover Vehicle
Feature: Accelerometer class
Course: IST 440w Section 1 Fall 2019
Author: Jennifer A'Harrah, Nathan Hull
Date Developed: 2/8/19
Last Date Changed: 3/15/19
Rev: 3
*/

import android.content.ContentValues;

import edu.psu.ab.ist.sworks.database.DatabaseSetup;
import edu.psu.ab.ist.sworks.database.ISqlInsertHandler;

/**
 * The type Accelerometer.
 */
public class Accelerometer implements ISqlInsertHandler {
    private float _accelX, _accelY, _accelZ;

    public Accelerometer() {}

    /**
     * Instantiates a new Accelerometer.
     *
     * @param x the x position of the accelerometer
     * @param y the y position of the accelerometer
     * @param z the z position of the accelerometer
     * @author Nathan Hull
     */
    public Accelerometer(float x, float y, float z) {
        this._accelX = x;
        this._accelY = y;
        this._accelZ = z;
    }

    /**
     * Gets x position of the accelerometer.
     *
     * @return the x position of the accelerometer
     * @author Nathan Hull
     */
    public float getX() {
        return _accelX;
    }

    /**
     * Sets x position of the accelerometer.
     *
     * @param x the y position of the accelerometer
     * @author Nathan Hull
     */
    public void setX(float x) {
        this._accelX = x;
    }

    /**
     * Gets y position of the accelerometer.
     *
     * @return the y position of the accelerometer
     * @author Nathan Hull
     */
    public float getY() {
        return _accelY;
    }

    /**
     * Sets y position of the accelerometer.
     *
     * @param y the y position of the accelerometer
     * @author Nathan Hull
     */
    public void setY(float y) {
        this._accelY = y;
    }

    /**
     * Gets z position of the accelerometer.
     *
     * @return the z y position of the accelerometer
     * @author Nathan Hull
     */
    public float getZ() {
        return _accelZ;
    }

    /**
     * Sets z position of the accelerometer.
     *
     * @param z the z y position of the accelerometer
     * @author Nathan Hull
     */
    public void setZ(float z) {
        this._accelZ = z;
    }

    @Override
    public ContentValues columnValues() {
        ContentValues values = new ContentValues();
        values.put(DatabaseSetup.ACCE_X, this._accelX);
        values.put(DatabaseSetup.ACCE_Y, this._accelY);
        values.put(DatabaseSetup.ACCE_Z, this._accelZ);
        values.put(DatabaseSetup.TIME_STAMP, String.valueOf(new java.util.Date()));
        return values;
    }

    @Override
    public String tableName() {
        return DatabaseSetup.TABLE_ACCE;
    }
}
