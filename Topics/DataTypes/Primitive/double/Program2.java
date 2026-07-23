/*
Question:
Write a Java program to print the minimum and maximum values of the double data type.

Concept:
Double.MIN_VALUE and Double.MAX_VALUE.

Explanation:
This program uses predefined constants from the Double wrapper class.
These constants represent the smallest positive and largest finite values
that can be stored in a double variable.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class DoubleMinMax {

    public static void main(String[] args) {

        System.out.println("Minimum Value = " + Double.MIN_VALUE);
        System.out.println("Maximum Value = " + Double.MAX_VALUE);
    }
}
