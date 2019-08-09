package com.payments;

import io.dropwizard.testing.ResourceHelpers;
import io.dropwizard.testing.junit.DropwizardAppRule;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import ru.vyarus.guicey.jdbi3.JdbiBundle;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class BaseIntegrationTest {


    @ClassRule
    public static final DropwizardAppRule<MoneyTransferConfiguration> RULE =
            new DropwizardAppRule<>(MoneyTransferApplication.class,
                    ResourceHelpers.resourceFilePath("test.yml"));

    @Before
    public void initializeDB() {
        JdbiBundle.<MoneyTransferConfiguration>forDatabase((conf, env) -> conf.getDatabase());
    }

    @Test
    public void newArrayListsHaveNoElements() {
        assertThat(new ArrayList<Integer>().size(), is(0));
    }
}
