package com.example.zhou.java.thread.gao_hong_yan.second.extthread;

import com.example.zhou.java.thread.gao_hong_yan.second.entity.PublicVar;
import com.example.zhou.java.thread.gao_hong_yan.second.extobject.MyObject;
import com.example.zhou.java.thread.gao_hong_yan.second.service.HasSelfPrivateNum;
import com.example.zhou.java.thread.gao_hong_yan.second.service.Service;

/**
 * Created by Mr_Zhou on 2017/1/19.
 */

public class ThreadA extends Thread
{
    //    private HasSelfPrivateNum numRef;
    private MyObject mObject;
    private PublicVar mPublicVar;

    //    public ThreadA(HasSelfPrivateNum numRef)
    //    {
    //        this.numRef = numRef;
    //    }


    private Service mService;

    public ThreadA(Service mObject)
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






















