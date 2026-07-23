/*
Question:
Write a Java program to validate a password.

Concept:
Real-world Boolean Example

Explanation:
Checks whether the password length is at least 8 characters.

Interview Explanation:
This demonstrates how boolean values are commonly used
for validation.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class PasswordValidation {

    public static void main(String[] args) {

        String password = "Java@123";

        boolean valid = password.length() >= 8;

        System.out.println("Valid Password = " + valid);
    }
}
