package org.DZ.Except_DZ3.controler;

import org.DZ.Except_DZ3.exception.DataParsException;
import org.DZ.Except_DZ3.exception.GenderException;
import org.DZ.Except_DZ3.exception.NameExceptions;
import org.DZ.Except_DZ3.model.UserData;

import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class ParseData {
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
            .withResolverStyle(ResolverStyle.STRICT);
    BirthDay checkBirth = new BirthDay();

    UserData userData = new UserData();

    public void parseUserData(String [] checkStrings, UserData userData){

        try {
            for (int i = 0; i < checkStrings.length; i++) {


                    if (checkStrings[i].length() == 1 && checkStrings[i].equals("f") || checkStrings[i].equals("m")) {
                        try {
                        userData.setGender(checkStrings[i]);

                        } catch (IllegalArgumentException e) {
                            throw new GenderException(e.getMessage());
                        }

                    } else if (Character.isDigit(checkStrings[i].charAt(0)) && checkStrings[i].contains(".")) {

                            if (!checkBirth.CheckBirthDate(checkStrings[i])) {
                                userData.setUserBirthDate(checkStrings[i]);
                            }

                    } else if (Character.isDigit(checkStrings[i].charAt(0)) && !(checkStrings[i].contains("."))) {
                        userData.setUserPhoneNumber(Integer.parseInt(checkStrings[i]));

                    } else if ((checkStrings[i].matches("[A-Za-z]+"))) {
                        try {
                            userData.setUserName(checkStrings[i], checkStrings[i + 1], checkStrings[i + 2]);
                            i += 2;
                        } catch (IndexOutOfBoundsException e) {
                            throw new NameExceptions(e.getMessage());
                        }
                    }
                }

            }catch (RuntimeException e){
                throw new DataParsException(checkStrings);
            }
        System.out.println(userData.toString());
    }
}
