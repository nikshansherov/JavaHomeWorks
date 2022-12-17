import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<NoteBook> nt = new ArrayList<>();

        NoteBook nb1 = new NoteBook("acer", "4000", "1000",
                "Windows", "black");
        NoteBook nb2 = new NoteBook("acer", "2000", "500",
                "Windows", "green");
        NoteBook nb3 = new NoteBook("hp", "2000", "1000",
                "Windows", "black");
        nt.add(nb1);
        nt.add(nb2);
        nt.add(nb3);

        System.out.println("Фирма: " + nb1.name + ", ОЗУ кВ: " + nb1.ozu + ", Емкость жесткого диска GB: " + nb1.gmd +
                ", Операционная система: " + nb1.os + ", Цвет: " + nb1.color);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите критерии поиска: ");
        System.out.println("Выход - 0 ");
        System.out.println("Производитель - 1 ");
        System.out.println("ОЗУ - 2 ");
        System.out.println("Емкость жесткого диска - 3 ");
        System.out.println("Операционная система - 4");
        System.out.println("Цвет - 5");
        String str = scan.nextLine();
        System.out.println("Введите значение критерия: ");
        String n = scan.nextLine();
        scan.close();

        switch (str) {
            case ("0"):
                System.exit(0);
            case ("1"):
                for (NoteBook i : nt) {
                    if (i.name.equals(n)) {
                        System.out.println(
                                "Фирма: " + i.name + ", ОЗУ кВ: " + i.ozu + ", Емкость жесткого диска GB: " + i.gmd +
                                        ", Операционная система: " + i.os + ", Цвет: " + i.color);
                    }
                }
                break;
            case ("2"):
                for (NoteBook i : nt) {
                    if (i.ozu.equals(n)) {
                        System.out.println(
                                "Фирма: " + i.name + ", ОЗУ кВ: " + i.ozu + ", Емкость жесткого диска GB: " + i.gmd +
                                        ", Операционная система: " + i.os + ", Цвет: " + i.color);
                    }
                }
                break;
            case ("3"):
                for (NoteBook i : nt) {
                    if (i.gmd.equals(n)) {
                        System.out.println(
                                "Фирма: " + i.name + ", ОЗУ кВ: " + i.ozu + ", Емкость жесткого диска GB: " + i.gmd +
                                        ", Операционная система: " + i.os + ", Цвет: " + i.color);
                    }
                    break;
                }
            case ("4"):
                for (NoteBook i : nt) {
                    if (i.os.equals(n)) {
                        System.out.println(
                                "Фирма: " + i.name + ", ОЗУ кВ: " + i.ozu + ", Емкость жесткого диска GB: " + i.gmd +
                                        ", Операционная система: " + i.os + ", Цвет: " + i.color);
                    }
                    break;
                }
            case ("5"):
                for (NoteBook i : nt) {
                    if (i.color.equals(n)) {
                        System.out.println(
                                "Фирма: " + i.name + ", ОЗУ кВ: " + i.ozu + ", Емкость жесткого диска GB: " + i.gmd +
                                        ", Операционная система: " + i.os + ", Цвет: " + i.color);
                    }
                }
                break;
            default:
                System.out.println("Такого критерия не существует");
                break;
        }
    }
}
