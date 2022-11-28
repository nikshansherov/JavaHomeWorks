// Находит простые числа в диапазоне от 0 до 1000.

public class task02 {
    public static void main(String[] args) {
        int i, j, primeNumber;
        for (i = 2; i <= 1000; i++) {
            primeNumber = 0;
            for (j = 2; j < i; j++) {
                if (i % j != 0) primeNumber += 0;              
                else primeNumber += 1;                   
            }
            if (primeNumber == 0) System.out.print(i + " ");
        }
    }
}
