package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        FileOutputStream outFirst = new FileOutputStream(reader.readLine());
        FileOutputStream outSecond = new FileOutputStream(reader.readLine());
        byte[] buffer = new byte[file.available()];
        while (file.available() > 0){
            int count = file.read(buffer);//если у тебя есть буфер размером count и тебе надо из него взять
            // N байт по смещению offset, то это write(buffer, offset, N), а если надо взять все байты
            // по смещению offset, то это write(buffer, offset, count - offset).
            outSecond.write(buffer, 0, count/2 );
            outFirst.write(buffer, count/2, count - count/2);
        }
        file.close();
        reader.close();
        outFirst.close();
        outSecond.close();

    }
}
