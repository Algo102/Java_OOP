package org.DZ.DZ_4.MyLinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedContaier<String> stringLinked = new LinkedContaier<>();

        stringLinked.addFirst("tre1");
        stringLinked.addFirst("for2");
        stringLinked.addFirst("tre3");
        stringLinked.addFirst("for4");
//      stringLinked.addLast("abc");
//      stringLinked.addLast("qwe");
//      System.out.println(stringLinked.size());
//      System.out.println(stringLinked.getElementByIndex(0));
//      System.out.println(stringLinked.getElementByIndex(1));
//      System.out.println(stringLinked.getElementByIndex(2));
//      System.out.println(stringLinked.getElementByIndex(3));

        for (String s: stringLinked) {
            System.out.println(s);
        }

        Iterator iterator = stringLinked.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
