package com.teachmeskills.lesson13.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkingWithStream {

    public static void launchingStream(){
        ArrayList<Integer> numbersList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 22; i++){
            numbersList.add(random.nextInt(100));
        }

        List<Integer> removeDuplicates = numbersList.stream()
                .distinct()
                .toList();

        List<Integer> outputEvenNumbers = numbersList.stream()
                .filter(num -> num % 2 == 0 && num >= 7 && num <= 17)
                .toList();


        List<Integer> doublingNumber = numbersList.stream()
                .map(num -> num * 2)
                .toList();


        List<Integer> sortedFirstFour = numbersList.stream()
                .sorted()
                .limit(4)
                .toList();


        long count = numbersList.stream().count();


        double averageValue = numbersList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);


        List<String> students = new ArrayList<>();
        students.add("Dovlet");
        students.add("Roman");
        students.add("Vladimir");
        students.add("Tatiana");
        students.add("Gleb");
        students.add("Dmitry");
        students.add("Alexey");
        students.add("Alexander");
        students.add("Vladislav");
        students.add("Andrey");

        List<String> sortingByFirstA = students.stream()
                .filter(name -> name.toLowerCase().startsWith("а"))
                .toList();

        String FirstElement = students.stream()
                .sorted()
                .findFirst()
                .get();

        System.out.println("Unique elements: " + removeDuplicates);
        System.out.println("Even elements in the range from 7 to 17: " + outputEvenNumbers);
        System.out.println("Each element multiplied by 2: " + doublingNumber);
        System.out.println("The first 4 items after sorting: " + sortedFirstFour);
        System.out.println("The number of elements in the stream: " + count);
        System.out.println("The arithmetic mean of all the numbers in the stream: " + averageValue);

        System.out.println("The first item after sorting: " + FirstElement);
    }
}
