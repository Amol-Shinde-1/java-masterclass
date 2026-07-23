/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to print the ASCII value of a character.

Concept:
---------------------------------------------------------
Type Casting

Explanation:
---------------------------------------------------------
1. Characters are internally stored as numbers.
2. Type casting converts char into int.
3. The integer represents the ASCII/Unicode value.

Interview Explanation:
---------------------------------------------------------
"In Java, every character has a numeric Unicode value.
By casting char to int, we can print that value."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

class CharacterAsciiValue {

    public static void main(String[] args) {

        char ch = 'A';

        System.out.println("ASCII Value = " + (int) ch);
    }
}
