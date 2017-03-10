package com.example.zhou.java.thread;

/**
 * 功能：设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。
 * 创建者：周广亚
 * 创建日期：2016/12/10 17:00
 */

public class ThreadTest1
{
    private static int j;

    public static void main(String args[])
    {
        //        ThreadTest1 tt = new ThreadTest1();

        Inc inc = new Inc();
        Dec dec = new Dec();

        // 通过for循环新建了4个线程，2个线程是负责添加，2个线程负责删除
        for (int i = 0; i < 2; i++)
        {
            // 增加线程
            Thread t = new Thread(inc);
            // 启动
            t.start();

            // 删除线程
            t = new Thread(dec);
            t.start();
        }
    }

    /**
     * 增加线程
     */
    private static class Inc implements Runnable
    {
        public void run()
        {
            for (int i = 0; i < 10; i++)
            {
                // 添加方法
                inc();
            }
        }
    }

    /**
     * 添加方法
     */
    private static synchronized void inc()
    {
        j++;
        System.out.println(Thread.currentThread().getName() + ":添加-->" + j);

    }

    /**
     * 删除线程
     */
    private static class Dec implements Runnable
    {
        public void run()
        {
            for (int i = 0; i < 10; i++)
            {
                // 删除方法
                dec();
            }
        }
    }


    /**
     * 删除方法
     */
    private static synchronized void dec()
    {
        j--;
        System.out.println(Thread.currentThread().getName() + ":添加-->" + j);
    }

}
