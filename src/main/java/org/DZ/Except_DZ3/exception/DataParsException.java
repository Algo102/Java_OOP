package org.DZ.Except_DZ3.exception;

import java.util.Arrays;

public class DataParsException extends RuntimeException{
    public DataParsException(String [] message){
        super("Date parsing failed " + Arrays.toString(message) + "\n");
    }
}
