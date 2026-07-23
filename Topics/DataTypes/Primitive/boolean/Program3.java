/*
Question:
Write a Java program to demonstrate logical operators.

Concept:
&&, || and !

Explanation:
Logical operators combine or invert boolean values.

Interview Explanation:
Logical operators are widely used in if statements
and interview coding questions.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class BooleanLogicalOperators {

    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;

        System.out.println("AND : " + (x && y));
        System.out.println("OR  : " + (x || y));
        System.out.println("NOT : " + (!x));
    }
}
