/*
Question:
Write a Java program to demonstrate widening type casting from int to long.

Concept:
Implicit Type Casting.
*/

class Program3 {

    public static void main(String[] args) {

        int salary = 50000;

        long annualSalary = salary;

        System.out.println("Int Value = " + salary);
        System.out.println("Long Value = " + annualSalary);
    }
}
