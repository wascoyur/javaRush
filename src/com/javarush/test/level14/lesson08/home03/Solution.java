package com.javarush.test.level14.lesson08.home03;

import com.javarush.test.level14.lesson08.home03.Person.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while (true){
            String input = reader.readLine();
            if (input.equals("user") || input.equals("looser") || input.equals("coder") || input.equals("proger")){
                if (input.equals("user")){User user = new User(); doWork(user);}
                if (input.equals("looser")){Looser looser = new Looser(); doWork(looser);}
                if (input.equals("coder")){Coder coder = new Coder(); doWork(coder);}
                if (input.equals("proger")){Proger proger = new Proger(); doWork(proger);}
                continue;

            }
            break;
        }
        {
        //создаем объект, пункт 2

        doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person)
    {
        // пункт 3
        if (person instanceof User) ((User) person).live();
        if (person instanceof Looser) ((Looser) person).doNothing();
        if (person instanceof Coder) ((Coder) person).coding();
        if (person instanceof Proger) ((Proger) person).enjoy();
    }
}
