package com.github.duduupup.guicedemo.noguice;

import com.github.duduupup.guicedemo.ChargeResult;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTransactionLog implements TransactionLog {
    private List<ChargeResult> chargeResultList = new ArrayList<>();
    private List<Exception> exceptionList = new ArrayList<>();
    private int failedCount = 0;

    @Override
    public void logChargeResult(ChargeResult chargeResult) {
        System.out.println(chargeResult);
        chargeResultList.add(chargeResult);
    }

    @Override
    public void logConnectException(Exception e) {
        System.out.println(e.getMessage());
        exceptionList.add(e);
    }

    @Override
    public boolean wasSuccessLogged() {
        return failedCount == 0;
    }
}
