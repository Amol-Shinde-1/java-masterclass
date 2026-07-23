/*
=========================================================
Question:
---------------------------------------------------------
Write a Java program to convert a double value into an int.

Concept:
---------------------------------------------------------
Narrowing Type Casting

Explanation:
---------------------------------------------------------
1. This program stores a decimal number in a double variable.
2. It converts the double value into an int using explicit casting.
3. The decimal part is removed during conversion.

Interview Explanation:
---------------------------------------------------------
"In this program, I used explicit type casting because
double is larger than int. During narrowing conversion,
the decimal part is discarded."

Time Complexity:
---------------------------------------------------------
O(1)

Space Complexity:
---------------------------------------------------------
O(1)
=========================================================
*/

class DoubleToIntCasting {

    public static void main(String[] args) {

        double price = 199.99;

        int amount = (int) price;

        System.out.println("Original Value  : " + price);
        System.out.println("Converted Value : " + amount);
    }
}
