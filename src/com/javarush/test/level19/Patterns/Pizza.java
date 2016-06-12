package com.javarush.test.level19.Patterns;

/**
 * Created by Юрий on 15.05.16.
 */
public class Pizza implements Order {
    private String label;
    private double price;
    public Pizza(String label, double price){
        this.label = label;
        this.price = price;
    }
    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getlabel() {
        return this.label;
    }
}
