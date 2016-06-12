package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        FileOutputStream f1 = new FileOutputStream(s =(reader.readLine()));//("d:\\f1"); // запись в ф1
        FileInputStream f2 = new FileInputStream(reader.readLine());//("d:\\f2"); // чтение ф2
        FileInputStream f3 = new FileInputStream(reader.readLine());//("d:\\f3"); // чтение  ф3
        new FileOutputStream(s, true);
        while (f2.available() > 0){
            f1.write(f2.read());
        }

        while (f3.available() > 0){
            f1.write(f3.read());
        }
        f1.close();
        f2.close();
        f3.close();
        reader.close();

    }
}
