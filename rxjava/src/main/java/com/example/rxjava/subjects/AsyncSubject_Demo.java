package com.example.rxjava.subjects;

import rx.functions.Action1;
import rx.subjects.AsyncSubject;

/**
 * Created by Administrator on 2017/1/3.
 * AsyncSubject 也缓存最后一个数据。
 * 区别是 AsyncSubject 只有当数据发送完成时（onCompleted 调用的时候）才发射这个缓存的最后一个数据。
 * 可以使用 AsyncSubject 发射一个数据并立刻结束。
 */

public class AsyncSubject_Demo
{
    public static void main(String[] args)
    {
        AsyncSubject<Integer> subject = AsyncSubject.create();
        subject.subscribe(new Action1<Integer>()
        {
            @Override
            public void call(Integer integer)
            {
                System.out.println(integer);
            }
        });

        subject.onNext(0);
        subject.onNext(1);
        subject.onNext(2);
        subject.onCompleted();

    }
    // 结果
//    2

}
