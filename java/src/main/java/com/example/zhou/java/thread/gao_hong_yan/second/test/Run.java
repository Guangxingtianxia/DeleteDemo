package com.example.zhou.java.thread.gao_hong_yan.second.test;

import com.example.zhou.java.thread.gao_hong_yan.second.entity.PublicVar;
import com.example.zhou.java.thread.gao_hong_yan.second.extobject.MyObject;
import com.example.zhou.java.thread.gao_hong_yan.second.extthread.MyThread;
import com.example.zhou.java.thread.gao_hong_yan.second.extthread.ThreadA;
import com.example.zhou.java.thread.gao_hong_yan.second.extthread.ThreadB;
import com.example.zhou.java.thread.gao_hong_yan.second.service.HasSelfPrivateNum;

/**
 * Created by Mr_Zhou on 2017/1/19.
 */

public class Run
{
    public static void main(String[] args)
    {
//        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
//        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
//
//        ThreadA threadA = new ThreadA(numRef1);
//        threadA.start();
//        ThreadB threadB= new ThreadB(numRef2);
//        threadB.start();


//        MyObject object = new MyObject();
//        ThreadA a = new ThreadA(object);
//        a.setName("A");
//        ThreadB b = new ThreadB(object);
//        b.setName("B");
//
//        a.start();
//        b.start();


//        try
//        {
//            PublicVar publicVar = new PublicVar();
//            ThreadA thread = new ThreadA(publicVar);
//            thread.start();
//            // 打印结果受此值大小影响
//            Thread.sleep(200);
//            publicVar.getValue();
//        }
//        catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }
//

        MyThread t = new MyThread();
        t.start();






















    }
}
