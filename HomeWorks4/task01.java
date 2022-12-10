// Создает LinkedList с случайными элементами. Возвращает “перевернутый” список.

package HomeWorks4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class task01 {
    public static void main(String[] args) {
        Random rand = new Random();
        LinkedList <Integer> l = new LinkedList<>();
        for (int i = 0; i < 20; i++) l.add(rand.nextInt(20));
        System.out.println("Первоначальный список:");
        System.out.println(l);
        Collections.reverse(l);
        System.out.println("Перевернутый список:");
        System.out.println(l);
    }
}
