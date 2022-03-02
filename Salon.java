package HW_M12;

import java.util.*;
import java.util.stream.Collectors;

public class Salon {

    private static final String MENU = """
            1. ������.
            2. �����.
            3. ��������.
            4. ������.
            5. �����""";

    public static void main(String[] args) {
        Divan divan1 = new Divan("������", "�������", "���-���", false, "�����");
        Divan divan2 = new Divan("������", "�������", "��������", false, "�����");
        Divan divan3 = new Divan("�������", "������", "�������", false, "�����");
        Divan divan4 = new Divan("������", "�������", "���-���", false, "����");
        Divan divan5 = new Divan("��������", "������", "���������", false, "�����");
        Divan divan6 = new Divan("������", "������", "���-���", false, "�����");
        Divan divan7 = new Divan("��������", "�������", "���������", false, "����");
        List<Divan> divanList = new ArrayList<Divan>();


        divanList.add(divan1);
        divanList.add(divan2);
        divanList.add(divan3);
        divanList.add(divan4);
        divanList.add(divan5);
        divanList.add(divan6);
        divanList.add(divan7);

        //����� �������
        System.out.println("������" + "\t\t\t\t" + "�����" + "\t\t\t\t" + "��������" + "\t\t\t\t" + "������" + "\t\t\t\t" + "����");

        class Print {
            void printTable(List<Divan> divanList) {
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
            System.out.println("�������� ������� ����������");
            System.out.println(MENU);
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("���������� �� ������");
                    divanList.stream().sorted(Comparator.comparing(Divan::getModel))
                            .forEach(System.out::println);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("���������� �� �����");
                    divanList.stream().sorted(Comparator.comparing(Divan::getShape))
                            .forEach(System.out::println);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("���������� �� ���������");
                    divanList.stream().sorted(Comparator.comparing(Divan::getMechanism))
                            .forEach(System.out::println);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("���������� �� ���� ������");
                    divanList.stream().sorted(Comparator.comparing(Divan::getFabricCategory))
                            .forEach(System.out::println);
                    System.out.println();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("������������ ����");
            }
        } while (choice != 5);
    }
}
