package com.example.zhou.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Mr_Zhou on 2017/1/7.
 * 周广亚
 */

public class CacheThreadPool
{
    public static void main(String[] args)
    {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i <5 ; i++)
        {
            exec.execute(new LifiOff());

        }

    }


}
