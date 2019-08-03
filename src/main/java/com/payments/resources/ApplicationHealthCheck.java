package com.payments.resources;

import com.codahale.metrics.health.HealthCheck;

public class ApplicationHealthCheck extends HealthCheck {
    protected Result check() throws Exception {
        if (1 + 1 == 2 - 0) {
            return Result.healthy();
        }
        return Result.unhealthy("Error message");
    }
}
