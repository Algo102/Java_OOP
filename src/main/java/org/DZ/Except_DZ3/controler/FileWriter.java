package org.DZ.Except_DZ3.controler;

import java.io.IOException;

public class FileWriter {
    public void dataWriter(String data, String path) {
        System.out.println(path);
        System.out.println(path.getClass().getSimpleName());
        try(java.io.FileWriter fw = new java.io.FileWriter(path, true)) {
            fw.append(data);
            fw.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
