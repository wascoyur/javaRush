package com.javarush.test.level28.lesson04.task02.tmp;

import java.util.Random;

/**
 * Created by yur on 19.09.2016.
 */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Random r = new Random();
        for (int i = 0; i<1000;i++) {
            int q = r.nextInt(21);
            System.out.println(q);
        }
    }
}
