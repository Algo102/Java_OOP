package org.Lecture.Algoritm_L3;
// Частный случай связного списка
// Стек или LIFO, когда очередь уменьшается с конца, принцип стопки бумаг
public class StackLIFO {
    Node head;

    // Положить данные. В начало очереди - стэка(списка)
    public void push(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    //Извлечение данных из начала списка, ничего не принимает, так как извлекает
    public Integer pop(){
        Integer result = null;
        if (head != null){ // Сначала проверяем, если есть что нибудь
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public void revert(){
        if(head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    public void revert(Node currentNode, Node previousNode){

        if(currentNode.next == null)
            head = currentNode;
        else
            revert(currentNode.next, currentNode);
        currentNode.next = previousNode;
    }

    public  class Node{
        int value;
        Node next;
    }
}