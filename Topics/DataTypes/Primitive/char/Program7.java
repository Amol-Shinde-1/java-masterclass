/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to check whether a character
is a digit.

Concept:
---------------------------------------------------------
Character Validation

Explanation:
---------------------------------------------------------
1. Digits are stored between '0' and '9'.
2. Compare the character with this range.

Interview Explanation:
---------------------------------------------------------
"This program checks whether the entered
character belongs to the digit range."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

class CheckDigit {

    public static void main(String[] args) {

        char ch = '8';

        if(ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Not a Digit");
    }
}
