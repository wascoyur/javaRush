package com.javarush.test.level17.lesson10.home02.tmp;

/**
 * Created by vasiliev on 15.08.2016.
 */
import java.util.TreeSet;

class Comp implements Comparable {

    String str;
    int number;

    Comp(String str, int number) {
        this.str = str;
        this.number = number;
    }

    @Override
    public int compareTo(Object obj) {
        Comp entry = (Comp) obj;

        int result = str.compareTo(entry.str);
        if(result != 0) {
            return result;
        }

        result = number - entry.number;
        if(result != 0) {
            return (int) result / Math.abs( result );
        }
        return 0;
    }

}

public class Example {

    public static void main(String[] args) {
        TreeSet<Comp> ex = new TreeSet<Comp>();
        ex.add(new Comp("Stive Global", 121));
        ex.add(new Comp("Stive Global", 221));
        ex.add(new Comp("Nancy Summer", 3213));
        ex.add(new Comp("Aaron Eagle", 3123));
        ex.add(new Comp("Barbara Smith", 88786));

        for(Comp e : ex) {
            System.out.println("Str: " + e.str + ", number: " + e.number);
        }
    }

}
