package com.example.zhou.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public class IndexService extends Service
{
    Context mContext;

    public IndexService()
    {
    }

    @Override
    public IBinder onBind(Intent intent)
    {
       return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        mContext = this;
        start();
        return (START_NOT_STICKY);
    }

    private void start()
    {
        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
            }
        };
    }

    @Override
    public void onDestroy()
    {
        // 父类方法
        stopForeground(true);

    }





}
