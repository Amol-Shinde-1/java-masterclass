/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to demonstrate
Character Wrapper Class methods.

Concept:
---------------------------------------------------------
Character Wrapper Class

Explanation:
---------------------------------------------------------
1. Character class provides utility methods.
2. isLetter(), isDigit(), isUpperCase() etc.

Interview Explanation:
---------------------------------------------------------
"The Character wrapper class provides
many useful methods for character validation."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

class CharacterWrapperClass {

    public static void main(String[] args) {

        char ch = 'A';

        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isUpperCase(ch));
    }
}
