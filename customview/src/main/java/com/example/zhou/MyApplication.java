package com.example.zhou;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;

import com.example.zhou.utils.LifecycleHandler;

/**
 * Created by Mr_Zhou on 2017/2/5.
 */

public class MyApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        registerActivityLifecycleCallbacks(new LifecycleHandler());
    }

    public static boolean isLowEndHardware(Context context) {
        ActivityManager am = (ActivityManager) context.getSystemService(ACTIVITY_SERVICE);
//        if (VersionUtils.hasKitkat()) {
//            return am.isLowRamDevice();
//        } else if (VersionUtils.hasJellyBean()) {
//            ActivityManager.MemoryInfo mi = new ActivityManager.MemoryInfo();
//            am.getMemoryInfo(mi);
//            return mi.totalMem < (512 * 1024 * 1024);
//        } else {
//            return Runtime.getRuntime().availableProcessors() == 1;
//        }

        return false;
    }
}
