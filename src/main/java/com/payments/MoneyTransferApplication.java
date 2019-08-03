package com.payments;

import com.payments.resources.ApplicationHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.flyway.FlywayBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;
import ru.vyarus.guicey.jdbi3.JdbiBundle;

public class MoneyTransferApplication extends Application<MoneyTransferConfiguration> {

    public static void main(String[] args) throws Exception {
        new MoneyTransferApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<MoneyTransferConfiguration> bootstrap) {
        bootstrap.addBundle(new FlywayBundle<MoneyTransferConfiguration>() {
            @Override
            public PooledDataSourceFactory getDataSourceFactory(MoneyTransferConfiguration configuration) {
                return configuration.getDatabase();
            }
        });
        bootstrap.addBundle(GuiceBundle.builder()
                .enableAutoConfig("com.payments.resources", "com.payments.jdbi.dao", "com.payments.jdbi.mapper")
                .bundles(JdbiBundle.<MoneyTransferConfiguration>forDatabase((conf, env) -> conf.getDatabase()))
                .build());
    }

    public void run(MoneyTransferConfiguration config, Environment env) throws Exception {
        env.healthChecks().register("APIHealthCheck", new ApplicationHealthCheck());
    }
}
