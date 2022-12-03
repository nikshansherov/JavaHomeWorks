// Создает произвольный список целых чисел, находит минимальное и максимальное значение в списке,
// находит среднее арифметическое значение элементов списка.

package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task03 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList <Integer> numbers = new ArrayList<>();
        Integer n = 20; // длина списка

        for (int i = 0; i < n; i++) numbers.add(rand.nextInt(20));
        System.out.println("Первоначальный список:");
        System.out.println(numbers);
        System.out.println("Максимальный элемент списка: " + Collections.max(numbers));
        System.out.println("Минимальный элемент списка: " + Collections.min(numbers));
        float sum = numbers.stream().mapToInt(Integer::intValue).sum();
        float sr = sum / numbers.size();
        System.out.println("Среднее арифметическое элементов списка: " + sr);
    }
}
