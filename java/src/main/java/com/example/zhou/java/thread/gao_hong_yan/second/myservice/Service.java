package com.example.zhou.java.thread.gao_hong_yan.second.myservice;

/**
 * Created by Mr_Zhou on 2017/1/19.
 */

public class Service
{
    synchronized  public  void service1()
    {
        System.out.println("service1");
        service2();
    }

   synchronized public void service2()
    {
        System.out.println("service2");
        service3();

    }

    synchronized public void service3()
    {
        System.out.println("service3");

    }

}
