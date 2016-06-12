package com.javarush.test.level15.lesson12.home09;

import com.javarush.test.level15.lesson12.bonus01.Flyable;

/**
 * Created by yur on 07.06.2016.
 */
public class Plane implements Flyable{
    int pass;
    Plane(int pass){
        this.pass = pass;
    }
    @Override
    public void fly() {

    }
}
