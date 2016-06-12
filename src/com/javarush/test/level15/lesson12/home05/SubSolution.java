package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Юрий on 13.05.16.
 */
public class SubSolution extends Solution {
    public SubSolution(short s) {
        super(s);
    }

    public SubSolution(Double s) {
        super(s);
    }

    public SubSolution(float s) {
        super(s);
    }

    protected SubSolution(String string) {
        super(string);
    }

    protected SubSolution(Float string) {
        super(string);
    }

    protected SubSolution(Short string) {
        super(string);
    }
    SubSolution(Byte l){super (l);}
    SubSolution(byte l){super(l);}
    SubSolution(Long l){super(l);}
    private SubSolution(long in){ super(in); }
    private SubSolution(Integer in){ super(in); }
    private SubSolution(int in){ super(in); }
}
