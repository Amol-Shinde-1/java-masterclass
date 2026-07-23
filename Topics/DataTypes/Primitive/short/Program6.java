/*
Question:
Write a Java program to accept a short value from the user and print it.

Concept:
Using Scanner with short data type.
*/

import java.util.Scanner;

class Program6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a short value : ");

        short number = sc.nextShort();

        System.out.println("You Entered : " + number);

        sc.close();
    }
}
