import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listS = new ArrayList<>();

        System.out.println("List a");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());

        }
        Iterator<String> iterator1 = listA.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("List b");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());

        }
        Iterator<String> iterator2 = listB.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println("++++++++++++++++++++++");

        listS.add(listA.get(1));
        listS.add(listB.get(4));
        listS.add(listA.get(2));
        listS.add(listB.get(4));
        listS.add(listA.get(3));
        listS.add(listB.get(3));
        listS.add(listA.get(4));
        listS.add(listB.get(2));
        listS.add(listA.get(4));
        listS.add(listB.get(1));

        Iterator<String> iterator3 = listS.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
        System.out.println("+++++++++++++++++++++++++");
        listS.sort(Comparator.comparing(String::length));
        Iterator<String> iterator4 = listS.iterator();
        while (iterator4.hasNext()) {
            System.out.println(iterator4.next());
        }
    }
}