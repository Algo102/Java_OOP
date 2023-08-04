package org.DZ.Except_DZ3.controler;

public class DataSplit {
    String [] data;

    private void data (String [] data){
        this.data = data;
    }

    public String [] getData (String data){
        checkData(data);
        return data.split(" ");
    }

    private static void parseCode(int code) {
        switch (code){
            case 0:
                System.out.println("Ввод не должен быть пустым");
                break;
            case 1:
                System.out.println("Не хватает данных");
                break;
            case 2:
                System.out.println("Данных слишком много");
                break;
            default:
                System.out.println("Все корректно");
        }
    }

    private void checkData(String data) {

        int code = -1;
        if (data.equals(" ") || (data.isEmpty())){
            code = 0;
        }

        String [] result = data.split(" ");

        if (result.length < 6 && result.length > 1) {
            code = 1;
        }
        if (result.length > 6) {
            code = 2;
        }
        parseCode(code);
    }
}
