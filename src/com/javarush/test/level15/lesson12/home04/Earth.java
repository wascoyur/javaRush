package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Юрий on 13.05.16.
 */
public class Earth implements Planet{
    static String EARTH = "earth";
    private static Earth instance;
    private Earth(){}
    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
