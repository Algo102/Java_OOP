package org.Seminar.Except_sem3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Zad1_new_tws {
    public void rwLine(Path pathRead, Path pathWrite) {

        try (BufferedReader in = Files.newBufferedReader(pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite)){

            out.write(in.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
