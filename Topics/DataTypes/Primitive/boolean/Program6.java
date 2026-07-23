/*
Question:
Write a Java program to accept a boolean value from the user.

Concept:
Scanner

Explanation:
Scanner.nextBoolean() reads true or false.

Interview Explanation:
Useful for reading yes/no style input.

Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.Scanner;

class BooleanUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter true or false: ");

        boolean value = sc.nextBoolean();

        System.out.println("You entered: " + value);

        sc.close();
    }
}
