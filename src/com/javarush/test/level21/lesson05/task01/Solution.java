package com.javarush.test.level21.lesson05.task01;

import java.util.HashSet;
import java.util.Set;

/* Equals and HashCode
В классе Solution исправить пару методов equals/hashCode в соответствии с правилами реализации этих методов.
Метод main не участвует в тестировании.
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Solution n) {
        return n.first.equals(first) && n.last.equals(last);
    }

    public int hashCode() {
        int result = 19;
        int a =0;
        int b = 0;
        try {
            return 31 * first.hashCode() * last.hashCode();
        } catch (NullPointerException e) {
            return result;
        }

    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        Solution sol2 = new Solution("Donald", "Duck");
        System.out.println(s.contains(sol2));
        //ystem.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
