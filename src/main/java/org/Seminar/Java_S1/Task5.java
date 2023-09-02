package org.Seminar.Java_S1;

public class Task5 {

    public static void reverse(){
        String in = "Добро пожаловать на курс Ява";
        String[] split = in.split("\\s");
        StringBuilder builder = new StringBuilder();
        for (int i = split.length - 1; i > - 1 ; i--) {
            builder.append(split[i]).append("");
        }
        System.out.println(builder);
    }

}
