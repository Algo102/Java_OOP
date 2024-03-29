package org.Lecture.Algoritm_L3;
// ДВУСВЯЗНЫЙ список содержит ссылки на следующий и предидущий элемент списка
public class List2svyazn {
    Node head; // начало списка - ссылка на голову
    Node tail; // cсылка последнюю ноду - хвост

    // Метод для ДОБАВЛЕНИЯ элемента В КОНЕЦ связного списка
    // Размер списка не важен, нужно только иметь ссылку, куда хотим добавить
    // Так как нет индексов в связанном списке и ничего не нужно двигать при
    // вставке элемента, то Сложность будет O(1)константная, в отличие от массива O(n)
    public void add(int value){
        Node node = new Node(); // создаем новую ноду
        node.value = value; // дадим ей значение
        // Определяем, есть ли у него еще елементы или эта первая Нода
        // Если нет, то новая Нода становится и головой и хвостом
        if (head == null){
            head = node;
            tail = node;
        }
        else {
            // Иначе новая Нода становится хвостом, а бывший хвост становится предидущим
            tail.next = node; // берем хвост и говорим, что следующая нода равна нашей ноде
            node.previous = tail; // предидущий элемент от текущей ноды, это бывший хвост
            tail = node; // а текущим хвостом становится наша нода
        }
    }

    // Метод ВСТАВКИ В СЕРЕДИНУ списка. Добавляем значение после какой-то Ноды
    // по принципу find находим нужную ноду и вставляем после нее
    // При этом поиск места вставки может занимать O(n) и Вставка O(1):
    public void add(int value, Node node){
        Node next = node.next; // создаем ссылку на следующее - это то на что ссылается Нода на данный момент
        Node newNode = new Node(); // Опять сгенерируем новую Ноду
        newNode.value = value; // присваиваем значение в новой Ноде
        node.next = newNode; // берем текущую Ноду и говорим, что следующее значение это ее новая Нода
        newNode.previous = node; // а ньюНоде говорим, что ее предыдущее значение, на текущий момент Нода

        // Нужно обновить tail, так как мы получили новую Ноду
        if (next == null) {
            tail = newNode;
        }
        else {
            next.previous = newNode;
            newNode.next = next;
        }
    }

    // Разворот для двухсвязанного списка
    public void revert(){
        Node currentNode = head;
        // Проходим по списку пока не упремся в 0
        while ((currentNode != null)){
            Node next = currentNode.next; //Используем ссылки на следующую и
            Node previous = currentNode.previous;//предыдущую, записанные в Ноде
            currentNode.next = previous; // Меняем их местами
            currentNode.previous = next;

            // Если предпоследний = 0, то currentNode с head меняем на tail
            if(previous == null)
                tail = currentNode;

            // Если последний элемент 0, то он будет первым
            if(next == null)
                head = currentNode;

            // Переходим к следующему элементу, и так пока не завершим полный обход
            // и не поменяем все
            currentNode = next;
        }
    }

    // Функция удаления Нода, принимает в себя искомую Ноду
    //Аналогично вставке в середину - поиск места удаляемой ноды может занимать O(n) и удаление O(1):
    public void delete(Node node){
        Node previous = node.previous; // новые переменные
        Node next = node.next; //Которые находятся до и после искомого Нода

        // Если искомая Нода на позиции головы
        // Если предидущая Нода равна 0, то есть искомая оказалась голова
        if (previous == null){
            next.previous = null; // удаляем первый элемент
            head = next; // и говорим что началом станет следующий
        }
        else {
            // Если элемент в конце списка равен 0
            if(next == null){
                previous.next = null; // удалили последний элемент
                tail = previous; // поставили указатель на хвост
            }
            else {
                // Обработаем ситуацию когда Нода находится в середине
                // Тем самым удаляем искомую Ноду
                previous.next = next;
                next.previous = previous;
            }
        }
    }

    // Метод для ПОИСКА ноды
    // Так как тут нет индексов, нужно перебирать. Сложность O(n)
    public Node find(int value){
        Node currentNode = head; // начинаем поиск с начала
        while (currentNode != null){ // пока текущая нода не равна нулю
            if (currentNode.value == value){ //Если текущее значение равно искомому значению
                return currentNode; // возвращаем эту ноду
            }
            currentNode = currentNode.next;// если иф не произошел, то текущ.нода будет равняться следующей
        }
        return null; //если ничего не нашлось, то возвращаем null

    }

    public class Node{
        //могут хранить разные типы данный, для простоты int
        int value; // Значение ноды
        Node next; // у односвязного списка есть ссылка, которая описывает след.элемент
        Node previous; // Делаем ссылку, чтоб мы могли обращаться к предыдущему значению
    }

}
