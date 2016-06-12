package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Юрий on 13.05.16.
 */
public class Sun implements Planet {
    static String SUN = "sun";
    private static Sun instance;
    private Sun(){}
    public static Sun getInstance(){
        if (instance == null){
            instance = new Sun();
        }
        return instance;
    }
}
