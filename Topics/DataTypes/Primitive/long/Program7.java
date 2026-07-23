/*
Question:
Write a Java program to accept a long value from the user.

Concept:
Scanner Class.
*/

import java.util.Scanner;

class LongUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a long value : ");

        long number = sc.nextLong();

        System.out.println("You Entered = " + number);

        sc.close();
    }
}
