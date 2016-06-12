package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static boolean isDateOdd(String date)
    {
        Date startTime = new Date(date);
        startTime.setSeconds(0);
        startTime.setMinutes(0);
        startTime.setHours(0);
        startTime.setDate(1);
        startTime.setMonth(0);
        Date currentTime = new Date(date);
        long Distance = currentTime.getTime() - startTime.getTime();
        int Day = (int) Distance/(24*60*60*1000);
        if(Day%2==1) return false;
        return true ;
    }
}
