package com.payments.services.enums;

import java.util.Arrays;
import java.util.Optional;

public enum TransactionType {
    NEFT(0), IMPS(1), OTHER_ELECTRONIC(2);

    private int numVal;

    TransactionType(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }

    public static Optional<TransactionType> valueOf(int value) {
        return Arrays.stream(values())
                .filter(legNo -> legNo.ordinal() == value)
                .findFirst();
    }
}
