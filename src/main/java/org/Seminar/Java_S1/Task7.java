package org.Seminar.Java_S1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task7 {
    public static void write(){
        File file = new File("output.txt");
        try (FileWriter writer = new FileWriter(file)){
            String data = "Name Surname Age\nKate Smith 20\nPaul Green 25";
            writer.write(data);
            writer.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
