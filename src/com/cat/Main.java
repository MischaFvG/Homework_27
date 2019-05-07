package com.cat;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String a = "banana banana apple";
        String b = "hello world banana";
        String[] arrA = a.split("\\s");
        String[] arrB = b.split("\\s");
        System.out.println("String a is " + a);
        System.out.println("String b is " + b);
        System.out.println("Array of string a is " + Arrays.toString(arrA));
        System.out.println("Array of string b is " + Arrays.toString(arrB));
        String[] arrayOfStrings = new String[arrA.length + arrB.length];
        for (int i = 0; i < arrA.length; i++) {
            arrayOfStrings[i] = arrA[i];
        }
        for (int i = 0; i < arrB.length; i++) {
            arrayOfStrings[arrA.length + i] = arrB[i];
        }
        System.out.println("Array of strings is " + Arrays.toString(arrayOfStrings));
        Map<String, Integer> mapOfStrings = new HashMap<>();
        for (int i = 0; i < arrayOfStrings.length; i++) {
            mapOfStrings.put(arrayOfStrings[i], mapOfStrings.getOrDefault(arrayOfStrings[i], 0) + 1);
        }
        System.out.println("Map of strings is " + mapOfStrings);
        List<String> listOfStrings = new ArrayList<>();
        for (String mapKey : mapOfStrings.keySet()) {
            if (mapOfStrings.get(mapKey) == 1) {
                listOfStrings.add(mapKey);
            }
        }
        System.out.println("String with uncommon words is " + Arrays.toString(listOfStrings.toArray()));
    }
}
