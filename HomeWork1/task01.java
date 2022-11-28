// Принимает целое число N, находит сумму чисел от 0 до N, находит факториал N.
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        
        //  проверка на int и > 0
        do {
            System.out.print("Введите целое положительное число: ");
            while (!scan.hasNextInt()) {
                System.out.print("Это не целое число! Попробуйте снова: ");
                scan.next();
            }
            number = scan.nextInt();
        } while (number <= 0);
        scan.close();
        int amount = 0;
        float factorial = 1;

        // Вычисление суммы и факториала
        for (int index = 1; index <= number; index++) {
            amount += index;
            factorial *= index; 
        }
        System.out.println("Сумма чисел от 1 до " + number + " = " + amount);
        System.out.println("Факториал чисела " + number + " = " + factorial);
    }
}