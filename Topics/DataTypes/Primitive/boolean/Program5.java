/*
Question:
Write a Java program to check voting eligibility.

Concept:
Decision Making

Explanation:
A person can vote if age is 18 or above.

Interview Explanation:
This program uses a boolean expression for eligibility checking.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class VotingEligibility {

    public static void main(String[] args) {

        int age = 21;

        boolean eligible = age >= 18;

        System.out.println("Eligible = " + eligible);
    }
}
