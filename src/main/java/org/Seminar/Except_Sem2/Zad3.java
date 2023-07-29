package org.Seminar.Except_Sem2;
//Возможные исключительные ситуации, "Битые" значения в массиве считайте нулями

public class Zad3 {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1", "a", "3"}, {"2", "4", "c"}};
        System.out.println(ex2(array));
    }

    public static int ex2(String[][] arr){
        int sum = 0;
        // Ява предлагает переделать fori на foreach самостоятельно, можно на вести на for
        for(int i = 0; i<arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                String item = arr[i][j];
                // matches проверяет из каких символов состоит строка
                // если цифры, то true, если что-то другое, то fals
                //if(item.matches("[0-9]+")){
                if(checkTest(item)){
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        }
        return sum;
    }

    // Другой вариант на проверку текста на цифры, если не знаем регулярки
    // если цифра то true, что-то другое false
    private static boolean checkTest(String text){
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) < '0' || text.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
