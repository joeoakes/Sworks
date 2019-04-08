/*
Project: PSA Grover Vehicle Sworks edition
Feature: Mission Status to handle go or no go mission situtation
Course: IST 440w Section 1 Fall 2019
Author: Joe Oakes
Date Developed: 4/8/2019
Last Date Changed:
Rev: development build 1
*/

package edu.psu.ab.ist.sworks.mission;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import java.util.Objects;
import edu.psu.ab.ist.sworks.exceptions.MissionStatusException;

public class MissionStatus {

    /**
     * Get the Phone Battery Level information
     *
     * @param context   The activity context
     * @param lowLevel  Lower power level threshold
     * @return          Current battery power level for phone
     * @throws MissionStatusException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public static int getBatteryLevel(Context context, int lowLevel) throws MissionStatusException{
            IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
            Intent batteryStatus = context.registerReceiver(null, ifilter);
            int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
            if (level > lowLevel) {
                return level;
            }
            else
            {
                throw new MissionStatusException("Battery Level too Low");
            }
    }

    /**
     * Try and connect to the Wifi device
     *
     * @param context   The activity context
     * @param ssid      Wifi Access Point to connect too
     * @return          Connected true or false
     * @throws          MissionStatusException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public static Boolean wifiConnected(Context context, String ssid) throws MissionStatusException {
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        if (wifiInfo.getSSID() != ssid) {
            throw new MissionStatusException("Not connected to Wifi PSU SSID");
        }
        else
        {
            return (wifiInfo.getSupplicantState() == SupplicantState.COMPLETED);
        }
    }

    /**
     * Try and connect to the mobile network
     *
     * @param context   The activity context
     * @return          Connected true or false
     * @throws          MissionStatusException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public static Boolean mobileConnected(Context context) throws MissionStatusException{
        ConnectivityManager cm = (ConnectivityManager) Objects.requireNonNull(context).getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm == null)
        {
            throw new MissionStatusException("Connection failure with Mobile Network");
        }
        NetworkInfo activeNetwork = Objects.requireNonNull(cm).getActiveNetworkInfo();
        return (activeNetwork != null);
    }

    /**
     * Try and connect to the mobile network and get speed
     *
     * @param context   The activity context
     * @return          Connected high speed true or false
     * @throws          MissionStatusException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public static Boolean mobileConnectedSpeed(Context context) throws MissionStatusException{
        ConnectivityManager cm = (ConnectivityManager) Objects.requireNonNull(context).getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm == null)
        {
            throw new MissionStatusException("Connection failure with Mobile Network");
        }
        NetworkInfo activeNetwork = Objects.requireNonNull(cm).getActiveNetworkInfo();
        Network network = cm.getActiveNetwork();
        if (network == null)
        {
            throw new MissionStatusException("Active Connection failure with Mobile Network");
        }
        NetworkCapabilities capabilities = cm.getNetworkCapabilities(network);
        return (capabilities != null && capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI));
    }

    /**
     * Try and connect to the bluetooth device
     *
     * @param context   The activity context
     * @param mac       The bluetooth media access code
     * @return          Connected true or false
     * @throws          MissionStatusException
     * @author          Joe Oakes
     * @version         1.0
     * @since           2019-04-08
     */
    public static Boolean bluetoothConnected(Context context, String mac)throws MissionStatusException{
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
         if (bluetoothAdapter == null) {
             throw new MissionStatusException("Device does not support Bluetooth");
         }
         //TODO: add bluetooth mac checking
         return true;
    }

}
