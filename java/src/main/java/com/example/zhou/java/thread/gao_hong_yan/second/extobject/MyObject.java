package com.example.zhou.java.thread.gao_hong_yan.second.extobject;

import javax.xml.transform.Source;

/**
 * Created by Mr_Zhou on 2017/1/19.
 */

public class MyObject
{
    synchronized public  void methordA()
    {
        try
        {
            System.out.println("begin methordA threadName="
            + Thread.currentThread().getName());

            Thread.sleep(5000);
            System.out.println("end");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    synchronized   public  void methordB()
    {
        try
        {
            System.out.println("begin methordB threadName="
            + Thread.currentThread().getName());

            Thread.sleep(5000);
            System.out.println("end");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }













}
