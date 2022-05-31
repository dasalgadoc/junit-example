package org.dsalgado.junit.examples.domain;

public class NullNameException extends RuntimeException{
    private static final String MESSAGE = "Owner can't be null";

    public NullNameException(){
        super(MESSAGE);
    }
}
