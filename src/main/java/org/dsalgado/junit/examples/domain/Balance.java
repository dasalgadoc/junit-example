package org.dsalgado.junit.examples.domain;

import java.math.BigDecimal;

public class Balance {
    private BigDecimal balance;

    public Balance(){
        this.balance = new BigDecimal(0);
    }

    public Balance(BigDecimal balance){

        if (balance.doubleValue() < 0){
            throw new NegativeBalanceException();
        }

        this.balance = balance;

    }

    public BigDecimal getBalance() {
        return balance;
    }

}
