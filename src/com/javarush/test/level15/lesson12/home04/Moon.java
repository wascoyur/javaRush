package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Юрий on 13.05.16.
 */
public class Moon implements Planet{
    static String MOON = "moon";
    private static Moon instance;
    private Moon(){}
    public static Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}
