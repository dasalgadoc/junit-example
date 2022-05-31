package org.dsalgado.junit.examples.domain;

import java.math.BigDecimal;

public class Balance {
    private BigDecimal balance;

    public Balance(){
        this.balance = new BigDecimal(0);
    }

    public Balance(BigDecimal balance){
        this.balance = balance;
    }

}
