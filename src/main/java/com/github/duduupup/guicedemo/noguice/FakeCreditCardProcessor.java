package com.github.duduupup.guicedemo.noguice;

import com.github.duduupup.guicedemo.ChargeResult;
import com.github.duduupup.guicedemo.ChargeResultState;
import com.github.duduupup.guicedemo.CreditCard;

public class FakeCreditCardProcessor implements CreditCardProcessor {
    @Override
    public ChargeResult charge(CreditCard creditCard, int amount) {
        System.out.println(String.format("%s consume: %d", creditCard.toString(), amount));
        ChargeResult chargeResult = new ChargeResult();
        chargeResult.setChargeResultState(ChargeResultState.CHARGE_RESULT_SUCCESSFUL);
        return chargeResult;
    }
}
