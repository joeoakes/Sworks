package edu.psu.ab.ist.sworks.pojo;

import android.content.ContentValues;

import edu.psu.ab.ist.sworks.database.DatabaseSetup;
import edu.psu.ab.ist.sworks.database.ISqlInsertHandler;

public class GPS implements ISqlInsertHandler
{
    private float _bearing, _speed;
    private double _latitude, _longitude, _altitude;

    public GPS() {}

    public GPS(double lat, double lon, double alt, float bear, float speed)
    {
        this._latitude = lat;
        this._longitude = lon;
        this._altitude = alt;
        this._bearing = bear;
        this._speed = speed;
    }

    public double getLatitude()
    {
        return _latitude;
    }

    public void setLatitude(double latitude)
    {
        this._latitude = latitude;
    }

    public double getLongitude()
    {
        return _longitude;
    }

    public void setLongitude(double longitude)
    {
        this._longitude = longitude;
    }

    public double getAltitude()
    {
        return _altitude;
    }

    public void setAltitude(double altitude)
    {
        this._altitude = altitude;
    }

    public float getBearing()
    {
        return _bearing;
    }

    public void setBearing(float bearing)
    {
        this._bearing = bearing;
    }

    public float getSpeed()
    {
        return _speed;
    }

    public void setSpeed(float speed)
    {
        this._speed = speed;
    }

    @Override
    public ContentValues columnValues()
    {
        ContentValues values = new ContentValues();
        values.put(DatabaseSetup.GPS_LAT, this._latitude);
        values.put(DatabaseSetup.GPS_LONG, this._longitude);
        values.put(DatabaseSetup.GPS_AlT, this._altitude);
        values.put(DatabaseSetup.GPS_SPEED, this._speed);
        values.put(DatabaseSetup.GPS_BEARING, this._bearing);
        values.put(DatabaseSetup.TIME_STAMP, String.valueOf(new java.util.Date()));
        return values;
    }

    @Override
    public String tableName()
    {
        return DatabaseSetup.TABLE_GPS;
    }
}
