package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;
//todo: присвоить полю класса массив
/**
 * Created by Юрий on 07.05.16.
 */
public class Hippodrome {
    public static void main(String[] args) {


    }
    ArrayList<Horse> horse;

    public ArrayList<Horse> getHorse() {
        return horse;
    }

    public Hippodrome(){
        this.horse = new ArrayList<Horse>();

    }
}
