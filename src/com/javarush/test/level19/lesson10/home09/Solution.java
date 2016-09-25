package com.javarush.test.level19.lesson10.home09;

/* Контекстная реклама
В методе main подмените объект System.out написанной вами реадер-оберткой
Ваша реадер-обертка должна выводить на консоль контекстную рекламу после каждого второго println-а
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Рекламный текст: "JavaRush - курсы Java онлайн"

Пример вывода:
first
second
JavaRush - курсы Java онлайн
third
fourth
JavaRush - курсы Java онлайн
fifth
*/
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        String advertise = "JavaRush - курсы Java онлайн";
        PrintStream consolestream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consolestream);
        String[] mass = (String.valueOf(outputStream)).split("\n");
        StringBuilder inserter = new StringBuilder();
        for (int i = 1; i <= mass.length; i++) {
            inserter.append(mass[i -1]);
            if(i % 2 == 0) {
                inserter.append("\n");
                inserter.append(advertise);
                inserter.append("\n");
            }
            else {
            inserter.append("\n");}
        }
        System.out.println(inserter.toString());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
