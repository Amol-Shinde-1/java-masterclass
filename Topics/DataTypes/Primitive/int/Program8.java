/*
Question:
Write a Java program to check whether a number is palindrome.

Concept:
Palindrome Number.
*/

class Program8 {

    public static void main(String[] args) {

        int number = 121;
        int original = number;
        int reverse = 0;

        while (number != 0) {

            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
