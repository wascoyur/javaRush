package com.javarush.test.level14.lesson06.home01;

/**
 * Created by User on 18.04.16.
 */
public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 4;
    }
    String getDescription() {
        return  super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " +  getCountOfEggsPerMonth() + " яиц в месяц. ";
    }
}
