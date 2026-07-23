/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to convert an uppercase character
into a lowercase character.

Concept:
---------------------------------------------------------
Character Conversion

Explanation:
---------------------------------------------------------
1. Every uppercase letter has an ASCII/Unicode value.
2. Adding 32 converts uppercase letters to lowercase
   in the English alphabet.
3. The converted character is printed.

Interview Explanation:
---------------------------------------------------------
"I converted the uppercase character into lowercase
using ASCII values. In Unicode, the difference between
uppercase and lowercase English letters is 32."

Time Complexity:
---------------------------------------------------------
O(1)

Space Complexity:
---------------------------------------------------------
O(1)
=========================================================
*/

class UppercaseToLowercase {

    public static void main(String[] args) {

        char ch = 'A';

        char lower = (char)(ch + 32);

        System.out.println("Lowercase = " + lower);
    }
}
