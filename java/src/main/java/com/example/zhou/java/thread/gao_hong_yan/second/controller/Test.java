package com.example.zhou.java.thread.gao_hong_yan.second.controller;

import com.example.zhou.java.thread.gao_hong_yan.second.extthread.MyThread;
import com.example.zhou.java.thread.gao_hong_yan.second.extthread.MyThreadA;
import com.example.zhou.java.thread.gao_hong_yan.second.extthread.MyThreadB;
import com.example.zhou.java.thread.gao_hong_yan.second.extthread.ThreadA;
import com.example.zhou.java.thread.gao_hong_yan.second.extthread.ThreadB;
import com.example.zhou.java.thread.gao_hong_yan.second.service.Service;
import com.example.zhou.java.thread.gao_hong_yan.second.service.Sub;

import java.io.IOException;

/**
 * Created by Mr_Zhou on 2017/1/20.
 */

public class Test
{
    public static void main(String[] args)
    {
        //            Service service = new Service();
        //            ThreadA a = new ThreadA(service);
        //            a.setName("a");
        //            a.start();
        //            Thread.sleep(500);
        //            ThreadB b = new ThreadB(service);
        //            b.setName("b");
        //            b.start();


        // 同步不具有继承性
        Sub subRef = new Sub();
        MyThreadA a = new MyThreadA(subRef);
        a.setName("A");
        a.start();


        MyThreadB b = new MyThreadB(subRef);
        b.setName("B");
        b.start();


    }
}
