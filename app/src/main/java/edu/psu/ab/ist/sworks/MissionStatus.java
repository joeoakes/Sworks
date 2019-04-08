package edu.psu.ab.ist.sworks;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;

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

    public Boolean mobileConnected() throws MissionStatusException{
        return true;
    }

    public Boolean mobileConnectedSpeed() throws MissionStatusException{
        return true;
    }

    public Boolean bluetoothConneted()throws MissionStatusException{
        return true;
    }

}
