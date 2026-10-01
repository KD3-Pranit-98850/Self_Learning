package com.sunbeam;

import java.util.stream.LongStream;

public class Q8 {

    public static void main(String[] args) {

        int n = 5;

        long factorial = LongStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Factorial of " + n + " = " + factorial);
    }
}