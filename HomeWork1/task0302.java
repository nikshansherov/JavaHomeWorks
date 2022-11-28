import java.util.Scanner;

public class task0302 {

    public static void main(String[] args) {
        System.out.println("---------------------------------- \n" +
        "Вас приветствует супер калькулятор\n" +
        "----------------------------------");
        System.out.println("Выберите пожалуйста действие : \n" +
        "Сложение (+) \n" +
        "Вычитание (-) \n" +
        "Умножение (*) \n" +
        "Деление (/) \n");

        Scanner scanner = new Scanner(System.in);
        char operation = scanner.next().charAt(0);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите первое число: ");
        double num2 = scanner.nextDouble();

        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
            System.err.println("Такого действия нет!");
        }
        
        if (operation == '/' && num2 == 0.0) {
            System.err.println("Ошибка - деление на 0!");
        }

        switch (operation) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.err.println("Invalid Operator Specified.");
                break;
        }
    }
}
