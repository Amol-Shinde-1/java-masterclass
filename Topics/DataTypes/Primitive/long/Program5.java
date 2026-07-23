/*
Question:
Write a Java program to convert a double value into long using explicit type casting.

Concept:
Narrowing Type Casting.
*/

class DoubleToLongCasting {

    public static void main(String[] args) {

        double amount = 98765.98;

        long value = (long) amount;

        System.out.println("Converted Value = " + value);
    }
}
