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

    public boolean equals(Object n) {
        if (!(n instanceof Solution)) {
            return false;
        }
        Solution s = (Solution) n;
        try {
            return s.first.equals(first) && s.last.equals(last);
        } catch (NullPointerException e) {
            if ((this.first == s.first) && (this.last == s.last)) {
                return true;
            }
        }
        return false;
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
        s.add(new Solution("", null));
        Solution sol2 = new Solution("", null);
        System.out.println(s.contains(sol2));
    }
}
