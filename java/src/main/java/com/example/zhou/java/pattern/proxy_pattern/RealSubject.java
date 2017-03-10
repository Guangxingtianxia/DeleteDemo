package com.example.zhou.java.pattern.proxy_pattern;

import com.example.zhou.java.thread.gao_hong_yan.second.service.Sub;

/**
 * Created by Mr_Zhou on 2017/2/5.
 */

public class RealSubject extends Subject
{
    /**
     * 一个普通的业务方法
     */
    @Override
    public void visit()
    {
        System.out.println("Real Subject");
    }


}
