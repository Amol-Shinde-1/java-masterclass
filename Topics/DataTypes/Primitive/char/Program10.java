/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to compare two characters.

Concept:
---------------------------------------------------------
Character Comparison

Explanation:
---------------------------------------------------------
1. Characters can be compared using == and relational operators.
2. Comparison is based on Unicode values.

Interview Explanation:
---------------------------------------------------------
"In Java, characters are internally stored as Unicode
values, so comparison is performed numerically."

Time Complexity:
---------------------------------------------------------
O(1)

Space Complexity:
---------------------------------------------------------
O(1)
=========================================================
*/

class CharacterComparison {

    public static void main(String[] args) {

        char ch1 = 'A';
        char ch2 = 'B';

        System.out.println("ch1 == ch2 : " + (ch1 == ch2));
        System.out.println("ch1 < ch2  : " + (ch1 < ch2));
        System.out.println("ch1 > ch2  : " + (ch1 > ch2));
    }
}
