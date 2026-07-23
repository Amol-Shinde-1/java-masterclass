/*
Question:
Write a Java program to toggle a boolean value.

Concept:
Boolean Toggle

Explanation:
The ! operator reverses the boolean value.

Interview Explanation:
This technique is useful in games, applications,
and state management.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class BooleanToggle {

    public static void main(String[] args) {

        boolean lightOn = false;

        System.out.println("Before Toggle = " + lightOn);

        lightOn = !lightOn;

        System.out.println("After Toggle = " + lightOn);
    }
}
