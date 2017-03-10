package com.example.zhou.java.sort;

/**
 * 选择排序
 * Created by Administrator on 2016/12/23.
 */

public class SelectSort
{
    public static void main(String[] args)
    {
        int[] arrTest ={12,23,3,21,4,242,45,24,56,2422,43543,3543,353};

       int[] okArr =  sort(arrTest);
        StringBuilder builder = new StringBuilder();
        for (int i : okArr)
        {
            builder.append(i+",");

        }
        System.out.println(builder.toString());

    }


    public static int[] sort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            for(int j = i+1;j<arr.length;j++ )
            {
                int temp ;
                if(arr[i]>arr[j])
                {
                    temp = arr[i]; // 大的
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        // ==========================================================//

        return arr;
    }
}
