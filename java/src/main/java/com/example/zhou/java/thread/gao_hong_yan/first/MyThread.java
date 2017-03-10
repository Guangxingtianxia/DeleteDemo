package com.example.zhou.java.thread.gao_hong_yan.first;

/**
 * Created by Mr_Zhou on 2017/1/15.
 */

public class MyThread extends Thread
{
    //    private int i;
    //
    //    public MyThread(int i)
    //    {
    //        super();
    //        this.i = i;
    //    }


    public MyThread()
    {
        System.out.println("构造方法打印：" + Thread.currentThread().getName());
    }

    private int count = 5;
    private int i = 5;

    @Override
     public void run()
    {
        super.run();


        // 1。           System.out.println("MyThread");
        // 2.
        //        try
        //        {
        //            for (int i = 0; i < 10; i++)
        //            {
        //                int time = (int) (Math.random() * 1000);
        //
        //                Thread.sleep(time);
        //                System.out.println("run=" + Thread.currentThread().getName());
        //            }
        //        }
        //        catch (InterruptedException e)
        //        {
        //            e.printStackTrace();
        //        }

        //============================3 实例变量与线程安全===================

        //        count--;
        //        System.out.println("由" + this.currentThread().getName() + "计算" + "count:" +
        // count);
        //============================4 实例变量与线程安全===================
        // 注意： 代码i++ 由当前项目中单独运一行改成在当前项目中在println()方法中直接进行打印
        //        System.out.println("i="+(i--)+"threadName="+Thread.currentThread().getName());

        System.out.println("run方法打印：" + Thread.currentThread().getName());


        //============= 7: 线程的停止==================================
//        for (int j = 0; j < 500000; j++)
//        {
//            System.out.println("i="+(j+1));
//
//        }

        //============= 8:  使用异常法：来停止线程==================================
        for (int j = 0; j < 500000; j++)
        {
         if(this.isInterrupted())
         {
             System.out.println("已经是停止状态了");
             break;

         }


            System.out.println("j="+(j+1));
        }



    }

}
