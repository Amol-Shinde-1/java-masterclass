/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to print a character using its Unicode value.

Concept:
---------------------------------------------------------
Unicode Representation

Explanation:
---------------------------------------------------------
1. Characters can be initialized using Unicode escape sequences.
2. Java uses Unicode, not just ASCII.
3. '\u0041' represents 'A'.

Interview Explanation:
---------------------------------------------------------
"This program demonstrates that Java stores characters
using Unicode, allowing support for many languages."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

class CharacterUnicodeValue {

    public static void main(String[] args) {

        char ch = '\u0041';

        System.out.println("Character = " + ch);
    }
}
