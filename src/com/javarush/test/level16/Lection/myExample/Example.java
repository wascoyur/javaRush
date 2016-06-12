package com.javarush.test.level16.Lection.myExample;


/**
 * Created by yur on 29.02.2016.
 */
public class Example implements Runnable{
   private String name;
    public Example(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Я распечатанный пример" + " " + this.name);
    }


public static void main(String[] args){
    Example example1 = new Example("пример");
    Example example2 = new Example("пример2");
    Thread net = new Thread(example1);
    Thread net2 = new Thread(example2);
    net.run();
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    net2.start();

}
}