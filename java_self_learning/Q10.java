package com.sunbeam;

import java.util.stream.IntStream;
import java.util.IntSummaryStatistics;

public class Q10 {

    public static void main(String[] args) {

        IntStream stream = IntStream.rangeClosed(1, 10);

        int sum = IntStream.rangeClosed(1, 10).sum();

        System.out.println("Numbers: 1 to 10");
        System.out.println("Sum = " + sum);

        IntSummaryStatistics statistics = IntStream.rangeClosed(1, 10).summaryStatistics();

        System.out.println("\nSummary Statistics:");
        System.out.println("Count = " + statistics.getCount());
        System.out.println("Sum = " + statistics.getSum());
        System.out.println("Minimum = " + statistics.getMin());
        System.out.println("Maximum = " + statistics.getMax());
        System.out.println("Average = " + statistics.getAverage());
    }
}