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
}