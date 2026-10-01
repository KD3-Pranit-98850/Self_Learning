package com.sunbeam;

import java.util.Arrays;

public class Q9 {

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40, 50};

        int sum = Arrays.stream(numbers)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum = " + sum);
    }
}