package com.example.zhou.java.generic;

/**
 * 功能：泛型 generic
 * 创建者：周广亚
 * 创建日期：2016/12/10 16:02
 */

public class GenericDem01
{
    public static void main(String[] args)
    {

        test(34);
    }

    /**
     * 泛型方法
     * @param t
     * @param <T>
     */
    public static <T> void test(T t)
    {
        System.out.println(t.getClass());
    }


}
