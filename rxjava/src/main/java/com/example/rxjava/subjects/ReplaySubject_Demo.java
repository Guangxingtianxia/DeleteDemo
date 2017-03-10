package com.example.rxjava.subjects;

import rx.functions.Action1;
import rx.subjects.ReplaySubject;

/**
 * Created by Administrator on 2017/1/3.
 * ReplaySubject 可以缓存所有发射给他的数据。当一个新的订阅者订阅的时候，
 * 缓存的所有数据都会发射给这个订阅者。 由于使用了缓存，所以每个订阅者都会收到所以的数据：
 */

public class ReplaySubject_Demo
{
    public static void main(String[] args)
    {

        ReplaySubject<Integer> subject = ReplaySubject.create();
        subject.subscribe(new Action1<Integer>()
        {
            @Override
            public void call(Integer integer)
            {
                System.out.println("early:" + integer);
            }
        });

        subject.onNext(0);
        subject.onNext(1);

        subject.subscribe(new Action1<Integer>()
        {
            @Override
            public void call(Integer integer)
            {
                System.out.println("later:" + integer);
            }
        });
        subject.onNext(2);
        subject.onNext(3);

    }
    // 结果：
    //    early:0
    //    early:1
    //    later:0
    //    later:1
    //    early:2
    //    later:2
    //    early:3
    //    later:3

    /**
     * 不管是何时订阅的，每个订阅者都收到了所有的数据。注意后一个订阅者在处理 2 之前就先收到了之前发射的数据 0和1.
     * 缓存所有的数据并不是一个十分理想的情况，如果 Observable 事件流运行很长时间，则缓存所有的数据会消耗很多内存。
     * 可以限制缓存数据的数量和时间。 ReplaySubject.createWithSize 限制缓存多少个数据；而 ReplaySubject.createWithTime
     * 限制一个数据可以在缓存中保留多长时间。
     */
}
