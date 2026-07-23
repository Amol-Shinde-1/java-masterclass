/*
Question:
Write a Java program to convert milliseconds into seconds.

Concept:
Arithmetic Operations using long.
*/

class MillisecondsConverter {

    public static void main(String[] args) {

        long milliseconds = 120000;

        long seconds = milliseconds / 1000;

        System.out.println("Milliseconds = " + milliseconds);
        System.out.println("Seconds = " + seconds);
    }
}
