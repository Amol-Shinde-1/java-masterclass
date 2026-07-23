/*
Question:
Write a Java program to check whether a number is even.

Concept:
Boolean Expression

Explanation:
The expression (number % 2 == 0) returns true for even numbers.

Interview Explanation:
This program stores the result of the condition
inside a boolean variable.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class CheckEvenNumber {

    public static void main(String[] args) {

        int number = 18;

        boolean isEven = number % 2 == 0;

        System.out.println(isEven);
    }
}
