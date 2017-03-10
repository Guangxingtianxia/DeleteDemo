package com.example.zhou.java.thread.gao_hong_yan.second.service;

/**
 * Created by Mr_Zhou on 2017/1/20.
 *  同步不具有继承性
 */

public class   Main
{
    synchronized public  void serviceMethrd()
    {
        try
        {
            System.out.println("int main 下一步 sleep begin threadName= "+Thread.currentThread().getName()+" time："+ System.currentTimeMillis());
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
