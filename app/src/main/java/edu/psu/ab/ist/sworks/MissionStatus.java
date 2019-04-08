package edu.psu.ab.ist.sworks;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
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

public class MissionStatus {

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

    public static Boolean mobileConnected(Context context) throws MissionStatusException{
        ConnectivityManager cm = (ConnectivityManager) Objects.requireNonNull(context).getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm == null)
        {
            throw new MissionStatusException("Connection failure with Mobile Network");
        }
        NetworkInfo activeNetwork = Objects.requireNonNull(cm).getActiveNetworkInfo();
        return (activeNetwork != null);
    }

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

    public static Boolean bluetoothConnected(Context context, String mac)throws MissionStatusException{
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
         if (bluetoothAdapter == null) {
             throw new MissionStatusException("Device does not support Bluetooth");
         }
         return true;
    }

}
