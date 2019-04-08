package edu.psu.ab.ist.sworks.database;

import android.content.ContentValues;

public interface ISqlInsertHandler
{
    // all POJO class must implement this
    // adds all the columns and values to ContentValues
    // as well as a column for timestamp
    ContentValues columnValues();

    // table name for inserting
    String tableName();
}
