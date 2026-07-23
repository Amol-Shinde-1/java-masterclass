/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to accept a double value from the user.

Concept:
---------------------------------------------------------
Scanner Class

Explanation:
---------------------------------------------------------
1. Reads a decimal value from the keyboard.
2. Stores it in a double variable.
3. Displays the entered value.

Interview Explanation:
---------------------------------------------------------
"This program demonstrates user input using
Scanner.nextDouble()."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

import java.util.Scanner;

class DoubleUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary : ");

        double salary = sc.nextDouble();

        System.out.println("Salary = " + salary);

        sc.close();
    }
}
