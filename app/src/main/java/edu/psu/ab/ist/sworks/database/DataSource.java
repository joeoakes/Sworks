package edu.psu.ab.ist.sworks.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Project: PSA Grover Vehicle
 * Feature: Singleton for SQLite
 * Course: IST 440w Section 1 Fall 2019
 * Date Developed: 3/14/19
 * Last Date Changed: 3/15/2019
 * Rev: 1
 *
 * @author Mostafa Apu
 */
public class DataSource {
    private volatile static DataSource mDataSource;
    private SQLiteDatabase mDatabase;
    private SQLiteOpenHelper mDbHelper;

    // private constructor
    private DataSource() {}

    /**
     * @param context context
     */
    private DataSource(Context context) {
        mDbHelper = new DBHelper(context);
        mDatabase = mDbHelper.getWritableDatabase();
    }

    /**
     * only instance of the database
     *
     * @param context context
     * @return mDataSource
     */
    public static DataSource getInstance(Context context) {
        if (mDataSource == null) {
            // To make thread safe
            synchronized (DataSource.class) {
                // check again as multiple threads
                // can reach above step
                if (mDataSource == null)
                    mDataSource = new DataSource(context);
            }
        }
        return mDataSource;
    }

    /**
     * ready for the database to start writing
     */
    public void open() {
        mDatabase = mDbHelper.getWritableDatabase();
    }

    /**
     * close the database
     */
    public void close() {
        mDbHelper.close();
    }

    /**
     * insert to SQLite
     *
     * @param sensor any POJO
     * @throws SQLiteException SQLiteException
     */
    public void insertToSQL(ISqlInsertHandler sensor) throws SQLiteException {
        mDatabase.insert(sensor.tableName(), null, sensor.columnValues());
    }

    /**
     * returns all the rows in the table
     *
     * @param tableName table name
     * @return everything in from a table
     */
    public Cursor queryAllFromATable(String tableName) {
        return mDatabase.rawQuery(
                "select * from " +
                        tableName + "", null);
    }
}
