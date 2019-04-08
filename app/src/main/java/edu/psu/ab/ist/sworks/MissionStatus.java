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

    public static int getBatteryLevel(Context context) throws CustomException{
            IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
            Intent batteryStatus = context.registerReceiver(null, ifilter);
            int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
            if (level > 10) {
                return level;
            }
            else
            {
                throw new CustomException("Battery Level too Low");
            }
    }

    public static Boolean wifiConnected(Context context) throws CustomException {
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        if ((wifiInfo.getSSID() == "PSU") && (wifiInfo.getSupplicantState() == SupplicantState.COMPLETED)) {
            return true;
        }
        else
        {
            throw new CustomException("Not connected to Wifi PSU SSID");
        }
    }

    public Boolean mobileConnected(){
        return true;
    }

    public Boolean mobileConnectedHighSpeed(){
        return true;
    }

    public Boolean bluetoothConneted(){
        return true;
    }

}
