package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rFn = new BufferedReader(new FileReader(args[1]));
        BufferedWriter wF = new BufferedWriter(new FileWriter(args[2]));

        if (args[0] == "-e") {
            char[] ch = new char[(int) (new File(args[1])).length()];
            rFn.read(ch);
//            ch = ch.
            wF.write(ch);
            wF.append(' ');
        }
    }

}
