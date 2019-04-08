package edu.psu.ab.ist.sworks.pojo;

import android.content.ContentValues;

import edu.psu.ab.ist.sworks.database.DatabaseSetup;
import edu.psu.ab.ist.sworks.database.ISqlInsertHandler;

public class Gyroscope implements ISqlInsertHandler {
    private float _gyroX, _gyroY, _gyroZ;

    public Gyroscope() { }

    public Gyroscope(float x, float y, float z) {
        this._gyroX = x;
        this._gyroY = y;
        this._gyroZ = z;
    }

    public float getX() {
        return _gyroX;
    }

    public void setX(float gyroX) {
        this._gyroX = gyroX;
    }

    public float getY() {
        return _gyroY;
    }

    public void setY(float gyroY) {
        this._gyroY = gyroY;
    }

    public float getZ() {
        return _gyroZ;
    }

    public void setZ(float gyroZ) {
        this._gyroZ = gyroZ;
    }

    @Override
    public ContentValues columnValues() {
        ContentValues values = new ContentValues();
        values.put(DatabaseSetup.GYRO_X, this._gyroX);
        values.put(DatabaseSetup.GYRO_Y, this._gyroY);
        values.put(DatabaseSetup.GYRO_Z, this._gyroZ);
        values.put(DatabaseSetup.TIME_STAMP, String.valueOf(new java.util.Date()));
        return values;
    }

    @Override
    public String tableName() {
        return DatabaseSetup.TABLE_GYROSCOPE;
    }
}