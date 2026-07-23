/*
Question:
Write a Java program to check whether a year is a leap year.

Concept:
Interview Logic

Explanation:
A leap year is divisible by 400 or divisible by 4 but not by 100.

Interview Explanation:
This is a common interview problem that combines
logical operators and boolean expressions.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class LeapYearChecker {

    public static void main(String[] args) {

        int year = 2024;

        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        System.out.println("Leap Year = " + leap);
    }
}
