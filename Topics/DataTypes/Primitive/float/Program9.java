/*
Question:
Write a Java program to calculate the percentage of five subjects.

Concept:
Real-world application of float.
*/

class PercentageCalculator {

    public static void main(String[] args) {

        float totalMarks = 500f;
        float obtainedMarks = 438f;

        float percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("Percentage = " + percentage + "%");
    }
}
