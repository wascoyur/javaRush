package com.javarush.test.level23.tmp;

/**
 * Created by vasiliev on 26.07.2016.
 */
public class PrivateConst {
    private PrivateConst() {}
    public class InnerClass{
        public void f(){
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        PrivateConst.InnerClass tmp;

    }
}
