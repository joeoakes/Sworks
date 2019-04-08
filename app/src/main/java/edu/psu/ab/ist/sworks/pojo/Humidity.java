package edu.psu.ab.ist.sworks.pojo;

import android.content.ContentValues;

import edu.psu.ab.ist.sworks.database.DatabaseSetup;
import edu.psu.ab.ist.sworks.database.ISqlInsertHandler;

public class Humidity implements ISqlInsertHandler {
    private float _relativeHumidity;

    public Humidity() {}

    public Humidity(float relHumidity) {
        this._relativeHumidity = relHumidity;
    }

    public float getRelHumidity() {
        return _relativeHumidity;
    }

    public void setRelHumidity(float relHumidity) {
        this._relativeHumidity = relHumidity;
    }

    @Override
    public ContentValues columnValues() {
        ContentValues values = new ContentValues();
        values.put(DatabaseSetup.HUMIDITY_REL, this._relativeHumidity);
        values.put(DatabaseSetup.TIME_STAMP, String.valueOf(new java.util.Date()));
        return values;
    }

    @Override
    public String tableName() {
        return DatabaseSetup.TABLE_HUMIDITY;
    }
}
