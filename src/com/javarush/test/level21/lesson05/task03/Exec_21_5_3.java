package com.javarush.test.level21.lesson05.task03;

import java.util.Date;

/**
 * Created by Юрий on 22.05.16.
 */
public class Exec_21_5_3 {
    public static void main(String[] args) {
        Solution sol = new Solution(1, "s", 0.0, new Date(2015,1,1), null);
        Solution sol2 = new Solution(2, "s", 0.0, new Date(2015,1,1), null);
        Solution sol3 = new Solution(1, "s", 0.0, new Date(2015,1,1), null);
        Solution sol4 = new Solution(1, "s", 0.0, new Date(2015,1,1), null);
        sol4 = sol;
        System.out.println(sol.equals(sol2));
        System.out.println(sol.equals(sol3));
        System.out.println(sol.equals(sol4) + " Most be true");
        System.out.println(sol.hashCode());
        System.out.println(sol2.hashCode());

    }
}
