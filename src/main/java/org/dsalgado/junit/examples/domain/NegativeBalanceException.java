package org.dsalgado.junit.examples.domain;

public class NegativeBalanceException extends RuntimeException {
    private static final String MESSAGE = "Balance can't be minor that zero";

    public NegativeBalanceException(){
        super(MESSAGE);
    }
}
