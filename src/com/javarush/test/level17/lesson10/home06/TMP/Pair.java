package com.javarush.test.level17.lesson10.home06.TMP;
//11: concurrency/CriticalSection.java
//        II Синхронизация блоков вместо целых методов. Также демонстрирует защиту
//        II неприспособленного к многопоточности класса другим классом
//        package concurrency;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Юрий on 20.05.16.
 */

class Pair { // Not thread-safe
            private int x, y;

            public Pair(int х, int у) {
                this.x = х;
                this.y = у;
            }

            public Pair() {
                this(0, 0);
            }

            public int getX() {
                return x;
            }

            public int getY() {
                return y;
            }

            public void incrementX() {
                x++;
            }

            public void incrementY() {
                y++;
            }

            public String toString() {
                return "х: " + x + ". у: " + y;
            }

            public class PairValuesNotEqualException
                    extends RuntimeException {
                public PairValuesNotEqualException() {
                    super("Pair values not equal: " + Pair.this);
                }
            }

            // Произвольный инвариант - обе переменные должны быть равны:
            public void checkState() {
                if (x != y)
                    throw new PairValuesNotEqualException();
            }
}
//Защита карсса Pair внутри приспособленное к потокам класса
    abstract class PairManager{
    AtomicInteger checkCounter = new AtomicInteger(0);
    protected Pair p = new Pair();
        private List<Pair> storage = Collections.synchronizedLlst(new ArrayList<Pair>());
    public synchronized  Pair getPair(){
        //создаем копию, чтобы сохранить оригинал в безопасности
        return new Pair(p.getX(), p.getY());
    }
    //Операщия займет некоторое время
    protected void store(Pair p){
        storage.add(p);
        try{
            TimeUnit.MILLISECONDS.sleep(50);
        }catch (InterruptedException ignore){}
    }
    public abstract void increment();
}
// Синхронизация всего метода:
class PairManager1 extends PairManager{
    public void increment(){
        Pair temp.synchronized(this) {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        }
        store(temp);
    }
}
class PairManipulator implements Runnable{
    private PairManager pm;
    public PairManipulator(PairManager pm){
        this.pm = pm;
    }
    public void run(){
        while (true){
            pm.increment();
        }
    public String toString(){
        return "Pair: " + pm.getPair() + "checkCounter = " + pm.checkCounter.get();
    }
    }
class PairChecker implements Runnable{
    private PairManager pm;
    public PairChecker(PairManager pm){
        this.pm = pm;
    }
}
}
