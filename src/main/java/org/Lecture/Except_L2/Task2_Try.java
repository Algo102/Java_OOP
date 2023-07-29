package org.Lecture.Except_L2;

import java.util.Collections;

public class Task2_Try {
    public static void main(String[] args) {
        int number = 1;
        try { // Как только видит хоть одну ошибку, весь блок try завершается
            //number = 10/0; //т.к. мы указали, что возможна ошибка и она
            // произошла, то переменная не обновляется
            number = 10/1;

            String test = null;
            //System.out.println(test.length()); // NullPointerException, приложение
            // упало, т.к. catch перехватывает только ArithmeticExeption

            Collections.emptyList().add(new Object());
        }
//        catch (ArithmeticException e){
//        catch (Exception e){ // подняли на уровень вверх, чтоб ловил
//        все ошибки, но на все ошибки одно и то же сообщение
        // Catch тоже проверяет ловушки все по очереди и как только в
        // первую ловушку, то остальные блоки пропускаются
        // Поэтому если хотим указать общую ошибку, то прописываем ее в конце
        catch (ArithmeticException e){
            System.out.println("Divide by zero");
        }
        catch (NullPointerException e){ // Разделили логику отлавливания ошибок
            System.out.println("This object does not exist");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println(number); // 1 // 10
    }

}
