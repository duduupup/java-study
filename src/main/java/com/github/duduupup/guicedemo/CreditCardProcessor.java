package com.github.duduupup.guicedemo;

public interface CreditCardProcessor {
    ChargeResult charge(CreditCard creditCard, int amount) throws UnreachableException;
}
