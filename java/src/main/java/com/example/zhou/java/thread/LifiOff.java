package com.example.zhou.java.thread;

import javax.xml.transform.Source;

/**
 * Created by Mr_Zhou on 2017/1/7.
 */

public class LifiOff implements Runnable
{
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;


    public LifiOff()
    {

    }

    public LifiOff(int countDown)
    {
        this.countDown = countDown;
    }


    public String status()
    {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "LiftOff！") + "),";
    }

    @Override
    public void run()
    {
        while (countDown-- > 0)
        {
            System.out.println(status());
            Thread.yield();
        }

    }
}
