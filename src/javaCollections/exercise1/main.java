package javaCollections.exercise1;

import java.util.*;

public class main {
    static void main() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Map<String, Integer> frequency = new HashMap<>();
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
        int counter;
        for(int i = 0; i < stringArrayList.size() - 1; i++) {
            counter = 1;
            String str1 = stringArrayList.get(i);

            if(frequency.containsKey(str1)) continue;

            for(int j = i + 1; j < stringArrayList.size(); j++) {
                String str2 = stringArrayList.get(j);
                if(str1.equals(str2)) counter++;
            }
            frequency.put(str1, counter);
        }

        for(Map.Entry<String, Integer> entry: frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
