package com.github.duduupup.guicedemo.noguice;

public class CreditCardProcessorFactory {
    private static CreditCardProcessor instance;

    public static void setInstance(CreditCardProcessor processor) {
        instance = processor;
    }

    public static CreditCardProcessor getInstance() {
        if (instance == null) {
            setInstance(new PaypalCreditCardProcessor());
        }

        return instance;
    }
}
