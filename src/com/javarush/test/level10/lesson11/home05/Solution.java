package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //напишите тут ваш код

        for (int alph = 0; alph < alphabet.size() ; alph++) { //перебор элементов алфавита

            int n = 0;
            for (int massiv = 0; massiv < list.size(); massiv++) { //перебор массива

                for (int simvol = 0; simvol < list.get(massiv).length() ; simvol++) {       //перебор элементов строки (символа)
                    if (alphabet.get(alph).equals(list.get(massiv).charAt(simvol))){
                        n++;
                    }
                }

            }
            System.out.println(alphabet.get(alph) + " " + n);
        }
    }

}
