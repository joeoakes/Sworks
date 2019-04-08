package edu.psu.ab.ist.sworks.database;

/**
 * Project: PSA Grover Vehicle
 * Course: IST 440
 * Feature: Variables stored for database setup
 * Date Developed: 3/14/19
 * Last Date Changed: 3/15/2019
 * Rev: 1
 *
 * @author Conghao Lu
 */
public class DatabaseSetup {
    // time stamp
    public static final String TIME_STAMP = "SenDate";

    // GPS column names
    private static final String GPS_ID = "gpsID";
    public static final String TABLE_GPS = "GPS";
    public static final String GPS_LAT = "gpsLat";
    public static final String GPS_LONG = "gpsLong";
    public static final String GPS_AlT = "gpsAlt";
    public static final String GPS_BEARING = "gpsBearing";
    public static final String GPS_SPEED = "gpsSpeed";

    //Accelerometer column names
    public static final String TABLE_ACCE = "Accelerometer";
    public static final String ACCE_ID = "accelerometerID";
    public static final String ACCE_X = "accelerometerX";
    public static final String ACCE_Y = "accelerometerY";
    public static final String ACCE_Z = "accelerometerZ";

    //AmbientLight column names
    public static final String TABLE_AMBI = "AmbientLight";
    public static final String AMBI_ID = "AmbientLightID";
    public static final String AMBI_LUX = "AmbientLightLux";

    //Barometer column names
    public static final String TABLE_BARO = "Barometer";
    public static final String BARO_ID = "BarometerID";
    public static final String BARO_PRESSURE = "BarometerPressure";

    //Gyroscope column names
    public static final String TABLE_GYROSCOPE = "Gyroscope";
    public static final String GYRO_ID = "GyroscopeID";
    public static final String GYRO_X = "GyroscopeX";
    public static final String GYRO_Y = "GyroscopeY";
    public static final String GYRO_Z = "GyroscopeZ";

    //Humidity column names
    public static final String TABLE_HUMIDITY = "Humidity";
    public static final String HUMIDITY_ID = "HumidityID";
    public static final String HUMIDITY_REL = "RelHumidity";

    //Magnetometer column names
    public static final String TABLE_MAGNETOMETER = "Magnetometer";
    public static final String MAG_ID = "MagnetometerID";
    public static final String MAG_X = "MagnetometerX";
    public static final String MAG_Y = "MagnetometerY";
    public static final String MAG_Z = "MagnetometerZ";

    //Temp column names
    public static final String TABLE_TEMPERATURE = "Temperature";
    public static final String TEMPERATURE_ID = "TemperatureID";
    public static final String TEMPERATURE_VALUE = "TemperatureValue";

    //Climate column names
    public static final String TABLE_CLIMATE = "Climate";
    public static final String CLIMATE_ID = "ClimateID";
    public static final String CLIMATE_TYPE = "ClimateType";
    public static final String CLIMATE_TEMPLOW = "ClimateTempLow";
    public static final String CLIMATE_TEMPHIGH = "ClimateTempHigh";

    //Email column names
    public static final String TABLE_EMAIL = "Email";
    public static final String EMAIL_ID = "EmailID";
    public static final String EMAIL_RECIPIENT = "EmailRecipient";
    public static final String EMAIL_SENDER = "EmailSender";
    public static final String EMAIL_SUBJECT = "EmailSubject";
    public static final String EMAIL_BODY = "EmailBody";

    //Mission column names
    public static final String TABLE_MISSION = "Mission";
    public static final String MISSION_ID = "MissionID";
    public static final String MISSION_CLIMATE = "MissionClimate";
    public static final String MISSION_CONTINENT = "MissionContinent";
    public static final String MISSION_LANDMARKS = "MissionLandMarks";
    public static final String MISSION_TERRAIN = "MissionTerrain";


    // creates the GPS table
    static final String SQL_CREATE_GPS =
            "CREATE TABLE IF NOT EXISTS " + TABLE_GPS + "(" +
                    GPS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    GPS_LAT + " FLOAT, " +
                    GPS_LONG + " FLOAT, " +
                    GPS_AlT + " FLOAT, " +
                    GPS_BEARING + " FLOAT, " +
                    GPS_SPEED + " FLOAT, " +
                    TIME_STAMP + " TEXT);";

    // creates the Accelerometer table
    static final String SQL_CREATE_ACCE =
            "CREATE TABLE IF NOT EXISTS " + TABLE_ACCE + "(" +
                    ACCE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    ACCE_X + " FLOAT, " +
                    ACCE_Y + " FLOAT, " +
                    ACCE_Z + " FLOAT, " +
                    TIME_STAMP + " TEXT);";

    // creates the AmbientLight table
    static final String SQL_CREATE_AMBI =
            "CREATE TABLE IF NOT EXISTS " + TABLE_AMBI + "(" +
                    AMBI_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    AMBI_LUX + " FLOAT, " +
                    TIME_STAMP + " TEXT);";

    // creates the Barometer table
    static final String SQL_CREATE_BARO =
            "CREATE TABLE IF NOT EXISTS " + TABLE_BARO + "(" +
                    BARO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    BARO_PRESSURE + " FLOAT, " +
                    TIME_STAMP + " TEXT);";

    // creates the Gyroscope table
    static final String SQL_CREATE_GYRO =
            "CREATE TABLE IF NOT EXISTS " + TABLE_GYROSCOPE + "(" +
                    GYRO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    GYRO_X + " FLOAT, " +
                    GYRO_Y + " FLOAT, " +
                    GYRO_Z + " FLOAT, " +
                    TIME_STAMP + " TEXT);";

    // creates the Humidity table
    static final String SQL_CREATE_HUMIDITY =
            "CREATE TABLE IF NOT EXISTS " + TABLE_HUMIDITY + "(" +
                    HUMIDITY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    HUMIDITY_REL + " FLOAT, " +
                    TIME_STAMP + " TEXT);";

    // creates the Magnetometer table
    static final String SQL_CREATE_MAGNETOMETER =
            "CREATE TABLE IF NOT EXISTS " + TABLE_MAGNETOMETER + "(" +
                    MAG_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    MAG_X + " FLOAT, " +
                    MAG_Y + " FLOAT, " +
                    MAG_Z + " FLOAT, " +
                    TIME_STAMP + " TEXT);";

    // creates the Temp table
    static final String SQL_CREATE_TEMPERATURE =
            "CREATE TABLE IF NOT EXISTS " + TABLE_TEMPERATURE + "(" +
                    TEMPERATURE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    TEMPERATURE_VALUE + " FLOAT, " +
                    TIME_STAMP + " TEXT);";

    // creates the Climate table
    static final String SQL_CREATE_CLIMATE =
            "CREATE TABLE IF NOT EXISTS " + TABLE_CLIMATE + "(" +
                    CLIMATE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    CLIMATE_TYPE + " TEXT, " +
                    CLIMATE_TEMPHIGH + " FLOAT, " +
                    CLIMATE_TEMPLOW + " FLOAT, " +
                    TIME_STAMP + " TEXT);";

    // creates the Email table
    static final String SQL_CREATE_EMAIL =
            "CREATE TABLE IF NOT EXISTS " + TABLE_EMAIL + "(" +
                    EMAIL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    EMAIL_RECIPIENT + " TEXT, " +
                    EMAIL_SENDER + " TEXT, " +
                    EMAIL_SUBJECT + " TEXT, " +
                    EMAIL_BODY + " TEXT, " +
                    TIME_STAMP + " TEXT);";

    // creates the MISSION table
    static final String SQL_CREATE_MISSION =
            "CREATE TABLE IF NOT EXISTS " + TABLE_MISSION + "(" +
                    MISSION_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    MISSION_CLIMATE + " TEXT, " +
                    MISSION_CONTINENT + " TEXT, " +
                    MISSION_LANDMARKS + " TEXT, " +
                    MISSION_TERRAIN + " TEXT, " +
                    TIME_STAMP + " TEXT);";


    // drops the GPS table
    static final String SQL_DROP_GPS =
            "DROP TABLE " + TABLE_GPS;

    // drops the Accelerometer table
    static final String SQL_DROP_ACCE =
            "DROP TABLE " + TABLE_ACCE;

    // drops the AmbientLight table
    static final String SQL_DROP_AMBI =
            "DROP TABLE " + TABLE_AMBI;

    // drops the Barometer table
    static final String SQL_DROP_BARO =
            "DROP TABLE " + TABLE_BARO;

    // drops the Gyroscope table
    static final String SQL_DROP_GYRO =
            "DROP TABLE " + TABLE_GYROSCOPE;

    // drops the Humidity table
    static final String SQL_DROP_HUMIDITY =
            "DROP TABLE " + TABLE_HUMIDITY;

    // drops the Magnetometer table
    static final String SQL_DROP_MAGNETOMETER =
            "DROP TABLE " + TABLE_MAGNETOMETER;

    // drops the Temp table
    static final String SQL_DROP_TEMPERATURE =
            "DROP TABLE " + TABLE_TEMPERATURE;

    // drops the Climate table
    static final String SQL_DROP_CLIMATE =
            "DROP TABLE " + TABLE_CLIMATE;

    // drops the Email table
    static final String SQL_DROP_EMAIL =
            "DROP TABLE " + TABLE_EMAIL;

    // drops the Mission table
    static final String SQL_DROP_MISSION =
            "DROP TABLE " + TABLE_MISSION;
}



