package com.example.zhou.java.thread.gao_hong_yan.second.service;


/**
 * Created by Mr_Zhou on 2017/1/21.
 */

public class Sub extends Main
{
    /**
     *  继承来至父类的方法
     */
    @Override
    public  void serviceMethrd()
    {
        try
        {
            System.out.println("int Sub 下一步 sleep begin threadName = " +Thread.currentThread().getName() + " time：" + System.currentTimeMillis());
            Thread.sleep(500);
            System.out.println("int Sub  下一步 sleep end threadName = " + Thread.currentThread().getName() + " time："+ System.currentTimeMillis());
            // super 指向父类的 方法
            super.serviceMethrd();

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }


    }
}
