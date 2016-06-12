package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        ArrayList<String> list = new ArrayList<>();
        while (true){
            String tmp = reader.readLine();
            list.add(tmp);
            if (tmp.equals("exit")){
                break;
            }
        }
        while (list.size() > 0){
            byte[] buff = list.get(0).getBytes();
            fileOutputStream.write(buff);
            fileOutputStream.write(System.lineSeparator().getBytes());
            list.remove(0);
        }
    }
}
