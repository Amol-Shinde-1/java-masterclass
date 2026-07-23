/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to convert an int value into a double.

Concept:
---------------------------------------------------------
Widening Type Casting

Explanation:
---------------------------------------------------------
1. int is automatically converted to double.
2. No explicit casting is required.
3. No data is lost.

Interview Explanation:
---------------------------------------------------------
"This program demonstrates implicit type casting.
Java automatically converts int to double because
double has a larger range."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

class IntToDoubleCasting {

    public static void main(String[] args) {

        int marks = 95;

        double result = marks;

        System.out.println("Int Value    : " + marks);
        System.out.println("Double Value : " + result);
    }
}
