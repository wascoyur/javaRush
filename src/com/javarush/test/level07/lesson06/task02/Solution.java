package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> spi = new ArrayList<String>();
        ArrayList<String> max = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            spi.add(reader.readLine());
        }
        //int max = 0;
        String maxSt = "q";
        for (int i =0; i < spi.size(); i++){
            if (spi.get(i).length() > maxSt.length()) {
                //System.out.print(spi.get(i).length() + " ,");
                maxSt = spi.get(i);
                }
            }
        for (int i = 0; i < spi.size(); i++){
            if(spi.get(i).length() == maxSt.length()){
                System.out.println(spi.get(i));
            }
        }
    }
}

