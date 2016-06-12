package com.javarush.test.level19.Patterns;

/**
 * Created by Юрий on 15.05.16.
 */
public class RegularExtra extends Extra {
    public RegularExtra(String label, Order order, double price){
        super(label, price, order);
    }
    public double getPrice(){
        return this.price + order.getPrice();
    }
}
