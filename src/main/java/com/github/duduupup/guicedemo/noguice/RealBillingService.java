package com.github.duduupup.guicedemo.noguice;

import com.github.duduupup.guicedemo.*;

public class RealBillingService implements BillingService {
    @Override
    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        CreditCardProcessor processor = CreditCardProcessorFactory.getInstance();
        TransactionLog transactionLog = TransactionLogFactory.getInstance();

        try {
            ChargeResult result = processor.charge(creditCard, order.getAmount());
            transactionLog.logChargeResult(result);

            return result.wasSuccessful()
                    ? Receipt.forSuccessfulCharge(order.getAmount())
                    : Receipt.forDeclinedCharge(result.getDeclineMessage());
        } catch (UnreachableException e) {
            transactionLog.logConnectException(e);
            return Receipt.forSystemFailure(e.getMessage());
        }
    }
}
