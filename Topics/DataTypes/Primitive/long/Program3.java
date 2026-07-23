/*
Question:
Write a Java program to demonstrate the use of the 'L' suffix in long literals.

Concept:
Long literals require 'L' when the value exceeds the int range.
*/

class LongLiteralExample {

    public static void main(String[] args) {

        long mobileNumber = 9876543210L;

        System.out.println("Mobile Number = " + mobileNumber);

        // long num = 9876543210;
        // Compile-Time Error: integer number too large
    }
}
