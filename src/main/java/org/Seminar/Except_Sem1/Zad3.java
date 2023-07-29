package org.Seminar.Except_Sem1;
// Метод который принимает двумерный массив. Нужно
// посчитать сумму элементов. Есть 2 ограничения, массив
// д.б. квадратный и состоять из 0 или 1. Если есть
// нарушение метод должен бросить RuntimeException
public class Zad3 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,0,5},{0,1,0},{0,0,0}};

        try {
            System.out.println("Сумма элементов массива: " + sumArrayItems(array));
        }
        // RuntimeException это наследник от Exception, поэтому можно указать главный
        // класс Exception, эффект будет тот же.
        catch (RuntimeException e){
            //e.printStackTrace(); //Выводит Стек ошибки в консоль, но мы их уже и так вывели
            System.out.println(e.getMessage());

        }

        // Если будет ошибка, до этого сообщения не дойдет, без try
        // c try приложение не прирывается, а отрабатывает до конца, информируя об ошибках
        // потому что есть catch - ловец, т.е. метод прирывается на исключении, cetch
        // отлавливает, выдает нам и продолжает main до конца
        System.out.println("Конец работы приложения");
    }

    private static int sumArrayItems(int[][] array){
        if(array==null){
            throw new RuntimeException("Массив не инициализирован");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            //Длина всего массива 3 элемента, и длина каждого элемента 3 элемента
            if(array.length != array[i].length){
                throw new RuntimeException("Массив не квадратный");
            }
            for (int j = 0; j < array[i].length; j++) {
                int item = array[i][j];
                if(item != 0 && item != 1){
                    throw new RuntimeException("Элемент с индексом [" + i + ", " + j +
                            "]" + " равен " + item + ". Ожидается 0 или 1");
                }
                sum += item;
            }
        }
        return sum;
    }
}
