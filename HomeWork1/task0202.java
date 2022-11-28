// Находит простые числа в диапазоне от 0 до 1000. Алгоритм - решето Эрастофена.

import java.util.ArrayList;
import java.util.stream.IntStream;

public class task0202 {
    public static void main(String[] args) {
        int[] arr;
        arr = IntStream.rangeClosed(0, 1000).toArray();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 2;
        while (i <= 1000) {
            if (arr[i] != 0) {
                list.add(arr[i]);
                for (int j = i; j <= 1000; j += i) {
                    arr[j] = 0;
                }
            }
            i += 1;
        }
        System.out.println(list);
    }
}
