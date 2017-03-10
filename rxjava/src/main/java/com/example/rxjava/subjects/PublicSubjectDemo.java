package com.example.rxjava.subjects;

import rx.functions.Action1;
import rx.subjects.PublishSubject;

/**
 * Created by Administrator on 2017/1/2.
 */

public class PublicSubjectDemo
{
    public static void main(String[] args)
    {
        /**
         * publishSubject
         * 是最直接的一个subject
         * * */
        PublishSubject<Integer> subject = PublishSubject.create();
        subject.onNext(1);

        subject.onNext(2);
        subject.onNext(3);
        subject.onNext(4);
        subject.subscribe(new Action1<Integer>()
        {
            @Override
            public void call(Integer integer)
            {
                System.out.println(integer);
            }
        });


    }
    // 结果：2
    // 结果：3
    // 结果：4
    // 可以看到，数据 1 并没有打印出来，原因是当我们订阅到 subject 的时候，
    // 1 已经发射出去了。当订阅到 subject 后就开始接收 发射到 subject 中的数据了。

}
