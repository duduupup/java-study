package com.github.duduupup.guicedemo;

import com.github.duduupup.guicedemo.ChargeResult;

public interface TransactionLog {
    public void logChargeResult(ChargeResult chargeResult);
    public void logConnectException(Exception e);
    public boolean wasSuccessLogged();
}
