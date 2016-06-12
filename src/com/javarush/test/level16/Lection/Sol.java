package com.javarush.test.level16.Lection;

/**
 * Created by yur on 15.02.2016.
 */
public class Sol{

    public static void main(String[] args)    {
        Printer printer1 = new Printer("Коля");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        try        {
            thread1.join();
        }
        catch (InterruptedException e)        {
            e.printStackTrace();
        }
    }
}
class Printer implements Runnable{
    private String name;
    public Printer(String name)    {
        this.name = name;
    }
    public void run()    {
        System.out.println("I’m " + this.name);
    }
}
