/*
Question:
Write a Java program to convert a String into boolean.

Concept:
Boolean Wrapper Class

Explanation:
Boolean.parseBoolean() converts text into a boolean value.

Interview Explanation:
If the string is "true" (ignoring case), it returns true.
Otherwise, it returns false.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class BooleanWrapperClass {

    public static void main(String[] args) {

        String input = "true";

        boolean result = Boolean.parseBoolean(input);

        System.out.println(result);
    }
}
