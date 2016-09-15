package com.javarush.test.level26.lesson15.big01;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by vasiliev on 15.09.2016.
 */
public class CurrencyManipulator {
    private String currencyCode;
    private TreeMap<Integer, Integer> denominations = new TreeMap<>();

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;

    }

    public String getCurrencyCode() {

        return currencyCode;
    }
    void addAmount(int denomination, int count){

    }
}
