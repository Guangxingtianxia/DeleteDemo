package com.example.zhou.java.thread.gao_hong_yan.second.service;

/**
 * Created by Mr_Zhou on 2017/1/19.
 */

public class HasSelfPrivateNum
{
    private int num = 0;

    synchronized public void add(String username)
    {
        try
        {
            if (username.equals("a"))
            {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }
            else
            {
                num = 200;
                System.out.println("b set over");

            }

            System.out.println(username + "  num:==>" + num);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }


    }
}
