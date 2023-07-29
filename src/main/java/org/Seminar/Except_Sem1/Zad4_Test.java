package org.Seminar.Except_Sem1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Zad4_Test {
    public static void main(String[] args) throws IOException {
        callMethod6("");
        ArrayList<String> stringArrayList = (ArrayList<String>) callMethod1();
        //int a = 10, b = 0;
        int a = 10, b = 1;
        callMethod6("");
        int div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
        callMethod3(stringArrayList);
    }

    private static void callMethod6(String s){
        System.out.println("Hello world");
    }

    private static void callMethod3(ArrayList<String> stringArrayList){
        callMethod6("");
        //callMethod3(stringArrayList);
    }

    private static Collection<String> callMethod1() throws IOException{
        //callMethod2(100000000, 10-10);
        callMethod2(100000000, 10);
        //return new LinkedList<>();
        return new ArrayList<>();
    }
    public static int callMethod2(int a, int b) throws IOException{
        callMethod6("");
        //FileInputStream fis = new FileInputStream("1.txt");
        FileInputStream fis = new FileInputStream("untitled/1.txt");
        fis.read();

        if (fis.available()>0) throw new RuntimeException();
        //int num = callMethod4("124O"); // последняя не ноль а буква O
        int num = callMethod4("1240");
        return a/b;
    }

    private static int callMethod4(String s){
        callMethod5(s);
        return Integer.parseInt(s);
    }

    private static void callMethod5(String s){
        callMethod6("");
        String[] strings = new String[5];
        //for (int i = 0; i <= strings.length; i++) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = s;
        }
    }
}
