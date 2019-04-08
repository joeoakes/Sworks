package edu.psu.ab.ist.sworks.pojo;

import android.content.ContentValues;

import edu.psu.ab.ist.sworks.database.DatabaseSetup;
import edu.psu.ab.ist.sworks.database.ISqlInsertHandler;

public class Magnetometer implements ISqlInsertHandler {
    private float _magX, _magY, _magZ;

    public Magnetometer() {}

    public Magnetometer(float x, float y, float z) {
        this._magX = x;
        this._magY = y;
        this._magZ = z;
    }

    public float getX() {
        return _magX;
    }

    public void setX(float magX) {
        this._magX = magX;
    }

    public float getY() {
        return _magY;
    }

    public void setY(float magY) {
        this._magY = magY;
    }

    public float getZ() {
        return _magZ;
    }

    public void setZ(float magZ) {
        this._magZ = magZ;
    }

    @Override
    public ContentValues columnValues() {
        ContentValues values = new ContentValues();
        values.put(DatabaseSetup.MAG_X, this._magX);
        values.put(DatabaseSetup.MAG_Y, this._magY);
        values.put(DatabaseSetup.MAG_Z, this._magZ);
        values.put(DatabaseSetup.TIME_STAMP, String.valueOf(new java.util.Date()));
        return values;
    }

    @Override
    public String tableName() {
        return DatabaseSetup.TABLE_MAGNETOMETER;
    }
}
