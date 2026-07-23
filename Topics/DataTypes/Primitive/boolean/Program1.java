/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to declare a boolean variable and print its value.

Concept:
---------------------------------------------------------
Declaration and Initialization of boolean.

Explanation:
---------------------------------------------------------
1. A boolean variable stores only true or false.
2. It is commonly used in conditions and decision-making.
3. The value is printed using System.out.println().

Interview Explanation:
---------------------------------------------------------
"In this program, I declared a boolean variable and
stored the value true. The boolean data type is mainly
used for conditional checks."

Time Complexity:
---------------------------------------------------------
O(1)

Space Complexity:
---------------------------------------------------------
O(1)
=========================================================
*/

class DeclareBoolean {

    public static void main(String[] args) {

        boolean isJavaEasy = true;

        System.out.println("Is Java Easy? " + isJavaEasy);
    }
}
