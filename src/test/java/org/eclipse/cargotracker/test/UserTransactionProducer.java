package org.eclipse.cargotracker.test;

import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.UserTransaction;
import org.mockito.Mockito;

@ApplicationScoped
public class UserTransactionProducer {
    @Produces
    public UserTransaction produceUserTransaction() {
        return Mockito.mock(UserTransaction.class);
    }
}
