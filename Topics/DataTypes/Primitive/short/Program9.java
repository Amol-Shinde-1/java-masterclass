/*
Question:
Write a Java program to convert a String into a short using the Short wrapper class.

Concept:
Wrapper Class - Short.parseShort().
*/

class Program9 {

    public static void main(String[] args) {

        String value = "250";

        short number = Short.parseShort(value);

        System.out.println("Short Value : " + number);
    }
}
