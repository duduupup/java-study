package com.github.duduupup.guicedemo;

import com.github.duduupup.guicedemo.useguice.BillingService;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import junit.framework.TestCase;

public class GuiceBillingServiceTest extends TestCase {
    private final PizzaOrder order = new PizzaOrder(100);
    private final CreditCard creditCard = new CreditCard("1234", 11, 2010);

    public void testSuccessfulCharge() {
        Injector injector = Guice.createInjector(new AbstractModule() {
            protected void configure() {
                bind(TransactionLog.class).to(InMemoryTransactionLog.class);
                bind(CreditCardProcessor.class).to(FakeCreditCardProcessor.class);
            }
        });
        BillingService billingService = injector.getInstance(BillingService.class);

        Receipt receipt = billingService.chargeOrder(order, creditCard);

        assertTrue(receipt.hasSuccessfulCharge());
        assertEquals(100, receipt.getAmountOfCharge());
    }
}
