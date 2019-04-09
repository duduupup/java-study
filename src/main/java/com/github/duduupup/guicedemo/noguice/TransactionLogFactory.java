package com.github.duduupup.guicedemo.noguice;

import com.github.duduupup.guicedemo.DatabaseTransactionLog;
import com.github.duduupup.guicedemo.TransactionLog;

public class TransactionLogFactory {
    private static TransactionLog instance;

    public static void setInstance(TransactionLog transactionLog) {
        instance = transactionLog;
    }

    public static TransactionLog getInstance() {
        if (instance == null) {
            return new DatabaseTransactionLog();
        }

        return instance;
    }
}
