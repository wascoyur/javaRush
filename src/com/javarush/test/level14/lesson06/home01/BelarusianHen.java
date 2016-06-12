package com.javarush.test.level14.lesson06.home01;

/**
 * Created by User on 18.04.16.
 */
public class BelarusianHen extends Hen  {
    @Override
    int getCountOfEggsPerMonth() {
        return 2;
    }
    String getDescription() {
        return  super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " +  getCountOfEggsPerMonth() + " яиц в месяц. ";
    }
}
