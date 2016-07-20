package com.javarush.test.level23.lesson08.task02.tmp;

import com.javarush.test.level12.lesson06.task05.Solution;

/**
 * Created by yur on 16.07.2016.
 */
class Tiger extends Solution.Cat{

    public void tigerRun() {}

    class TigerThread extends Thread {
        public void run(){
            tigerRun();
        }
    }
    public void startTiger(){
        TigerThread thread = new TigerThread();
        thread.start();
    }


}
