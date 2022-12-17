// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент 
// из очереди, не удаляя.

package HomeWorks4;

import java.util.LinkedList;
import java.util.Random;

public class task02 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) l.add(rand.nextInt(20));
        int number = 7;
        System.out.println("Первоначальный список: \t\t\t" + l);
        l = enqueue(l, number);             // добавление элемента в конец очереди
        System.out.println("Cписок после добавления элемента: \t" + l);
        Object[] ld = dequeue(l);           // возвращение и удаление первого элемента
        System.out.println("Cписок после удаления первого элемента: " + ld[0]);
        System.out.println("Удаленный элемент: \t\t\t" + ld[1]);
        int n = first(l);                   // получение первого элемента
        System.out.println("Первый элемент списка: \t\t\t" + n);
    }

    // Добавляет элемент в конец очереди
    public static LinkedList<Integer> enqueue(LinkedList<Integer> l, int number) {
        l.add(number);
        return l;
    }

    // Возвращает и удаляет первый элемент
    public static Object[] dequeue(LinkedList<Integer> l) {
        int num = l.getFirst();
        l.removeFirst();
        return new Object[] { l, num };
    }

    // Возвращает первый элемент
    public static Integer first(LinkedList<Integer> l) {
        int number = l.getFirst();
        return number;
    }
}
