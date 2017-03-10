package com.example.zhou.java.annotationdemo;

/**
 * Created by Mr_Zhou on 2017/2/4.
 */


public class Eyecolor
{
     @Description(desc = "第一次使用注解",auth = "周广亚",age = 25)
     public String getColor()
    {
        return "red";
    }

}
