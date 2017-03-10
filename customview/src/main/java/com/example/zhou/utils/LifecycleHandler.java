package com.example.zhou.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/**
 * Created by Mr_Zhou on 2017/2/5.
 */

public class LifecycleHandler implements Application.ActivityLifecycleCallbacks
{
     //I use four separate variables here. You can, of course, just use two and
    // increment/decrement them instead of using four and incrementing them all.
    private int resumed;
    private int paused;
    private int started;
    private int stopped;

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState)
    {

    }

    @Override
    public void onActivityStarted(Activity activity)
    {
        ++started;
    }

    @Override
    public void onActivityResumed(Activity activity)
    {
        ++resumed;
    }

    @Override
    public void onActivityPaused(Activity activity)
    {
        ++paused;
        android.util.Log.w("test", "application is in foreground: " + (resumed > paused));
    }

    @Override
    public void onActivityStopped(Activity activity)
    {
        ++stopped;
        android.util.Log.w("test", "application is visible: " + (started > stopped));
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState)
    {

    }

    @Override
    public void onActivityDestroyed(Activity activity)
    {

    }
}
