package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by User on 29.03.16.
 */
public class Singleton {
   private  Singleton() {}
    private static Singleton i;
    public static  Singleton getInstance(){
        if (i == null) {
            i = new Singleton();
            return i;
        }
        else
            return i;
    }
}
