package com.sunbeam;

public class Q11 {

    public static <T extends Number & Comparable<T>> T findMinimum(T[] arr) {

        T min = arr[0];

        for (T element : arr) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }

        return min;
    }

    public static void main(String[] args) {

        Integer[] numbers = { 50, 20, 10, 40, 30 };

        Integer minimum = findMinimum(numbers);

        System.out.println("Minimum = " + minimum);
    }
}