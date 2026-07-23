/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to check whether
a character is a vowel.

Concept:
---------------------------------------------------------
Decision Making

Explanation:
---------------------------------------------------------
1. Compare the character with all vowels.
2. If matched, print Vowel.

Interview Explanation:
---------------------------------------------------------
"This program uses logical OR to compare
the entered character with vowels."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

class CheckVowel {

    public static void main(String[] args) {

        char ch = 'e';

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
           ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
