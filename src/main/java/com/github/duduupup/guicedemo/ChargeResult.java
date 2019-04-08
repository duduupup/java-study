package com.github.duduupup.guicedemo;

public class ChargeResult {
    private ChargeResultState chargeResultState;
    private String detail;

    public ChargeResultState getChargeResultState() {
        return chargeResultState;
    }

    public void setChargeResultState(ChargeResultState chargeResultState) {
        this.chargeResultState = chargeResultState;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDeclineMessage() {
        if (chargeResultState == ChargeResultState.CHARGE_RESULT_DECLINED) {
            return detail;
        } else {
            return null;
        }
    }

    public boolean wasSuccessful() {
        return chargeResultState == ChargeResultState.CHARGE_RESULT_SUCCESSFUL;
    }
}
