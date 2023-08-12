package org.Lecture.Algoritm_L4;
// Обход в глубину, это когда по одной ветке идем до конца, а потом переходим
// к следующей ветке. Делается рекурсивно
import java.util.List;

public class TreeGlubina {
    Node root; // Базовое поле, является началом дерева, откуда дерево начинает расти

    // проверяем получилось ли найти нужную Ноду
    public  boolean exist(int value){
        if (root != null){ // Проверка на наличие root, т.е. проверяем пустое дерево или нет
            // Начинаем поиск с root и value в качестве начала, результат записываем в НОДЕ
            Node node = find(root, value); // Начинаем поиск с root и value в качестве начала
            if (node != null) // Если мы нашли нужное значение
                return true; // То возвращаем ТРУЕ
        }
        return  false; // в противном случае false
    }


    // Обход в глубину. Разобъем поиск на 2 процедуры. Поиск интересующей Ноды
    // Так как будем пробегать рекурсивно то указываем ноду, которую будем
    // проверять и значение которое мы хоти проверить
    private Node find(Node node, int value){
        if (node.value == value) // Если нода содержит интересующее нас значение
            return node; // мы возвращаем текущую ноду
        else { // Если нет, то проверяем его детей, уходим в глубину
            for (Node child : node.children){ // берем детей и перебераем их реурсивно,
                // если у них есть свои дети, то точно также рекурсивно по ним будет поиск
                Node result = find(child, value); // для каждой проверки получаем результат
                if(result != null) // Если результат не равен НУЛ
                    return  result; // То возвращаем результат
            }
        }
        return null; // Если ни чего не смогли найти, то возвращаем НУЛ
    }

    public class Node{
        // В дерево можно положить значения любого типа, для простоты, цифры
        int value; // В ноде есть значение
        List<Node> children; // Есть список детей
        // В основном дерево обходят от корня root, но бывают и частные случаи,
        // поэтому для базового дерева иметь ссылку на его родителя не требуется
    }
}
