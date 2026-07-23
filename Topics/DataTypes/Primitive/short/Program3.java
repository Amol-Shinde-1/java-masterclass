/*
Question:
Write a Java program to demonstrate widening type casting from short to int.

Concept:
Implicit Type Casting (Widening).
*/

class Program3 {

    public static void main(String[] args) {

        short marks = 95;

        int totalMarks = marks;

        System.out.println("Short Value : " + marks);
        System.out.println("Int Value   : " + totalMarks);
    }
}
