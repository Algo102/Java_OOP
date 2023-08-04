package org.DZ.Except_DZ3.model;

import java.util.Arrays;

public class UserData {
    String [] userName;
    String userBirthDate;
    int userPhoneNumber;
    String gender;

    public UserData (){

    }
    public UserData (String [] userName, String userBirthDate, int userPhoneNumber, String userSex){
        this.userName = new String[3];
        this.userBirthDate = userBirthDate;
        this.userPhoneNumber = userPhoneNumber;
        this.gender = userSex;
    }

    public void setUserName(String lastname, String name, String surname ) {
        this.userName = new String[]{lastname, name, surname};
    }

    public void setUserBirthDate(String userBirthDate) {
        this.userBirthDate = userBirthDate;
    }

    public void setUserPhoneNumber(int userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String getInfo(){
        return String.format("User Name - " + Arrays.toString(userName) + "\n"
                                + "Date of birth - " + userBirthDate + "\n"
                                + "Phone number - " + userPhoneNumber + "\n"
                                + "Sex - " + gender + "\n");
    }
    @Override
    public String toString(){

        return getInfo();
    }
}
