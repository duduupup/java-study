package com.github.duduupup.guicedemo.noguice;

import com.github.duduupup.guicedemo.ChargeResult;
import com.github.duduupup.guicedemo.CreditCard;

public class PaypalCreditCardProcessor implements CreditCardProcessor {
    @Override
    public ChargeResult charge(CreditCard creditCard, int amount) throws UnreachableException {
        return null;
    }
}
