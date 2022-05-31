package org.dsalgado.junit.examples.domain;

public class EmptyNameException extends RuntimeException{
    private static final String MESSAGE = "Name can't be empty";

    public EmptyNameException(){
        super(MESSAGE);
    }
}
