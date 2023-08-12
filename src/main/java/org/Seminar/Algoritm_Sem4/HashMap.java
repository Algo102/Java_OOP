package org.Seminar.Algoritm_Sem4;

import java.util.Arrays;

public class HashMap<K, V> {

    private static final int INIT_BUCKET_COUNT = 16;
    private static final double LOAD_FACTOR = 0.5;
    private  int size; // Истинное количество добавленных элементов хэш таблицы
    private Bucket[] buckets; // Массив бакетов (связных списков)



    /**
     * Элемент Хэш таблицы
     */
    class Entity{
        K key; // Ключ элемента
        V value; //Значение элемента

        @Override
        public String toString() {
            return String.format("%s - %s", key, value);
        }
    }

    /**
     * Связный список
     * @param <K> Ключ элемента хэш таблицы
     * @param <V> Значение элемента хэш таблицы
     */
    class Bucket<K, V>{

        Node head; // Указатель на первый элемент связного списка

        /**
         * Узел бакета(связного списка)
         */
        class Node{

            Node next; // Указатель на следующий элемент связного списка

            Entity value; // Значение узла, указывающее на элемент хэш таблицы

        }



        /**
         * Добавление нового метода хэш таблицы
         * @param entity элемент
         * @return
         */
        public V add(Entity entity){
            Node node = new Node(); // Создаем новую ноду
            node.value = entity; // Указываем у нее значение

            // Частный случай
            if(head == null){ // Если в бакете нет ни одного значение
                head = node; // Добавляем значение
                return null; // Возвращаем null т.к. это единственный узел и
                // не пришлось заменять ссылки
            }

            // В рамках общего случая, когда есть хоть один элемент
            Node currentNode = head; // создаем переменную, указывающую на голову
            while (true){//Зацикливаем
                // Проходим по всем элементам связного списка(бакета), проверяем значение ключа.
                // Если нашли такой же, т.е. ключ у элемента совпадает с тем ключом, который пытаемся добавить
                // то добавляем новый элемент
                if(currentNode.value.key.equals(entity.key)){
                    V buf = (V) currentNode.value.value; // Старое значение записываем в переменную buf(с кастом)
                    currentNode.value.value = entity.value; // Перезаписываем его на новое значение
                    return buf; // И вернуть старое
                }
                // Если не нашли, то двигаемся дальше по всем элементам связного списка(бакета)
                if(currentNode.next != null){
                    currentNode = currentNode.next;
                }
                else {//Если в бакете, который лежит в ячейке массива, не нашли такого же значения ключа, то добавляем в конец бакета
                    currentNode.next = node;
                    return null; // null, потому что добавили новый элемент и ничего не перезаписали
                }
            }
        }

        public V get(K key){
            Node node = head;
            while (node != null){
                if (node.value.key.equals(key))
                    return (V)node.value.value;
                node = node.next;
            }
            return null;
        }

        public V remove(K key){
            if(head ==null)
                return  null;
            if (head.value.key.equals(key)){
                V buf = (V)head.value.value;
                head = head.next;
                return  buf;
            }
            else {
                Node node = head;
                while (node.next != null){
                    if (node.next.value.key.equals(key)){
                        V buf = (V)node.next.value.value;
                        return buf;
                    }
                    node = node.next;
                }
                return null;
            }
        }
    }

    // Вычисление индекса для массива по хеш коду
    private int calculateBucketIndex(K key){
        // Берем по модулю хеш, т.к. он может быть отрицательным
        // и берем остаток от деления на длину массива
        return  Math.abs(key.hashCode()) % buckets.length;
    }

    // Служебный метод для расширение массива, чтоб не собирать большую очередь в одной ячейки
    // Метод должен расширить массив в два раза и перезаписать в нем все бакеты
    private void recalcelate(){
        size = 0; // Обнуляем счетчик, чтоб при рекалькуляции значение не задвоилось
        Bucket<K, V>[] old = buckets; // Старый бакет
        buckets = new Bucket[old.length]; // Создаем новый массив, с длиной старого умноженного на 2
        for (int i = 0; i < old.length; i++) {
            Bucket<K,V> bucket = old[i];
            if (bucket != null){
                Bucket.Node node = bucket.head;
                while (node!= null){
                    put((K) node.value.key, (V)node.value.value);
                    node = node.next;
                }
            }
        }
    }

    public V put(K key, V value){
        if(buckets.length * LOAD_FACTOR <= size){
            recalcelate();
        }
        int index = calculateBucketIndex(key); // вычисление индекса
        Bucket bucket = buckets[index]; // Узнаем по этому индексу в бакете есть объект или нет
        if (bucket == null) { // Проверяем если в этой ячейки узел или нет(есть ли переменная или пустая)
            bucket = new Bucket(); // Если пусто, то создаем бакет
            buckets[index] = bucket; // и индекс указывает на новый объект бакета
        }

        // Объединяем ключ и значение
        Entity entity = new Entity();
        entity.key = key;
        entity.value = value;

        V buf = (V) bucket.add(entity);
        if(buf == null){
            size++; // Подсчет уникального количества
        }
        return buf;
    }

    public V get(K key){
        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null)
            return null;
        return (V) bucket.get(key);
    }

    public V remove(K key){
        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null)
            return null;
        V buf = (V) bucket.remove(key);
        if(buf != null){
            size--;
        }
        return buf;
    }

    public HashMap(){
        buckets = new Bucket[INIT_BUCKET_COUNT];
    }

    public HashMap(int initCount){
        buckets = new Bucket[initCount];
    }

    @Override
    public String toString() {
        return "HashMap{" +
                "size=" + size +
                ", buckets=" + Arrays.toString(buckets) +
                '}';

    }

}
