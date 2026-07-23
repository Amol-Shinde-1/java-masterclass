/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to convert Celsius into Fahrenheit.

Concept:
---------------------------------------------------------
Formula Implementation

Explanation:
---------------------------------------------------------
Formula:
F = (C × 9 / 5) + 32

Interview Explanation:
---------------------------------------------------------
"This program converts temperature from Celsius
to Fahrenheit using the standard formula."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

class TemperatureConverter {

    public static void main(String[] args) {

        double celsius = 37.5;

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Fahrenheit = " + fahrenheit);
    }
}
