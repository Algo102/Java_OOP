package org.Lecture.Jav_L1;
// Работа с файлами

// для первой задачи
// import java.io.FileWriter;
// import java.io.IOException;

// для второй задачи
import java.io.*; // для добавления всех библиотек

public class L11_File {
    // Чтоб в коде не писать try и catch, как не правильный вариант можно в
    // майн указать, то в коде возможна ошибка
    public static void main(String[] args) throws Exception {
        // try для обработки ошибок
        // СОЗДАНИЕ - ЗАПИСЬ - ДОЗАПИСЬ
        // false или true - в зависимости нужно дописывать или нет, если
        // дописывать, то будет искать имеющийся файл, если его нет то создаст.
        // Если не будем указывать, что нужно дописывать, то если окажется что
        // файл уже есть, то его перезапишет
        // Определяем экземпляр, т.е. связываем файл с переменной fw
        // Или связываем файл с переменной fw
        try(FileWriter fw = new FileWriter("file.txt", false)){
            fw.write("line 1"); // Писать
            fw.append('\n');  // добавлять
            fw.append('\2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush(); // Принудительно записывать методом flush
        }
        catch (IOException ex){
            // Просмотр конкретной ошибки, к примеру папка только для чтения, или файл для чтения
            System.out.println(ex.getMessage());
        }



        // Посимвольное чтение
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if(ch == '\n')
                System.out.println(ch);
            else
                System.out.println(ch);
        }

        // Построчно
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while((str = br.readLine()) != null)
            System.out.printf("== %s ==\n", str);
        br.close();
    }
}
