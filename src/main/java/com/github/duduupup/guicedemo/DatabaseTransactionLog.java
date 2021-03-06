package com.github.duduupup.guicedemo;

import com.github.duduupup.guicedemo.ChargeResult;
import com.github.duduupup.guicedemo.TransactionLog;

public class DatabaseTransactionLog implements TransactionLog {
    private int failedCount = 0;

    @Override
    public void logChargeResult(ChargeResult chargeResult) {
        System.out.println(chargeResult);
    }

    @Override
    public void logConnectException(Exception e) {
        System.out.println(e.getMessage());
    }

    @Override
    public boolean wasSuccessLogged() {
        return failedCount == 0;
    }
}
