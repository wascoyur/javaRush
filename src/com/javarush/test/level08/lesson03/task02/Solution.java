package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень,
земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        HashMap<String, String> rast = new HashMap<String, String>();
        rast.put("арбуз","ягода");
        rast.put("банан","трава");
        rast.put("вишня","ягода");
        rast.put("груша","фрукт");
        rast.put("дыня","овощ");
        rast.put("ежевика","куст");
        rast.put("жень-шень","корень");
        rast.put("земляника","ягода");
        rast.put("ирис","цветок");
        rast.put("картофель","клубень");

        Iterator<Map.Entry<String, String>> begun = rast.entrySet().iterator();

        while (begun.hasNext()){
            Map.Entry<String, String> pair = begun.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
