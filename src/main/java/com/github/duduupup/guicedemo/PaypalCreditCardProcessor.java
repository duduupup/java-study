package com.github.duduupup.guicedemo;

import com.github.duduupup.guicedemo.ChargeResult;
import com.github.duduupup.guicedemo.CreditCard;
import com.github.duduupup.guicedemo.CreditCardProcessor;
import com.github.duduupup.guicedemo.UnreachableException;

public class PaypalCreditCardProcessor implements CreditCardProcessor {
    @Override
    public ChargeResult charge(CreditCard creditCard, int amount) throws UnreachableException {
        return null;
    }
}
