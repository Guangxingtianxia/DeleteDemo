package com.example.zhou.java.thread.gao_hong_yan.second.extthread;

import com.example.zhou.java.thread.gao_hong_yan.second.service.Sub;

/**
 * Created by Mr_Zhou on 2017/1/21.
 */

public class MyThreadB extends Thread
{
    private Sub sub;

    public MyThreadB(Sub sub)
    {
        super();
        this.sub = sub;
    }

    @Override
    public void run()
    {
        sub.serviceMethrd();
    }

}
