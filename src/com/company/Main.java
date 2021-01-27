package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>
                listA = new ArrayList<>(),
                listB = new ArrayList<>(),
                listC = new ArrayList<>();

        arrayStringFilling(listA);
        System.out.println(listA + " listA");

        arrayStringFilling(listB);
        System.out.println(listB + " listB");

        Collections.reverse(listB);

        Iterator<String>
                iteratorListA = listA.iterator(),
                iteratorListB = listB.iterator();

        while (iteratorListA.hasNext() && iteratorListB.hasNext()) {
            listC.add(iteratorListA.next());
            listC.add(iteratorListB.next());
        }
        System.out.println(listC + " listC");

        Comparator<String> comparator = (o1, o2) -> {
            return o1.length()-o2.length();
        };
        Collections.sort(listC, comparator);
        System.out.println(listC);



    }


    public static void arrayStringFilling(Collection<String> list) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку");
            String s = scanner.nextLine();
            list.add(s);
        }
    }

}