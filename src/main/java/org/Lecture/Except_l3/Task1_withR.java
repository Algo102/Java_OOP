package org.Lecture.Except_l3;

import java.io.FileReader;
import java.io.IOException;

public class Task1_withR {
    public static void main(String[] args) {
// try with resources нужен для закрытия ресурсов(запись или чтение), которые были открыты в try
// и не важно было там исключение или нет, поэтому в этом случае и не требуется и не требуется
// блок finally, за это будет отвечать Ява машина
        try(FileReader test = new FileReader("test")) {
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch Exception" + e.getClass().getSimpleName());
        }
//        finally { // Блок в котором гарантировано выполнятся все операции
//            System.out.println("finally start");
//            // т.к. контроль над работой с файлом вставили в try with resources, то проверка на закрытие уже не нужна
////            if(test != null){
////                try {
////                    test.close();
////                } catch (IOException e) {
////                    System.out.println("Exception while close");
////                }
////            }
//            System.out.println("finally finished");
//        }
    }
}
