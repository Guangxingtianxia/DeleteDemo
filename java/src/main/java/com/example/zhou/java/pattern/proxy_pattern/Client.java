package com.example.zhou.java.pattern.proxy_pattern;

import com.example.zhou.java.thread.gao_hong_yan.second.service.Main;

/**
 * Created by Mr_Zhou on 2017/2/5.
 */

public class Client
{
    public static void main(String[] args)
    {
        // 构造一个真实的主题对象
        RealSubject realSubject = new RealSubject();
       // 通过真实的主题对象来实例化一个代理对象
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.visit();
    }

}
