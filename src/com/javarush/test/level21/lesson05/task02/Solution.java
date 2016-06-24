package com.javarush.test.level21.lesson05.task02;

import java.util.HashSet;
import java.util.Set;

/* Исправить ошибку
Сравнение объектов Solution не работает должным образом. Найти ошибку и исправить.
Метод main не участвует в тестировании.
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Solution))
            return false;
        Solution n = (Solution) o;

        if (n.last != null && n.first!=null) {
            return n.first.equals(first) && n.last.equals(last);
        }
        if ((n.first == null && this.first==null) && n.last.equals(last)){
            return true;
        }
        if ((n.last == null && this.last == null)&& (n.first.equals(first) )){
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result;
        int a = 0;
        int b = 0;

        if (first != null){
            a = first.hashCode();
        }
        if (last != null) {
            b = last.hashCode();
        }

        result = 17 * a * b;
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution(null, null));
        System.out.println(s.contains(new Solution(null, null)));
//        System.out.println(new Solution("Mickey", null).equals(new Solution(null, null)));

    }
}
