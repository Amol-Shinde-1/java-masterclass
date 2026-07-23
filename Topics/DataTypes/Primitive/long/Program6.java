/*
Question:
Write a Java program to demonstrate overflow in the long data type.

Concept:
Overflow.
*/

class LongOverflow {

    public static void main(String[] args) {

        long value = Long.MAX_VALUE;

        System.out.println("Before Increment = " + value);

        value++;

        System.out.println("After Increment = " + value);
    }
}
