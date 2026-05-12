package javaCollections.exercise1;

import java.util.*;

public class main {
    static void main() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 4; i++) {
            stringArrayList.add(scanner.next());
        }

        StringJoiner stringJoiner = new StringJoiner(",");
        for(String string : stringArrayList) {
            stringJoiner.add(string);
        }
        System.out.println(stringJoiner);

        Set<String> treeSet = new TreeSet<>(stringArrayList);

        System.out.println("TreeSet: ");
        for(String string : treeSet) {
            System.out.println(string);
        }

        System.out.println("Frequência de cada palavra digitada: ");
        //Pesquisar map.merge();
    }
}
