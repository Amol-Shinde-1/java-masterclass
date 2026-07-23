/*
Question:
Write a Java program to demonstrate overflow in the short data type.

Concept:
Overflow occurs when a value exceeds the maximum range of short.
*/

class Program5 {

    public static void main(String[] args) {

        short value = Short.MAX_VALUE;

        System.out.println("Before Increment : " + value);

        value++;

        System.out.println("After Increment  : " + value);
    }
}
