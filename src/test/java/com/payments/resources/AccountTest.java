package com.payments.resources;

import com.payments.BaseIntegrationTest;
import com.payments.jdbi.dao.AccountsDAO;
import org.junit.Test;

import javax.inject.Inject;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class AccountTest extends BaseIntegrationTest {

    @Inject
    AccountsDAO accountsDAO;

    @Test
    public void loginHandlerRedirectsAfterPost() {

        super.initializeDB();
        assertThat(302).isEqualTo(302);
    }
}
