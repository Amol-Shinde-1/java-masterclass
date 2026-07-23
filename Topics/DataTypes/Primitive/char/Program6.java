/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to check whether a character
is an alphabet.

Concept:
---------------------------------------------------------
Decision Making

Explanation:
---------------------------------------------------------
1. Check whether the character lies between
   A-Z or a-z.
2. If yes, it is an alphabet.

Interview Explanation:
---------------------------------------------------------
"This program checks the ASCII/Unicode range
of English alphabet characters."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

class CheckAlphabet {

    public static void main(String[] args) {

        char ch = 'G';

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println("Alphabet");
        else
            System.out.println("Not an Alphabet");
    }
}
