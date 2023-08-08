package org.Seminar.Algoritm_Sem3;

// Так как не знаем тип данных который будет храниться в нодах, создаем свой
// обобщенный тип <T>

import java.util.Comparator;

/**
 * Связный список
 * @param <T>
 */
public class LinkedListOdnosv<T> {
    /**
     * Указатель на первый элемент однонаправленного связного списка
     */
    private Node head;

    //Вспомогательный класс, служебный, только для ноды
    /**
     * Узел связного списка
     */
    class Node{


        /**
         * Ссылка на следующий элемент
         */
        public  Node next;

        /**
         * Значение узла с обобщенным типом
         */
        public T value;
    }

    /**
     * Добавление нового элемента в начало связного списка
     * @param value
     */
    public void addFirst(T value){
        //все значения добавляются в новый узел
        Node node = new Node();
        node.value = value;
        if(head != null){ // если есть хоть один элемент
            node.next = head; // значения head переходит к следующей ноде
        }
        head = node; // а новая нода становится head
    }

    /**
     * Удаление первого элемента списка
     */
    // При удалении первого элемента, по факту мы просто отвязываем от него
    // ссылку, а сборщик мусора сам удалит его из памяти
    public void removeFirst(){
        if (head!=null){
            head = head.next;
        }
    }

    /**
     * Поиск элемента по значению
     * @param value
     * @return
     */
    //Поиск только перебором через while, т.к. это не массив и нет индексов
    public T contains(T value){
        Node node = head;
        while (node!=null){
            if(node.value.equals(value))
                return node.value;
            node = node.next;
        }
        return null;
    }

    /**
     * Метод сортировки ВЫБОРОМ
     */
    public void sort(Comparator<T> comparator){
        Node node = head;
        while (node!=null){
            Node minValueNode = node;

            Node node2 = node.next;
            while (node2!=null){
                if(comparator.compare(minValueNode.value, node2.value) > 0){
                    minValueNode = node2;
                }
                node2 = node2.next;
            }
            if (minValueNode!=node){
                T buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }
            node = node.next;
        }
    }

    /**
     * Добавление элемента в конец связного списка
     * @param value
     */
   public void addLast(T value){
       Node node = new Node();
       node.value = value;
       if(head==null){
           head = node;
       }
       else {
           Node lastNode = head;
           while (lastNode.next!=null){
               lastNode = lastNode.next;
           }
           lastNode.next = node;
       }
   }

    /**
     * Удаление последнего элемента
     */
   public void removeLast(){
       if (head == null){
           return;
       }
       Node node = head;
       while (node.next!=null){
           if(node.next.next == null){
               node.next = null;
               return;
           }
           node = node.next;
       }
       head = null;
   }




    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node!=null){
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
