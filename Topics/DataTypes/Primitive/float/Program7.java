/*
Question:
Write a Java program to accept a float value from the user.

Concept:
Scanner Class.
*/

import java.util.Scanner;

class FloatUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your percentage : ");

        float percentage = sc.nextFloat();

        System.out.println("Percentage = " + percentage);

        sc.close();
    }
}
