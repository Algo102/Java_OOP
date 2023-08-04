package org.DZ.Except_DZ3.exception;

public class GenderException extends IllegalArgumentException{

    public GenderException(String s) {
        super("Only 'm' or 'f' " + s);
    }
}
