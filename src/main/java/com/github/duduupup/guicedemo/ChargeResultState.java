package com.github.duduupup.guicedemo;

public enum ChargeResultState {
    CHARGE_RESULT_SUCCESSFUL,
    CHARGE_RESULT_DECLINED,
    CHARGE_RESULT_SYSTEM_FAILURE;

    public static void main( String[] args )
    {
        System.out.println( ChargeResultState.CHARGE_RESULT_SUCCESSFUL.name() );
    }
}
