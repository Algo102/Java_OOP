package org.Seminar.Except_sem3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Zad1_tws {
    public void rwLine(Path pathRead, Path pathWrite) throws IOException{
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = Files.newBufferedReader(pathRead);
            out = Files.newBufferedWriter(pathWrite);
            out.write(in.readLine());
        } finally { // Закрытие ресурсов, обычно всегда помещают в finally,
            // т.к. были исключения или нет, закрывать нужно всегда
            try {
                if(in != null){
                    in.close();
                }
            } catch (IOException e){

            }
            try {
                if(out != null){
                    out.close();
                }
            } catch (IOException e){

            }
        }
    }
}
