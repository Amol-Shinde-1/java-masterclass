/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to calculate the average of five numbers.

Concept:
---------------------------------------------------------
Average Calculation

Explanation:
---------------------------------------------------------
1. Add all numbers.
2. Divide the sum by total numbers.
3. Store the result in a double.

Interview Explanation:
---------------------------------------------------------
"This program calculates the average using
double to maintain decimal precision."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

class AverageCalculator {

    public static void main(String[] args) {

        double a = 85;
        double b = 92;
        double c = 78;
        double d = 88;
        double e = 95;

        double average = (a + b + c + d + e) / 5;

        System.out.println("Average = " + average);
    }
}
