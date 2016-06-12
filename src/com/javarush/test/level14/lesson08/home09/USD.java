package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Юрий on 12.05.16.
 */
public class USD extends Money{
    double amount;
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
