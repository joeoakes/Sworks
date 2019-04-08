package edu.psu.ab.ist.sworks.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Project: PSA Grover Vehicle
 * Feature: Database Helper Class
 * Course: IST 440w Section 1 Fall 2019
 * Date Developed: 3/14/19
 * Last Date Changed: 3/15/2019
 * Rev: 1
 *
 * @author Conghao Lu
 */
public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_FILE_NAME = "rover.db";
    private static final int DB_VERSION = 1;


    /**
     * @param context context
     */
    DBHelper(Context context) {
        super(context, DB_FILE_NAME, null, DB_VERSION);
    }


    /**
     * Create Tables
     *
     * @param db SQLite Database
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // create all the table here
        db.execSQL(DatabaseSetup.SQL_CREATE_GPS);
        db.execSQL(DatabaseSetup.SQL_CREATE_ACCE);
        db.execSQL(DatabaseSetup.SQL_CREATE_AMBI);
        db.execSQL(DatabaseSetup.SQL_CREATE_BARO);
        db.execSQL(DatabaseSetup.SQL_CREATE_GYRO);
        db.execSQL(DatabaseSetup.SQL_CREATE_HUMIDITY);
        db.execSQL(DatabaseSetup.SQL_CREATE_MAGNETOMETER);
        db.execSQL(DatabaseSetup.SQL_CREATE_TEMPERATURE);
        db.execSQL(DatabaseSetup.SQL_CREATE_CLIMATE);
        db.execSQL(DatabaseSetup.SQL_CREATE_EMAIL);
        db.execSQL(DatabaseSetup.SQL_CREATE_MISSION);
    }

    /**
     * Drops Tables
     *
     * @param db SQLite Database
     * @param i  Integer
     * @param i1 Integer
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        // drop all the table here
        db.execSQL(DatabaseSetup.SQL_DROP_GPS);
        db.execSQL(DatabaseSetup.SQL_DROP_ACCE);
        db.execSQL(DatabaseSetup.SQL_DROP_AMBI);
        db.execSQL(DatabaseSetup.SQL_DROP_BARO);
        db.execSQL(DatabaseSetup.SQL_DROP_GYRO);
        db.execSQL(DatabaseSetup.SQL_DROP_HUMIDITY);
        db.execSQL(DatabaseSetup.SQL_DROP_MAGNETOMETER);
        db.execSQL(DatabaseSetup.SQL_DROP_TEMPERATURE);
        db.execSQL(DatabaseSetup.SQL_DROP_CLIMATE);
        db.execSQL(DatabaseSetup.SQL_DROP_EMAIL);
        db.execSQL(DatabaseSetup.SQL_DROP_MISSION);

        onCreate(db);
    }
}
