/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to convert a lowercase character
into an uppercase character.

Concept:
---------------------------------------------------------
Character Conversion

Explanation:
---------------------------------------------------------
1. Subtracting 32 converts lowercase letters into
   uppercase letters.
2. This works for English alphabet characters.

Interview Explanation:
---------------------------------------------------------
"I converted lowercase to uppercase using ASCII values.
The difference between lowercase and uppercase letters
is 32."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

class LowercaseToUppercase {

    public static void main(String[] args) {

        char ch = 'z';

        char upper = (char)(ch - 32);

        System.out.println("Uppercase = " + upper);
    }
}
