package org.Lecture.Jav_L1;

public class L7_Func_Metod {
    static int sum(int a, int b){
        return a+b;
    }

    static double factor(int n){
        if(n==1)
            return 1;
        return n * factor(n - 1);
    }

    public static void main(String[] args) {
        lib_metods.sayHi(); // Вызвали метод с другого файла
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120
    }
}
