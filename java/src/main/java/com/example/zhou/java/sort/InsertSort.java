package com.example.zhou.java.sort;

/**
 * 功能：插入排序
 * 创建者：周广亚
 * 创建日期：2016/12/15 21:47
 */

public class InsertSort
{
    public static void main(String[] args)
    {
        int[] testArr = {4321, 54, 2, 2, 5, 2143, 432, 534, 543, 7, 4, 23};
        InsertSort insertSort = new InsertSort();
        int[] okArr = insertSort.sortInsert(testArr);
        StringBuilder builder = new StringBuilder();
        for (int i : okArr)
        {
            builder.append(i + ",");

        }
        System.out.println(builder.toString());
    }

    private int[] sortInsert(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int temp = array[i];
            int j;
            for (j = i - 1; j > 0 && temp < array[j]; j--)
            {
                array[j + 1] = array[i];
            }

            array[j + 1] = temp;
        }
        return array;
    }















}





































