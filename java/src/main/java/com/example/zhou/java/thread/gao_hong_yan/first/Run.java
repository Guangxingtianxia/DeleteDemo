package com.example.zhou.java.thread.gao_hong_yan.first;

import java.nio.channels.NotYetBoundException;

/**
 * Created by Mr_Zhou on 2017/1/15.
 */

public class Run
{
    public static void main(String[] args)
    {

        // 1
        //        myThread.setName("myThread");
        //
        //        myThread.start();
        //
        //        try
        //        {
        //            for (int i = 0; i < 10; i++)
        //            {
        //                int time = (int) (Math.random() * 1000);
        //
        //                Thread.sleep(time);
        //
        //                System.out.println("main=" + Thread.currentThread().getName());
        //            }
        //
        //        }
        //        catch (InterruptedException e)
        //        {
        //            e.printStackTrace();
        //        }

        //===============================================
        // 2
        //
        //        MyThread t11 = new MyThread(1);
        //        MyThread t12 = new MyThread(2);
        //        MyThread t13 = new MyThread(3);
        //        MyThread t14 = new MyThread(4);
        //        MyThread t15 = new MyThread(5);
        //        MyThread t16 = new MyThread(6);
        //        t11.start();
        //        t12.start();
        //        t13.start();
        //        t14.start();
        //        t15.start();

        //===============================================
        // 3
        //        Runnable runnable = new MyRunnable();
        //        Thread thread = new Thread(runnable);
        //        thread.start();
        //        System.out.println("线程运行结束");
        //=============4:线程与实例变量==================================
        //        System.out.println("============= 4:线程与实例变量======线程不安全,在线程的回调方法加入：synchronzied
        // 关键字就实现了线程安全");
        //        MyThread myThread = new MyThread();
        //        Thread a = new Thread(myThread,"A");
        //        Thread b = new Thread(myThread,"B");
        //        Thread c = new Thread(myThread,"C");
        //        Thread d = new Thread(myThread,"D");
        //        Thread e = new Thread(myThread,"E");
        //        a.start();
        //        b.start();
        //        c.start();
        //        d.start();
        //        e.start();

        //=============5:==================================
        System.out.println("============= 5:线程与实例变量======");
        //        MyThread run = new MyThread();
        //        Thread t1 = new Thread(run);
        //        Thread t2 = new Thread(run);
        //        Thread t3 = new Thread(run);
        //        Thread t4 = new Thread(run);
        //        Thread t5 = new Thread(run);
        //        t1.start();
        //        t2.start();
        //        t3.start();
        //        t4.start();
        //        t5.start();


        //=============6:==================================
        System.out.println("============= 6:构造方法与run方法的调用======");
//
//        CountOperate c = new CountOperate();
//        Thread t1 = new Thread(c);
//        t1.setName("A");
//        t1.start();
//        // 线程中止
//        t1.interrupt();
//        t1.stop();


        //============= 7: 线程的停止==================================
        System.out.println("============= 7:线程的停止======");

        try
        {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1？：==》"+thread.isInterrupted());


        }
        catch (InterruptedException e)
        {
            System.out.println("main catch");
            e.printStackTrace();
        }








    }
}
