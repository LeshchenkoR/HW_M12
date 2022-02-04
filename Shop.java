package HW_M12;

import java.util.*;

public class Shop {

    private static final String MENU = """
            1. Модель
            2. Форма
            3. Механизм
            4. Обивка
            5. Выход
             """;

    public static void main(String[] args) {
        Divan divan1 = new Divan("Монако", "угловой", "тик-так", true, "ткань");
        Divan divan2 = new Divan("Денвер", "угловой", "выкатной", false, "кожа");
        Divan divan3 = new Divan("Камелот", "угловой", "дельфин", false, "ткань");
        Divan divan4 = new Divan("Монако", "прямой", "тик-так", false, "ткань");
        Divan divan5 = new Divan("Монако", "угловой", "тик-так", false, "кожа");
        Divan divan6 = new Divan("Брюссель", "прямой", "седафлекс", false, "кожа");
        Divan divan7 = new Divan("Брюссель", "прямой", "седафлекс", false, "кожа");
        Divan divan8 = new Divan("Брюссель", "прямой", "седафлекс", false, "кожа");

        List<Divan> divanList = new ArrayList<Divan>();
        divanList.add(divan1);
        divanList.add(divan2);
        divanList.add(divan3);
        divanList.add(divan4);
        divanList.add(divan5);
        divanList.add(divan6);
        divanList.add(divan7);
        divanList.add(divan8);

         //Шапка таблицы
        System.out.println("Модель" + "\t\t\t" + "форма" + "\t\t\t" + "механизм" + "\t\t\t" +
                "обивка" + "\t\t\t" + "Цена");

        class Print {
            void PrintTable(List<Divan> divanList) {
                for (Object divan : divanList) {
                    System.out.println(divan);
                }
            }
        }
        Print print = new Print();

//        Set<Divan> divanSet = new TreeSet<>(new DivanModelComp());
//        divanSet.addAll(divanList);

        // Collections.sort(divanSet, new DivanShapeComp());

        //SortedSet<Divan> sortedSet = new TreeSet<>();
        //sortedSet.addAll(divanList);


        print.PrintTable(divanList);
        System.out.println();

        Scanner scan = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Выберите вариант сортировки");
           // System.out.println();
            System.out.println(MENU);
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Сортировка по МОДЕЛИ:");
                    Collections.sort(divanList, new DivanModelComp());
                    print.PrintTable(divanList);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Сортировка по ФОРМЕ:");
                    Collections.sort(divanList, new DivanShapeComp());
                    print.PrintTable(divanList);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Сортировка по МЕХАНИЗМУ:");
                    Collections.sort(divanList, new DivanMechanismComp());
                    print.PrintTable(divanList);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Сортировка по ТИПУ ОБИВКИ:");
                    Collections.sort(divanList, new DivanFabricCategory());
                    print.PrintTable(divanList);
                    System.out.println();
                    break;
                case 5:
                    break;
                default: {
                    System.out.println("Некорректный ввод");
                }
            }
        } while (choice != 5);
    }
}
