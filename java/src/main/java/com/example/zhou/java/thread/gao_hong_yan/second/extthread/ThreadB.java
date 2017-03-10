package com.example.zhou.java.thread.gao_hong_yan.second.extthread;

import com.example.zhou.java.thread.gao_hong_yan.second.extobject.MyObject;
import com.example.zhou.java.thread.gao_hong_yan.second.service.HasSelfPrivateNum;
import com.example.zhou.java.thread.gao_hong_yan.second.service.Service;

/**
 * Created by Mr_Zhou on 2017/1/19.
 */

public class ThreadB extends Thread
{
    private HasSelfPrivateNum numRef;
    private MyObject mObject;
    private Service mService;

    public ThreadB(Service mObject)
    {
        this.mService = mObject;
    }

    @Override
    public void run()
    {
        super.run();
//        mObject.methordB();
        mService.testMethod();
    }
}






















