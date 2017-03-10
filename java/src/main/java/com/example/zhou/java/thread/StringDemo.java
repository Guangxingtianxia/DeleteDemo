package com.example.zhou.java.thread;

/**
 * Created by Mr_Zhou on 2017/1/10.
 */

public class StringDemo
{
    public static void main(String[] args)
    {
        String s1 = "adb" + "def";
        String s2 = new String(s1);
//        String s2 = "adb" + "def";
        if (s1 == s2)
        {
            System.out.println("1");
        }
        else if (s1.equals(s2))
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("0");
        }


    }
}
