/*
Question:
Write a Java program to demonstrate overflow in the int data type.

Concept:
Integer Overflow.
*/

class Program5 {

    public static void main(String[] args) {

        int value = Integer.MAX_VALUE;

        System.out.println("Before Increment = " + value);

        value++;

        System.out.println("After Increment = " + value);
    }
}
