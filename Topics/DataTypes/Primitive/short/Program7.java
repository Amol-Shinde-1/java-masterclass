/*
Question:
Write a Java program to demonstrate type promotion while adding two short variables.

Concept:
Arithmetic operations on short are promoted to int.
*/

class Program7 {

    public static void main(String[] args) {

        short a = 100;
        short b = 200;

        int sum = a + b;

        System.out.println("Sum = " + sum);

        // short sum = a + b; // Compile-Time Error
    }
}
