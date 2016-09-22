package com.javarush.test.level25.tmp;

/**
 * Created by vasiliev on 26.07.2016.
 */
class AppThread extends Thread {

    public AppThread() {

    }

    public void run() {

        Thread ct = Thread.currentThread();
        System.out.println("Дочернийпоток - " + ct.getName());
        for(int i = 1; i <= 5; i++) {
            System.out.println("Значение цикла дочернего потока " +
                    ct.getName() +" - " + i);        }
        System.out.println("Работа дочернего потока завершена - " +
                ct.getName());
    }
}
