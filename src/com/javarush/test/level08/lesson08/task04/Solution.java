package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
//    public static void main(String[] args)
//    {
//        System.out.println(createMap());
//    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        //map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stafone", new Date("DECEMBER  1 1980"));
        map.put("Staffone", new Date("MARCH  1 1980"));
        map.put("Stafonew", new Date("APRIL  1 1980"));
        map.put("Stawfone", new Date("JUNE 1 1980"));
        map.put("Stafon3e", new Date("JUNE 1 1980"));
        map.put("Sytafone", new Date("JUNE 1 1980"));
        map.put("Stafonre", new Date("JUNE 1 1980"));
        map.put("Sta4fonre", new Date("JUNE 1 1980"));
        map.put("Staf5onre", new Date("JANUARY  1 1980"));
        map.put("Staf6onre", new Date("JULY  1 1980"));


        //напишите тут ваш код
//        removeAllSummerPeople(map);
        return  map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
//        HashMap<String, Date> copy = new HashMap<String, Date>(map);
        Iterator<Map.Entry<String, Date>> begun = map.entrySet().iterator();
//
//        Date daDow;
        while (begun.hasNext()){
            Map.Entry<String, Date> para = begun.next();
            int daUp = para.getValue().getMonth();
            if (daUp < 8 && daUp > 4 ){
                begun.remove();
            }
        }

    }
}
