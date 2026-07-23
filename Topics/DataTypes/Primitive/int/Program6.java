/*
Question:
Write a Java program to accept an integer from the user and print it.

Concept:
Scanner Class.
*/

import java.util.Scanner;

class Program6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int number = sc.nextInt();

        System.out.println("You Entered = " + number);

        sc.close();
    }
}
