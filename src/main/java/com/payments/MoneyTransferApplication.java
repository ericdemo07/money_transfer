package com.payments;

import com.payments.resources.ApplicationHealthCheck;
import com.payments.resources.MainResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class MoneyTransferApplication extends Application<MoneyTransferConfiguration> {

    public static void main(String[] args) throws Exception {
        new MoneyTransferApplication().run(args);
    }

    public void run(MoneyTransferConfiguration moneyTransferConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new MainResource());
        environment.healthChecks().register("APIHealthCheck", new ApplicationHealthCheck());
    }
}
