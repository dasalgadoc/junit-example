package org.dsalgado.junit.examples.domain;

public class Owner {
    private String name;

    public Owner(String name){

        if (name.isEmpty()){
            throw new EmptyNameException();
        }

        if (name == null){
            throw new NullNameException();
        }

        this.name = name;
    }

}
