// Создает произвольный список целых чисел, удаляет из него четные числа.

package HomeWork3;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class task02 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList <Integer> numbers = new ArrayList<>();
        Integer n = 20; // длина массива

        for (int i = 0; i < n; i++) numbers.add(rand.nextInt(20));
        System.out.println("Первоначальный список:");
        System.out.println(numbers);

        ListIterator <Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0 || number == 0) iterator.remove();
        }
        System.out.println("Список без четных чисел:");
        System.out.print(numbers);
    }
}