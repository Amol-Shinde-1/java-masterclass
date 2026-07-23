/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to calculate Simple Interest.

Concept:
---------------------------------------------------------
Formula Implementation

Explanation:
---------------------------------------------------------
Formula:
SI = (P × R × T) / 100

Interview Explanation:
---------------------------------------------------------
"This program calculates Simple Interest using
the standard mathematical formula."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

class SimpleInterestCalculator {

    public static void main(String[] args) {

        double principal = 50000;
        double rate = 7.5;
        double time = 3;

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }
}
