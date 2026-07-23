/*
Question:
Write a Java program to reverse a given integer.

Concept:
Reverse Number.
*/

class Program7 {

    public static void main(String[] args) {

        int number = 12345;
        int reverse = 0;

        while (number != 0) {

            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reverse = " + reverse);
    }
}
