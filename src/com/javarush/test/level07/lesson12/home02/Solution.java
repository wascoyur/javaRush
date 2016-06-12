package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()); //Ввести с клавиатуры 2 числа N  и M.
        int M = Integer.parseInt(reader.readLine()); //Ввести с клавиатуры 2 числа N  и M.
        ArrayList<String> sps = new ArrayList<String>(); //Ввести N строк и заполнить ими список
        for (int i = 0; i <  N; i++){
            sps.add(reader.readLine());
        }
        for (int i = M; i > 0; i--){
            sps.add(sps.get(0));
            sps.remove(0);

        }
        for (String i: sps){
            System.out.println(i);
        }


        //напишите тут ваш код
    }
}
