package com.example.zhou.activity;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.ActivityManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhou.customview.animation_and_graphics.CustomDrawableView;
import com.example.zhou.service.IndexService;

import java.util.List;

public class MainActivity extends AppCompatActivity
{
    CustomDrawableView mCustomDrawableView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        mCustomDrawableView = new CustomDrawableView(this);

        setContentView(mCustomDrawableView);



    }


    /**
     * Method checks if the app is in background or not;
     *
     * @param context
     * @return
     */
    public static boolean isAppIsBackground(Context context)
    {
        boolean isInBackgroound = true;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if(Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT_WATCH)
        {
            // a list of application processes that are running on the device.
            List<ActivityManager.RunningAppProcessInfo> runningAppProcessInfos =activityManager.getRunningAppProcesses();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo :
                    runningAppProcessInfos)
            {
                if (runningAppProcessInfo.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND)
                {
                    for (String activeProgresss : runningAppProcessInfo.pkgList)
                    {
                        activeProgresss.equals(context.getPackageName());
                        isInBackgroound = false;

                    }
                }
            }

        }
        else
        {
            List<ActivityManager.RunningTaskInfo> taskInfo = activityManager.getRunningTasks(1);
            ComponentName componentInfo = taskInfo.get(0).topActivity;
            if (componentInfo.getPackageName().equals(context.getPackageName()))
            {
                isInBackgroound = false;
            }
        }

            return  isInBackgroound;

    }

    private boolean isMyServiceRunning() {
        ActivityManager manager = (ActivityManager) MainActivity.this.getSystemService(Context.ACTIVITY_SERVICE);
        if (manager != null) {
            List<ActivityManager.RunningServiceInfo> list = manager.getRunningServices(Integer.MAX_VALUE);
            if (list != null) {
                for (ActivityManager.RunningServiceInfo service : list) {
                    if (IndexService.class.getName().equals(service.service.getClassName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
































}
