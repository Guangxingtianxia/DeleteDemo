package com.example.zhou.java.thread;

import static java.lang.Thread.yield;

/**
 * Created by Mr_Zhou on 2017/1/7.
 * A.yield，A让出位置，给B执行，B执行结束A再执行。跟join意思正好相反！
 */

public class yieldDemo
{
    public static void main(String[] args)
    {
        MyThread3 t1 = new MyThread3("T1===>");
        MyThread3 t2 = new MyThread3("T2===>");
        t1.start();
        t2.start();
    }

    static  class MyThread3 extends Thread
    {

        MyThread3(String s)
        {
            super(s);
        }

        public void run()
        {
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(getName() + ":" + i);
                if (i == 0) yield();
            }
        }
    }


}
