/*
Question:
Write a Java program to demonstrate widening type casting from float to double.

Concept:
Implicit Type Casting.
*/

class FloatToDoubleCasting {

    public static void main(String[] args) {

        float salary = 45678.50f;

        double value = salary;

        System.out.println("Float = " + salary);
        System.out.println("Double = " + value);
    }
}
