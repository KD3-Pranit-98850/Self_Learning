package com.sunbeam;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int specialCharacters = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {

                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }

            } else if (Character.isDigit(ch)) {
                digits++;

            } else if (Character.isWhitespace(ch)) {
                spaces++;

            } else {
                specialCharacters++;
            }
        }

        int totalCharacters = text.length();
        int letters = vowels + consonants;

        System.out.println("Total Characters: " + totalCharacters);
        System.out.println("Letters : " + letters);
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
        System.out.println("Digits : " + digits);
        System.out.println("Spaces : " + spaces);
        System.out.println("Special Characters : " + specialCharacters);

        sc.close();
    }
}