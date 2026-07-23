/*
Question:
Write a Java program to swap two short numbers without using a third variable.

Concept:
Logic Building.
*/

class Program10 {

    public static void main(String[] args) {

        short a = 20;
        short b = 40;

        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = (short)(a + b);
        b = (short)(a - b);
        a = (short)(a - b);

        System.out.println("\nAfter Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
