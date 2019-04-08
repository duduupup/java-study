package com.github.duduupup.guicedemo;

public class Receipt {

    private ChargeResultState chargeResultState;
    private int amountOfCharge;
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ChargeResultState getChargeResultState() {
        return chargeResultState;
    }

    public void setChargeResultState(ChargeResultState chargeResultState) {
        this.chargeResultState = chargeResultState;
    }

    public int getAmountOfCharge() {
        return amountOfCharge;
    }

    public void setAmountOfCharge(int amountOfCharge) {
        this.amountOfCharge = amountOfCharge;
    }

    public boolean hasSuccessfulCharge() {
        return chargeResultState == ChargeResultState.CHARGE_RESULT_SUCCESSFUL;
    }

    public static Receipt forSuccessfulCharge(int amount) {
        Receipt receipt = new Receipt();
        receipt.setChargeResultState(ChargeResultState.CHARGE_RESULT_SUCCESSFUL);
        receipt.setAmountOfCharge(amount);
        return receipt;
    }

    public static Receipt forDeclinedCharge(String reason) {
        Receipt receipt = new Receipt();
        receipt.setChargeResultState(ChargeResultState.CHARGE_RESULT_DECLINED);
        receipt.setDetail(reason);
        return receipt;
    }

    public static Receipt forSystemFailure(String message) {
        Receipt receipt = new Receipt();
        receipt.setChargeResultState(ChargeResultState.CHARGE_RESULT_SYSTEM_FAILURE);
        receipt.setDetail(message);
        return receipt;
    }
}
