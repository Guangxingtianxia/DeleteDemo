package com.example.zhou.java.pattern.proxy_pattern;

/**
 * Created by Mr_Zhou on 2017/2/5.
 */

public class ProxySubject extends Subject
{
    private RealSubject mSubject;

    public ProxySubject(RealSubject subject)
    {
        mSubject = subject;
    }

    /**
     * 一个普通的业务方法
     */
    @Override
    public void visit()
    {
        mSubject.visit();
    }
}
