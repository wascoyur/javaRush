package com.javarush.test.level24.lesson02.home01;

/**
 * Created by vasiliev on 13.09.2016.
 */
public class SelfInterfaceMarkerImpl implements SelfInterfaceMarker {
    public SelfInterfaceMarkerImpl() {
    }

    public void methodOne() {
        methodTwo();
    }
    public void methodTwo() {
        methodOne();
    }
}
