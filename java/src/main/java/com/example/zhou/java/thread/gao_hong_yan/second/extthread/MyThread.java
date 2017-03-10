package com.example.zhou.java.thread.gao_hong_yan.second.extthread;

import com.example.zhou.java.thread.gao_hong_yan.second.myservice.Service;

/**
 * Created by Mr_Zhou on 2017/1/19.
 */

public class MyThread extends Thread
{
    @Override
    public void run()
    {
        Service service = new Service();
        service.service1();
    }
}
