package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader rfName = new BufferedReader(new InputStreamReader(System.in));
//        String firsName = rfName.readLine();
//        String secondName = rfName.readLine();
        FileInputStream fis = new FileInputStream(args[0]);
        FileReader fr = new FileReader((args[0]));
        FileWriter fw = new FileWriter(args[1]);
        String tmp = "";
        char[] ch = new char[fis.available()] ;
        fr.read(ch);
//        tmp = (String.valueOf(ch)).replaceAll("");
        System.out.println(ch);
        }
}

