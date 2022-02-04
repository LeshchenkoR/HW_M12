package HW_M12;

import java.util.*;

public class Shop {

    private static final String MENU = """
            1. ������
            2. �����
            3. ��������
            4. ������
            5. �����
             """;

    public static void main(String[] args) {
        Divan divan1 = new Divan("������", "�������", "���-���", true, "�����");
        Divan divan2 = new Divan("������", "�������", "��������", false, "����");
        Divan divan3 = new Divan("�������", "�������", "�������", false, "�����");
        Divan divan4 = new Divan("������", "������", "���-���", false, "�����");
        Divan divan5 = new Divan("������", "�������", "���-���", false, "����");
        Divan divan6 = new Divan("��������", "������", "���������", false, "����");
        Divan divan7 = new Divan("��������", "������", "���������", false, "����");
        Divan divan8 = new Divan("��������", "������", "���������", false, "����");

        List<Divan> divanList = new ArrayList<Divan>();
        divanList.add(divan1);
        divanList.add(divan2);
        divanList.add(divan3);
        divanList.add(divan4);
        divanList.add(divan5);
        divanList.add(divan6);
        divanList.add(divan7);
        divanList.add(divan8);

         //����� �������
        System.out.println("������" + "\t\t\t" + "�����" + "\t\t\t" + "��������" + "\t\t\t" +
                "������" + "\t\t\t" + "����");

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
            System.out.println("�������� ������� ����������");
           // System.out.println();
            System.out.println(MENU);
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("���������� �� ������:");
                    Collections.sort(divanList, new DivanModelComp());
                    print.PrintTable(divanList);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("���������� �� �����:");
                    Collections.sort(divanList, new DivanShapeComp());
                    print.PrintTable(divanList);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("���������� �� ���������:");
                    Collections.sort(divanList, new DivanMechanismComp());
                    print.PrintTable(divanList);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("���������� �� ���� ������:");
                    Collections.sort(divanList, new DivanFabricCategory());
                    print.PrintTable(divanList);
                    System.out.println();
                    break;
                case 5:
                    break;
                default: {
                    System.out.println("������������ ����");
                }
            }
        } while (choice != 5);
    }
}
