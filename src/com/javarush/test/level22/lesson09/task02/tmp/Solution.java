package com.javarush.test.level22.lesson09.task02.tmp;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by vasiliev on 07.09.2016.
 */
public class Solution {
    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder query = new StringBuilder();
        if (params == null || params.size() == 0)
            return query;
        query.append("\"");
        for(Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null)
                query.append(String.format("%s = \'%s\' and ", entry.getKey(), entry.getValue()));
        }
        query.setLength(query.length() - 5);
        query.append("\"");
        return query;
    }
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        System.out.println(getCondition(map));
    }
}
