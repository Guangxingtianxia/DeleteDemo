package com.example.rxjava.subscribers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.observables.GroupedObservable;
import rx.subjects.ReplaySubject;
import rx.subjects.Subject;

/**
 * Created by BigTopOne on 2017/1/5.
 * abstract class Subscriber<T> implements Observer<T>, Subscription
 * Subscriber 是一个抽象类，它的父类是{ @link Observer}
 */

public class PrintSubscriber extends Subscriber
{
    private final String name;

    public PrintSubscriber(String name)
    {
        this.name = name;
    }


    @Override
    public void onCompleted()
    {
        System.out.println(name + "Completed");
    }

    @Override
    public void onError(Throwable e)
    {
        System.out.println(name + ":onError:===>" + e.toString());


    }

    @Override
    public void onNext(Object o)
    {
        System.out.println(name + o);

    }


    public static void main(String[] args)
    {
        //===========================情怀分割线==================================

        Observable<Integer> value = Observable.range(0, 4);

        value.map(new Func1<Integer, Object>()
        {
            @Override
            public Object call(Integer integer)
            {
                return integer;
            }
        }).subscribe(new PrintSubscriber("Map:"));

        System.out.println("//===========================情怀分割线==================================");

        //===========================情怀分割线==================================

        Observable<Integer> values = Observable.just("1", "2", "3", "4", "5").map(new Func1<String, Integer>()
        {
            @Override
            public Integer call(String s)
            {


                return Integer.parseInt(s);
            }
        });

        values.subscribe(new PrintSubscriber("Map2:"));

        //        Observable 发射的为 String 类型数据，而我们需要的是 int 类型，则可以通过 map 把 String 转换为 int。
        //        如果你认为这种转换太简单了， 完全可以在 Subscriber 中完成，这样在设计架构上并不合理，没有有效的区分职责。
        //        代码设计每个部分都有各自的职责，使用 map 可以有效的确保职责清晰。方便后续修改。


        System.out.println("//===========================情怀分割线==================================");

        //===========================情怀分割线==================================

        Observable<Integer> value3 = Observable.range(0, 4);
        value3.subscribe(new PrintSubscriber("values3:"));

        System.out.println("//===========================情怀分割线 count ===========================");

        value3.count().subscribe(new PrintSubscriber("values3_count:"));

        System.out.println("//===========================情怀分割线 countLong========================");
        value3.countLong().subscribe(new PrintSubscriber("values3_countLong:"));

        System.out.println("//===========================情怀分割线 first=============================");
        values.first().subscribe(new PrintSubscriber("first:"));

        System.out.println("//===========================情怀分割线 firstOrDefault===================");
        values.firstOrDefault(0).subscribe(new PrintSubscriber("first:"));

        System.out.println("//===========================情怀分割线 single===================");

        //===========================情怀分割线 single==================================

        Observable<Long> values4 = Observable.
                interval(100, TimeUnit.MILLISECONDS);
        values4.take(10).single(new Func1<Long, Boolean>()
        {
            @Override
            public Boolean call(Long aLong)
            {
                return aLong == 5;
            }
        }).subscribe(new PrintSubscriber("Single1:"));


        //===========================情怀分割线 reduce ==================================
        System.out.println("//===========================情怀分割线 reduce===================");
        Observable<Integer> values5 = Observable.range(0, 5);
        values5.reduce(new Func2<Integer, Integer, Integer>()
        {
            @Override
            public Integer call(Integer integer, Integer integer2)
            {
                // 1: 求和
                //                return integer+integer2; // 约等于：0+1+2+3+4 = 10;

                // 2: 求最大值，或者最小值
                if (integer < integer2)
                {
                    return integer2;
                }
                else
                {
                    return null;
                }
            }
        }).subscribe(new PrintSubscriber("Reduce1:"));

        //===========================情怀分割线 reduce2 ==================================

        Observable<String> values6 = Observable.just("Big", "Top", "One");
        values6.reduce(0, new Func2<Integer, String, Integer>()
        {
            @Override
            public Integer call(Integer integer, String s)
            {
                System.out.println(integer);
                return integer + 1;
            }
        }).subscribe(new PrintSubscriber("reduce_count:"));


        //===========================情怀分割线 scan ==================================
        System.out.println("//===========================情怀分割线 scan===================");
        System.out.println("reduce 只是最后把计算结果发射出来，\n" + "而 scan 把每次的计算结果都发射出来。\n");
        Observable<Integer> values7 = Observable.range(0, 5);
        values7.scan(new Func2<Integer, Integer, Integer>()
        {
            @Override
            public Integer call(Integer integer, Integer integer2)
            {
                return integer + integer2;
            }
        })

                .subscribe(new PrintSubscriber("scan_value:"));

        System.out.println("//===========================情怀分割线 min===================");
        //===========================情怀分割线==================================

        Subject<Integer, Integer> values8 = ReplaySubject.create();
        values8.subscribe(new PrintSubscriber("Subject:"));
        values8.scan(new Func2<Integer, Integer, Integer>()
        {
            @Override
            public Integer call(Integer integer, Integer integer2)
            {
                return integer < integer2 ? integer : integer2;
            }
        }).distinctUntilChanged().subscribe(new PrintSubscriber("Min:"));
        values8.onNext(2);
        values8.onNext(3);
        values8.onNext(1);
        values8.onNext(4);
        values8.onNext(6);
        values8.onCompleted();

        System.out.println("//===========================情怀分割线 reduce===================");
        //===========================情怀分割线==================================

        Observable<Integer> values9 = Observable.range(10, 5);
        values9.reduce(new ArrayList<Integer>(), new Func2<ArrayList<Integer>, Integer, ArrayList<Integer>>()
        {
            @Override
            public ArrayList<Integer> call(ArrayList<Integer> integers, Integer integer)
            {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(integer);
                return list;
            }
        }).map(new Func1<ArrayList<Integer>, Integer>()
        {
            @Override
            public Integer call(ArrayList<Integer> integers)
            {
                Integer integer1 = null;
                for (Integer integer : integers)
                {
                    integer1 = integer;
                }
                return integer1 - 1;
            }
        }).subscribe(new PrintSubscriber("reduce_Array_List:"));


        System.out.println("//===========================情怀分割线 collect===================");
        //===========================情怀分割线==================================

        Observable<Integer> values10 = Observable.range(10, 5);
        values10.collect(new Func0<ArrayList<Integer>>()
        {
            @Override
            public ArrayList<Integer> call()
            {
                // 返回一个容器
                return new ArrayList<Integer>();
            }
        }, new Action2<ArrayList<Integer>, Integer>()
        {
            @Override
            public void call(ArrayList<Integer> integers, Integer integer)
            {
                // 将数据添加到容器里！
                integers.add(integer);
            }
        }).subscribe(new Action1<ArrayList<Integer>>()
        {
            @Override
            public void call(ArrayList<Integer> integers)
            {
                for (Integer integer : integers)
                {
                    System.out.println("collect" + integer);
                }
            }
        });


        System.out.println("//==字符串排序&Integer排序=================情怀分割线 toList===========||");
        //===========================情怀分割线 toList==================================
        Observable<Integer> values11 = Observable.range(10, 5);
        values11.toList().subscribe(new PrintSubscriber("toList:"));

        //===========================情怀分割线 toSortedList==================================
        Observable<Integer> values12 = Observable.from(new Integer[]{2, 53, 786, 6, 7, 3, 7, 325, 654});
        values12.toSortedList().subscribe(new PrintSubscriber("toSortedList:"));


        //===========================情怀分割线 toSortedList==================================
        Observable<String> values13 = Observable.just("2", "56", "a", "fhh", "sdd", "uyt", "hrses");
        values13.toSortedList().subscribe(new PrintSubscriber("toSortedList:"));


        System.out.println("//==toMap=================情怀分割线 toMap========================||");
        //===========================情怀分割线 toList==================================
        // 测试类
        class Person
        {
            public final String name;
            public final Integer age;

            public Person(String name, int age)
            {
                this.name = name;
                this.age = age;
            }
        }

        Observable<Person> values14 = (Observable<Person>) Observable.
                just(new Person("laner", 19), new Person("tom", 7), new Person("jace", 67), new Person("Nigtop", 4));

        values14.toMap(new Func1<Person, Map<String, Person>>()
        {
            @Override
            public Map<String, Person> call(Person person)
            {
                HashMap<String, Person> map = new HashMap<>();
                map.put(person.name, person);
                return map;
            }
        }).subscribe(new PrintSubscriber("topMap:"));


        System.out.println("//==toMap=================情怀分割线 groupBy========================||");
        //===========================情怀分割线 groupBy==================================
        Observable<String> values15 = Observable.just("first", "second", "third", "forth", "fifth", "sixth");
        values15.groupBy(new Func1<String, Character>()
        {
            @Override
            public Character call(String s)
            {
                return s.charAt(0);
            }
        }).subscribe(new Action1<GroupedObservable<Character, String>>()
        {
            @Override
            public void call(GroupedObservable<Character, String> group)
            {
                group.last().subscribe(new Action1<String>()
                {
                    @Override
                    public void call(String s)
                    {
                        System.out.println("groupBy:" + s);
                    }
                });
            }
        });

        System.out.println("//==toMap=================情怀分割线 groupBy 不嵌套========================||");
        //===========================情怀分割线 groupBy==================================

        Observable<String> values16 = Observable.just("first", "second", "third", "forth", "fifth", "sixth");
        values16.groupBy(new Func1<String, Character>()
        {
            @Override
            public Character call(String s)
            {
                return s.charAt(0);
            }
        }).flatMap(new Func1<GroupedObservable<Character, String>, Observable<?>>()
        {
            @Override
            public Observable<?> call(GroupedObservable<Character, String>
                                              observable)
            {
                return observable.last()
                        .map(new Func1<String, Object>()
                        {
                            @Override
                            public Object call(String s)
                            {
                                return null;
                            }
                        });
            }
        }).subscribe();


        System.out.println("//==toMap=================情怀分割线 nest========================||");
        //===========================情怀分割线 groupBy==================================
        Observable.range(0,3)
                .nest()
                .subscribe(new Action1<Observable<Integer>>()
                {
                    @Override
                    public void call(Observable<Integer> integerObservable)
                    {
                        integerObservable.subscribe(new Action1<Integer>()
                        {
                            @Override
                            public void call(Integer integer)
                            {
                                System.out.println(integer);
                            }
                        });
                    }
                });


    }
}
