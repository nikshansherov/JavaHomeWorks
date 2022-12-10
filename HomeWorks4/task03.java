// Проверяет расстановку скобок в введенном пользователем выражении.

package HomeWorks4;

import java.io.IOException;
import java.util.Scanner;

public class task03 {
    
    // Удаляет лишние символы, оставляет только скобки, проверяет правильность расстановки скобок.
    public static boolean checkingBbrackets(String str) {
        String st = new String();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == ')' || str.charAt(i) == '{' || str.charAt(i) == '}'
                || str.charAt(i) == '[' || str.charAt(i) == ']') {
                st = st + str.charAt(i);
            }
        }
        while (st.contains("()") || st.contains("{}") || st.contains("[]")) {
            st = st.replaceAll("\\(\\)", "");
            st = st.replaceAll("\\{\\}", "");
            st = st.replaceAll("\\[\\]", "");
        }
        if (st.length() == 0) return true;
        else return false;
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите выражение: ");
            String str = scan.nextLine();
            boolean p = checkingBbrackets(str);
            if (p == true) System.out.println("В выражении: " + str + " - правильная расстановка скобок.");
            else System.out.println("В выражении: " + str + " - неправильная расстановка скобок.");
            while (true) {
                System.out.println("Хотите еще? Y/N");
                String s = scan.nextLine();
                if (s.charAt(0) == 'Y' || s.charAt(0) == 'y') break;
                else if (s.charAt(0) == 'N' || s.charAt(0) == 'n') System.exit(0);
                else {
                    System.out.println("Некорректный ввод!");
                    continue;
                }
                scan.close();
            }
        }
    }
}
