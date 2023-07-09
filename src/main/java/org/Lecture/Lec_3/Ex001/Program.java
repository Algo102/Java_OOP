package org.Lecture.Lec_3.Ex001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // У нас есть коллекция чисел
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        // Для этой коллекции используем итератор
        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        //После создания экземпляра, этератор не работает
        Worker worker = new Worker(
            "Имя", "Фамилия", 23, 4567);

        // Задача чтоб итератор ходил по членнам нашего класса, для этого используем интерфейсы    
        //Iterator<Object> components = worker.iterator();

        
    }
}
