package org.DZ.Except_DZ3.view;

import org.DZ.Except_DZ3.controler.DataSplit;
import org.DZ.Except_DZ3.controler.ParseData;
import org.DZ.Except_DZ3.exception.NameExceptions;
import org.DZ.Except_DZ3.model.UserData;

import java.util.Arrays;
import java.util.Scanner;

public class UserView {
    public UserView(){
    }
    ParseData parseData = new ParseData();
    UserData userData = new UserData();

    public void run() {
        System.out.println();
        System.out.println("Введите данные пользователя через пробел: ");
        System.out.println("[Фамилию Имя Отчество]");
        System.out.println("Дату рождения dd.mm.yyyy");
        System.out.println("Телефонный номер");
        System.out.println("Пол: 'f' - женский, 'm' - мужской");
        System.out.println();
        DataSplit data = new DataSplit();

        boolean flag = false;
        String str = null;
        String [] usArray = new String[0];

        while (!flag) {
            str = userInput("here -> ");
            usArray = data.getData(str);

            if (usArray.length == 6){
                flag = true;
            }
        }

        try {
            parseData.parseUserData(usArray, userData);
        } catch (NameExceptions e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println(Arrays.toString(usArray));
        System.out.println("usArray.length = " + usArray.length);
    }

    String userInput (String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
