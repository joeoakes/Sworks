package edu.psu.ab.ist.sworks;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import edu.psu.ab.ist.sworks.mission.MissionStatus;
import android.util.Log;

//assertEquals();
//assertTrue();
//assertFalse();
//equalsRegardingNull();
//isEquals();
//assertNotEquals();
//failEquals()
//assertArrayEquals();
//assertNotSame();
//assertSame();
//assertThat();
//

@RunWith(AndroidJUnit4.class)
public class MissionStatusUnitTests {

    @Test
    public void getBatteryLevelUnitTest(){
        Context appContext = InstrumentationRegistry.getTargetContext();
        try {
            assertTrue(MissionStatus.getBatteryLevel(appContext.getApplicationContext(), 10) > 10);
        } catch (Exception e) {
            Log.e("Battery Level Unit Test", e.getMessage());
        }
    }

    @Test
    public void wifiConnectedUnitTestTrue() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        try {
            assertTrue(MissionStatus.wifiConnected(appContext.getApplicationContext(), "PSU"));
        } catch (Exception e) {
            Log.e("Wifi Unit Test", e.getMessage());
        }
    }

    @Test
    public void mobileConnectedUnitTest(){
        Context appContext = InstrumentationRegistry.getTargetContext();
        try {
            assertTrue(MissionStatus.mobileConnected(appContext.getApplicationContext()));
        } catch (Exception e) {
            Log.e("Mobile Connected Unit Test", e.getMessage());
        }
    }

    @Test
    public void mobileConnectedSpeedUnitTest(){
        Context appContext = InstrumentationRegistry.getTargetContext();
        try {
            assertTrue(MissionStatus.mobileConnectedSpeed(appContext.getApplicationContext()));
        } catch (Exception e) {
            Log.e("mobile Connected Speed Unit Test", e.getMessage());
        }
    }

    @Test
    public void bluetoothConnectedSpeedUnitTest(){
        Context appContext = InstrumentationRegistry.getTargetContext();
        try {
            assertTrue(MissionStatus.bluetoothConnected(appContext.getApplicationContext(), "MAC"));
        } catch (Exception e) {
            Log.e("bluetooth Unit Test", e.getMessage());
        }
    }


}
