package com.javarush.test.level19.Patterns;

/**
 * Created by Юрий on 15.05.16.
 */
public abstract class Extra implements Order {
    protected Order order;
    protected String label;
    protected double price;

    public Extra(String label, double price, Order order){
        this.label = label;
        this.price = price;
        this.order = order;
    }
    public abstract double getPrise();
    public String getLabel(){
        return order.getlabel()+". " + this.label;
    }
}
