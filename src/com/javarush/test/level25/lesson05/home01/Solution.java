package com.javarush.test.level25.lesson05.home01;

/* Мониторинг состояния нити
В отдельном классе создать нить LoggingStateThread,
которая будет выводить в консоль все состояния (State) переданной в конструктор нити.
<<<<<<< HEAD
Нить LoggingStateThread должна сама завершаться после остановки
переданной в конструктор нити.
=======
Нить LoggingStateThread должна сама завершаться после остановки переданной в конструктор нити.
>>>>>>> origin/master
Метод main не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread target = new Thread();
<<<<<<< HEAD
        target.setDaemon(true);
=======
>>>>>>> origin/master
        LoggingStateThread loggingStateThread = new LoggingStateThread(target);

        loggingStateThread.start();
        target.start();  //NEW
        Thread.sleep(100); //RUNNABLE
        target.join(100);
<<<<<<< HEAD
        Thread.sleep(400);
        target.interrupted(); //TERMINATED
        Thread.sleep(500);
    }

=======
        System.out.println("cont");
        Thread.sleep(400);
        target.interrupted(); //TERMINATED
        Thread.sleep(500);
        System.out.println("end");
    }
>>>>>>> origin/master
}
