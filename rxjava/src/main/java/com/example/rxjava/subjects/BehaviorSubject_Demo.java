package com.example.rxjava.subjects;

import rx.functions.Action1;
import rx.subjects.BehaviorSubject;

/**
 * Created by Administrator on 2017/1/3.
 * BehaviorSubject 只保留最后一个值。
 * 等同于限制 ReplaySubject 的个数为 1 的情况。
 * 在创建的时候可以指定一个初始值，这样可以确保党订阅者订阅的时候可以立刻收到一个值。
 */

public class BehaviorSubject_Demo
{
    public static void main(String[] args)
    {
        BehaviorSubject<Integer> subject = BehaviorSubject.create();
        subject.onNext(1);
        subject.onNext(2);
        subject.subscribe(new Action1<Integer>()
        {
            @Override
            public void call(Integer integer)
            {
                System.out.println("later"+integer);
            }
        });

        subject.onNext(3);
        subject.onNext(4);

        System.out.println("=================华丽的分割线=================");
        subject.onNext(3);
        subject.onNext(4);
        subject.onNext(5);
        subject.onCompleted();
        subject.subscribe(new Action1<Integer>()
        {
            @Override
            public void call(Integer integer)
            {
                System.out.println(integer);
            }
        });
    }
}
