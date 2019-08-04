package com.payments.services.enums;

import java.util.Arrays;
import java.util.Optional;

public enum AccountStatus {
    ACTIVE(0), DEACTIVE(1), BLOCKED(2), UNDER_SCRUTINY(3);

    private int numVal;

    AccountStatus(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }

    public static Optional<AccountStatus> valueOf(int value) {
        return Arrays.stream(values())
                .filter(legNo -> legNo.ordinal() == value)
                .findFirst();
    }
}
