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
        // Remove duplicates
        List<Integer> removeDuplicates = numbersList.stream()
                .distinct()
                .toList();

        // Output all even elements in the range from 7 to 17 (inclusive)
        List<Integer> outputEvenNumbers = numbersList.stream()
                .filter(num -> num % 2 == 0 && num >= 7 && num <= 17)
                .toList();

        // Multiply each element by 2
        List<Integer> doublingNumber = numbersList.stream()
                .map(num -> num * 2)
                .toList();

        //Sort and display the first 4 elements
        List<Integer> sortedFirstFour = numbersList.stream()
                .sorted()
                .limit(4)
                .toList();

        // Print the number of elements in the stream
        long count = numbersList.stream().count();


        // Print the arithmetic mean of all the numbers in the stream
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

        // Select all names starting with "a"
        List<String> sortingByFirstA = students.stream()
                .filter(name -> name.toLowerCase().startsWith("а"))
                .toList();

        // Sort and return the first element of the collection
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
