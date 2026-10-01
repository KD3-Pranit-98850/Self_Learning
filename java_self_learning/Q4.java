
package com.sunbeam;

enum Day {

    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private boolean weekend;

    Day(boolean weekend) {
        this.weekend = weekend;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public boolean Weekday() {
        return !weekend;
    }
}

public class Q4 {
    public static void main(String[] args) {

        Day day = Day.SATURDAY;

        System.out.println("Day: " + day);
        System.out.println("Is Weekend: " + day.isWeekend());
        System.out.println("Is Weekday: " + day.Weekday());

        System.out.println();

        Day day2 = Day.MONDAY;

        System.out.println("Day: " + day2);
        System.out.println("Is Weekend: " + day2.isWeekend());
        System.out.println("Is Weekday: " + day2.Weekday());
    }
}