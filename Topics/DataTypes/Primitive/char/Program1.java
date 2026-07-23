/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to declare a char variable and print its value.

Concept:
---------------------------------------------------------
Declaration and Initialization of char.

Explanation:
---------------------------------------------------------
1. This program declares a character variable.
2. A char stores exactly one Unicode character.
3. The value is printed using System.out.println().

Interview Explanation:
---------------------------------------------------------
"I used the char data type because it stores a
single Unicode character. In Java, char occupies
2 bytes of memory."

Time Complexity:
---------------------------------------------------------
O(1)

Space Complexity:
---------------------------------------------------------
O(1)
=========================================================
*/

class DeclareCharacter {

    public static void main(String[] args) {

        char grade = 'A';

        System.out.println("Grade = " + grade);
    }
}
