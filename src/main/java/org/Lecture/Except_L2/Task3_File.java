package org.Lecture.Except_L2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3_File {
    public static void main(String[] args) {
        try {
            FileReader test = new FileReader("test");
            // можно ловить разные исключения через или в одном блоке
        } catch (RuntimeException |FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
