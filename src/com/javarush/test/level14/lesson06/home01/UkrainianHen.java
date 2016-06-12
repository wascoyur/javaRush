package com.javarush.test.level14.lesson06.home01;

/**
 * Created by User on 18.04.16.
 */
public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }
    String getDescription() {
        return  super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " +  getCountOfEggsPerMonth() + " яиц в месяц. ";
    }
}
