package com.example.zhou.java.thread.gao_hong_yan.first;

/**
 * Created by Mr_Zhou on 2017/1/19.
 */

public class CountOperate extends Thread
{
    public CountOperate()
    {
        System.out.println("CountOPerate---begin");
        System.out.println("Thread.curentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run()
    {
        System.out.println("run---begin");
        System.out.println("Thread.curentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("run---end");
    }
}
