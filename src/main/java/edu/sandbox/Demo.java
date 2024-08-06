package edu.sandbox;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {
        Integer x = 1;
        int y = 2;

        Map<Integer, String> nameByNumber = new HashMap<>();

        nameByNumber.put(3, "Address 3"); // => nameByNumber.put((Convert to Integer) 2, "Address 1");
        nameByNumber.put(y, "Addr 2"); // Converted from int to Integer
        nameByNumber.put(x, "unu");

        System.out.println(nameByNumber);

        TreeSet<Parent> sortedParents = new TreeSet<>(new ParentAgeComparator());
//        TreeSet<Parent> sortedParents = new TreeSet<>();
        sortedParents.add(new Parent("Doina", 24));
        sortedParents.add(new Parent("Alex", 23));
        sortedParents.add(new Parent("Vasile", 21));
        sortedParents.add(new Parent("Bianca", 22));

        System.out.println(sortedParents);

        Child c1 =  new Child();
        c1.doSomething();
        c1.doSomething2();


        // int number = 123321
        // Iteration 1
        int number = 123321; // Will remain the same
        int numberModified = number; // Will decrease
        int palindrome = 0; // Will increase

        palindrome = number % 10;
        // 123321 % 10 => 1 (palindrome)

        numberModified = number / 10;
        // 123321 / 10 => 12332 (numberModified)

        // Iteration 2
        palindrome = (palindrome * 10) + numberModified % 10;
        // 12332 % 10 => 12 (palindrome)

        numberModified = numberModified / 10;
        // 12332 / 10 => 1233 (numberModified)

        // Iteration 3
        palindrome = (palindrome * 10) + numberModified % 10;
        // 1233 % 10 => 3 + 12*10 => 120 + 3 => 123 (palindrome)

        numberModified = numberModified /10;
        // 1233 % 10 => 123 (palindrome)

        // After iterations
        // number == palindrome ?
     }

}
