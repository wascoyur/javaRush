package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
//    public static void main (String[] args){
//       HashMap<String, String> map = createMap();
////        System.out.println(map);
////        removeItemFromMapByValue(map, "Иван");
//        System.out.println(map);
//        removeTheFirstNameDuplicates(map);
//        System.out.println(map);
//    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Смирнов", "Иван");
        map.put("Соболев", "Илья");
        map.put("Петров", "Антон");
        map.put("Саперов", "Алексей");
        map.put("Новиков", "Иван");
        map.put("Яковлев", "Анатолий");
        map.put("Волков", "Артем");
        map.put("Мешков", "Сергей");
        map.put("Москвин", "Антон");
        return map;

    }

//    public static HashMap<String, String> removeTheFirstNameDuplicates(HashMap<String, String> map)
   public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        Iterator<Map.Entry<String,String>> iterator = copy.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String s = pair.getValue();
            if (Collections.frequency(copy.values(), pair.getValue()) > 1)
            {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

      //  return map;
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
