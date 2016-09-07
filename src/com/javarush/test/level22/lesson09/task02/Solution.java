package com.javarush.test.level22.lesson09.task02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        if (params!= null & params.size()!= 0){
        Iterator<Map.Entry<String, String>> iterator = params.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            if (key != null & value != null) {
                sb = sb.append(key).append(" = '").append(value).append("' ").append("and ");
            }
        }
        int end = sb.length();
        int sart = sb.length() - 5;
        String s = sb.substring(sart);
        if (sb.substring(sart).equals(" and ")) {
            sb.replace(sart, end, "");
        }
        return sb;}
        return sb;
    }


}
