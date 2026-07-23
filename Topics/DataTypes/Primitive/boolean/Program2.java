/*
Question:
Write a Java program to compare two numbers using relational operators.

Concept:
Relational Operators

Explanation:
Comparison operators return a boolean value.

Interview Explanation:
Relational operators like >, <, ==, != always produce
true or false.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class BooleanComparison {

    public static void main(String[] args) {

        int a = 20;
        int b = 15;

        boolean result = a > b;

        System.out.println(result);
    }
}
