package com.example.zhou.java.thread.gao_hong_yan.second.entity;

/**
 * Created by Mr_Zhou on 2017/1/19.
 */

public class PublicVar
{
    public String userName = "A";
    public String passWord = "AA";

    synchronized public void setValue(String userName, String passWord)
    {
        try
        {
            this.userName = userName;
            Thread.sleep(5000);
            this.passWord = passWord;
            System.out.println(" setValue method thread name :=" +
                    Thread.currentThread().getName() + "； userNmae :=" + userName + "； passwWord:=" +
                    passWord);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }


  synchronized   public void getValue()
    {
        System.out.println(" getValue method thread name :=" +
                Thread.currentThread().getName() + "； userNmae :=" + userName + "； passwWord:=" +
                passWord);
    }
}
