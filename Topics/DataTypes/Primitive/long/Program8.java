/*
Question:
Write a Java program to convert a String into long using the Long wrapper class.

Concept:
Long.parseLong().
*/

class LongWrapperClass {

    public static void main(String[] args) {

        String number = "123456789";

        long value = Long.parseLong(number);

        System.out.println("Long Value = " + value);
    }
}
