/*
Question:
Write a Java program to demonstrate widening type casting from long to double.

Concept:
Implicit Type Casting.
*/

class LongToDoubleCasting {

    public static void main(String[] args) {

        long salary = 750000L;

        double newSalary = salary;

        System.out.println("Long Value = " + salary);
        System.out.println("Double Value = " + newSalary);
    }
}
