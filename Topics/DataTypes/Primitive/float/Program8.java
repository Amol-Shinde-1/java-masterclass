/*
Question:
Write a Java program to convert a String into float using the Float wrapper class.

Concept:
Float.parseFloat().
*/

class FloatWrapperClass {

    public static void main(String[] args) {

        String value = "98.75";

        float marks = Float.parseFloat(value);

        System.out.println("Marks = " + marks);
    }
}
