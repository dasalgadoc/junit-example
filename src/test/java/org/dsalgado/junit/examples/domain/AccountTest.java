package org.dsalgado.junit.examples.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void accountMustBeHaveAnOwnerTest(){

        assertThrows(EmptyNameException.class,
                () -> new Account("",new BigDecimal(0)));

    }

    @Test
    void balanceCanBeTreatedLikeDouble(){
        Account account = new Account("Diego",new BigDecimal("1000.12345"));

        assertEquals(1000.12345,account.getBalance().doubleValue());

    }

    @Test
    void balanceCantBeNegative(){

        assertThrows(NegativeBalanceException.class,
                () -> new Account("Diego",new BigDecimal(-0.000001)));

    }
    
}