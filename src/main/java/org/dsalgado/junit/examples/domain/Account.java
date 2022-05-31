package org.dsalgado.junit.examples.domain;

import java.math.BigDecimal;

public class Account {
    private Owner owner;
    private Balance balance;

    public Account(String owner, BigDecimal balance) {

        this.owner = new Owner(owner);
        this.balance = new Balance(balance);

    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

}
