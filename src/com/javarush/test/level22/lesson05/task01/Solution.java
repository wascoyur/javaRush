package com.javarush.test.level22.lesson05.task01;

import java.util.ArrayList;
import java.util.Collections;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
            if (string == null) throw new TooShortStringException();
            String[] str = string.split(" ");
            if (str.length <= 4)throw new TooShortStringException();
            ArrayList<String> list = new ArrayList<>();
            Collections.addAll(list, str);
            String sb = "";
            for (String x : list) {
                int pos = list.indexOf(x);
                if (pos >= 1 & pos <= 4) sb = sb + x + " ";
            }
            sb = sb.trim();
            return sb;
    }

    public static class TooShortStringException extends Exception{
    }
        public static void main(String[] args) throws TooShortStringException {
            String dot = "JavaRush - лучший сервис обучения Java.";
            System.out.print(getPartOfString(dot));
        }
}
