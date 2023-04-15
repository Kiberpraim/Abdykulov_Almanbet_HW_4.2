import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Заполнение списка \"А\"");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ведите строку №" + (i+1));
            listA.add(scanner.nextLine());
        }
        System.out.println(listA);

        ArrayList<String> listB = new ArrayList<>();
        System.out.println("\n Заполнение списка \"Б\"");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ведите строку №" + (i+1));
            listB.add(scanner.nextLine());
        }
        System.out.println(listB);

        System.out.println("\n Объединение списков следующим образом {A1,Б5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}");
        ArrayList<String> listC = new ArrayList<>();
        Collections.reverse(listB);
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println("\n" + listC);
    }
}