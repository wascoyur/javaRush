package com.javarush.test.level28.lesson10.task01.tmp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import com.javarush.test.level28.lesson10.task01.tmp.ReverseString;

/**
 * Created by vasiliev on 22.09.2016.
 */
public class Example {
    //1. Создаем ThreadPoolExecutor
    ExecutorService service = Executors.newFixedThreadPool(5);

    //2 помещаем в него задачу для выполнения
    Future<String> task = service.submit(new ReverseString("Amigo"));


//3 ждем пока задача выполнится
    while(!task.isDone()) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//4 пробуем получить результат задачи
//получим или результат или исключение, если оно было при выполнении задачи
    try {
        System.out.println("Развернутая строка : " + task.get());
    }
    catch (Exception ie)
    {
        ie.printStackTrace(System.err);
    }

//5 останавливаем ThreadPool.
    service.shutdown();
}

