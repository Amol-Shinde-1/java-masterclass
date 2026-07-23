/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to convert a String into a double.

Concept:
---------------------------------------------------------
Wrapper Class

Explanation:
---------------------------------------------------------
1. String stores text.
2. Double.parseDouble() converts it into a double.
3. Useful when reading data from files or APIs.

Interview Explanation:
---------------------------------------------------------
"I used Double.parseDouble() because it converts
a numeric String into a double."

Time Complexity:
O(1)

Space Complexity:
O(1)
=========================================================
*/

class DoubleWrapperClass {

    public static void main(String[] args) {

        String value = "456.78";

        double amount = Double.parseDouble(value);

        System.out.println("Amount = " + amount);
    }
}
