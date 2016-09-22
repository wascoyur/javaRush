package com.javarush.test.level28.lesson10.task01.tmp;

import java.util.concurrent.Callable;

/**
 * Created by vasiliev on 22.09.2016.
 */
public class ReverseString implements Callable<String>
{
    String str;

    ReverseString(String str)
    {
        this.str = str;
    }

    public String call() throws Exception
    {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        return builder.toString();
    }
}
