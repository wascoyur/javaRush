package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileTar;

        FileInputStream f1 = new FileInputStream(fileTar=reader.readLine());
        FileInputStream f2 = new FileInputStream(reader.readLine());

        FileOutputStream f4 = new FileOutputStream(fileTar, true);

        ArrayList <Integer>list =  new ArrayList();
        int i =0;
        while (f1.available() > 0){
            list.add(f1.read());
            i++;
        }
        FileOutputStream f3 = new FileOutputStream(fileTar);

        while (f2.available() > 0){
            f3.write(f2.read());
        }

        for (int j = 0; j < list.size() ; j++) {
            f4.write(list.get(j));
        }
        reader.close();
        f1.close();
        f2.close();
        f3.close();
        f4.close();
    }
}
