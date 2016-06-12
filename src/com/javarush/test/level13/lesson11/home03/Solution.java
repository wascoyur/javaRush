package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String file = reader.readLine();
        BufferedReader readStream = new BufferedReader(new FileReader(file));
        StringBuilder bufReadStream = new StringBuilder();
        String s;
        while ((s = readStream.readLine())!= null){
            bufReadStream.append(s + "\n");
        }
        readStream.close();
        reader.close();
        System.out.println(bufReadStream.toString());
    }
}
