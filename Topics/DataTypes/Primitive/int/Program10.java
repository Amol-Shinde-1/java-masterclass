/*
Question:
Write a Java program to swap two integers without using a third variable.

Concept:
Logic Building.
*/

class Program10 {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
