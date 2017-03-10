package com.example.zhou.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Mr_Zhou on 2017/2/11.
 */

public class CmmonTest
{
    public static void main(String[] args)
    {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(6);
        list1.add(564);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(67);
        list2.add(564);
        list2.add(566);


        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);




//     boolean isCommon =   Collections.disjoint(list1,list2);
     boolean isCommon =   list2.retainAll(list1);
        System.out.println("交集结果：" + list2);
        Set result = new HashSet();
        System.out.println(isCommon);

        //
        //
        //        MyCompartr myCompartr = new MyCompartr(list3);
        //        Collections.sort(list3,myCompartr);
        //        List<Integer> cm = myCompartr.getCommonValueList();
        //        if (!cm.isEmpty())
        //        {
        //            for (Integer integer1 : cm)
        //            {
        //                list1.remove(integer1);
        //                list2.remove(integer1);
        //            }
        //        }
        //
        //        System.out.println("++++++++++++++++++");
        //        for (Integer integer : list1)
        //        {
        //            System.out.println(integer);
        //
        //        }
        //
        //        System.out.println("++++++++++++++++++");
        //        for (Integer integer3 : list2)
        //        {
        //            System.out.println(integer3);
        //
        //        }
        //
        //
        //    }
        //
        //
        //    static class MyCompartr implements Comparator<Integer>
        //    {
        //        List<Integer> commonValue ;
        //
        //        public MyCompartr(List<Integer> commonValue)
        //        {
        //            this.commonValue = commonValue;
        //        }
        //
        //        @Override
        //        public  int compare(Integer o1, Integer o2)
        //        {
        //
        //            if(o1==o2)
        //            {
        //                commonValue.add(o1);
        //                return 0;
        //            }
        //            else
        //            {
        //                return 1;
        //            }
        //
        //        }
        //
        //        public List<Integer> getCommonValueList()
        //        {
        //            if (!commonValue.isEmpty())
        //            {
        //                return commonValue;
        //            }
        //            else
        //            {
        //                return null;
        //            }
        //        }
        //
        //
        //    }
    }
}
