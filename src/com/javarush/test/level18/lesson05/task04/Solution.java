package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        FileOutputStream outFirst = new FileOutputStream(reader.readLine());
        byte[] buf = new byte[file.available()]; // создаем буфер размером с исходный файл
        for (int i = 0; i < buf.length; i++) {
            buf[(buf.length - 1 -i)] = (byte) file.read();
        }
        outFirst.write(buf);
        reader.close();
        file.close();
        outFirst.close();
    }
}
