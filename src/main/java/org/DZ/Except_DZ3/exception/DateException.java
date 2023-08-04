package org.DZ.Except_DZ3.exception;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DateNotCorrect");
        System.out.printf("Wrong date format: %s\n", i);
    }
}