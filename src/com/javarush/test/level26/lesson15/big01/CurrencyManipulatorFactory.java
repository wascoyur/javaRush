package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vasiliev on 15.09.2016.
 */
public final class CurrencyManipulatorFactory {
    private CurrencyManipulatorFactory() {
    }

    private static Map<String, CurrencyManipulator> manipulators = new HashMap<>();

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        if (!manipulators.containsKey(currencyCode)) {
            CurrencyManipulator manipulator = new CurrencyManipulator(currencyCode);
            manipulators.put(currencyCode, manipulator);
        }
        return manipulators.get(currencyCode);
    }
}
