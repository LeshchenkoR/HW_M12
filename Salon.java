package HW_M12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Salon {

    private static final String MENU = """
            1. Модель.
            2. Форма.
            3. Механизм.
            4. Обивка.
            5. Выход""";

    public static void main(String[] args) {
        Divan divan1 = new Divan("Монако", "угловой", "тик-так", false, "ткань");
        Divan divan2 = new Divan("Денвер", "угловой", "выкатной", false, "ткань");
        Divan divan3 = new Divan("Камелот", "прямой", "дельфин", false, "ткань");
        Divan divan4 = new Divan("Монако", "угловой", "тик-так", false, "кожа");
        Divan divan5 = new Divan("Брюссель", "прямой", "седафлекс", false, "ткань");
        Divan divan6 = new Divan("Монако", "прямой", "тик-так", false, "ткань");
        Divan divan7 = new Divan("Брюссель", "угловой", "седафлекс", false, "кожа");
        List<Divan> divanList = new ArrayList<Divan>();

        divanList.add(divan1);
        divanList.add(divan2);
        divanList.add(divan3);
        divanList.add(divan4);
        divanList.add(divan5);
        divanList.add(divan6);
        divanList.add(divan7);

        //Шапка таблицы
        System.out.println("Модель" + "\t\t\t\t" + "Форма" + "\t\t\t\t" + "Механизм" + "\t\t\t\t" + "Обивка" + "\t\t\t\t" + "Цена");

        class Print {
            void printTable(List<Divan> divanList1) {
                for (Object divan : divanList) {
                    System.out.println(divan);
                }
            }
        }
        Print print = new Print();
        print.printTable(divanList);
        System.out.println();

        Scanner scan = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Выберите вариант сортировки");
            System.out.println(MENU);
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Сортировка по МОДЕЛИ");
                    Collections.sort(divanList, new DivanModelComp());
                    print.printTable(divanList);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Сортировка по ФОРМЕ");
                    Collections.sort(divanList, new DivanShapeComp());
                    print.printTable(divanList);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Сортировка по МЕХАНИЗМУ");
                    Collections.sort(divanList, new DivanMechanismComp());
                    print.printTable(divanList);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Сортировка по ТИПУ ОБИВКИ");
                    Collections.sort(divanList, new DivanModelComp());
                    print.printTable(divanList);
                    System.out.println();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Некорректный ввод");
            }
        } while (choice !=5);
    }
}
