package org.Seminar.Except_sem3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

// Запишите в файл test.txt следующие строки:
//Анна=4
//Елена=5
//Марина=6
//Владимир=?
//Константин=?
//Иван=4
//Реализуйте метод, который считывает данные из файла и сохраняет в двумерный
// массив (либо HashMap). В отдельном методе нужно пройти по строкам и заменить
// ? на соответствующее число, если там не число и не ?, то бросить исключение.
// Результат записать в тот же файл
public class Zad6 {
    public static void main(String[] args) {
        start();
    }

    private static void start(){
        try {
            Map<String, String> map = readFile("untitled/test.txt");
            replaceText(map);
            saveToFile("untitled/test1.txt", map);
        }catch (ReadFileException e){
            //System.out.println("File read failed");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (WriteInFileException e){
            //System.out.println("File writing failed");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    // Метод для записи результата в новый файл
    // В файле порядок поменялся, т.к. HashMap, при LinkedHashMap порядок бы сохранился
    private  static void saveToFile(String filePath, Map<String, String> map) throws WriteInFileException{
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writer.write(entry.toString());
                writer.write("\n");
                writer.flush();
            }
        }catch (IOException e){
            throw new WriteInFileException("File writing failed", e);
        }
    }

    // Метод который считывает данные из файла, сразу добавили исключение
    private static Map<String, String> readFile(String filePath) throws ReadFileException {
        File file = new File(filePath);
        //Map<String, String> map = new HashMap<>();
        Map<String, String> map = new LinkedHashMap<>();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){ // считываем, если есть что считать
                String line = scanner.nextLine(); // Считали строку
                String[] strings = line.split("="); // Заполняем Map, учитывая разделитель =
                map.put(strings[0], strings[1]);
            }
        }catch (IOException e){
            throw new ReadFileException("File read failed", e);
        }
        return map;
    }

    // Метод который меняет ? на число, количество букв в имени
    private static void replaceText(Map<String, String> map){
        // перебираем элементы
        for (Map.Entry<String, String> entry: map.entrySet()){
            String key = entry.getKey();
            String val = entry.getValue();
            // если встречаем вопрос
            if(entry.getValue().equals("?")){
                // key.length() - число, преобразуем в строку
                entry.setValue(String.valueOf(key.length()));
                // и если не число
            } else if (!val.matches("[0-9]+")) {
                throw new IllegalArgumentException("Ошибка в строке " + entry);
            }
        }
    }


}
