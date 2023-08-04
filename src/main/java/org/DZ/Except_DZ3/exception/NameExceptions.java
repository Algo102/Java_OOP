package org.DZ.Except_DZ3.exception;

public class NameExceptions extends IndexOutOfBoundsException{
    public NameExceptions(String s){
        super("Invalid name" + s);
    }
}
