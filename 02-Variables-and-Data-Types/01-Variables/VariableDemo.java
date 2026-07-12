/*
===========================================================
                 JAVA - VARIABLES
===========================================================

Topic:
Variables

Definition:
A variable is a named memory location used to store data.

Syntax:
dataType variableName = value;

Example:
int age = 20;

Real World Example:
A Student has:
- Name
- Age
- Percentage

These values are stored in variables.

Interview Questions:

Q1. What is a variable?
Ans:
A variable is a named memory location used to store data.

Q2. Why do we use variables?
Ans:
To store, update and reuse data.

Q3. Can a variable value change?
Ans:
Yes. Unless it is declared using final.

===========================================================
*/

public class VariableDemo {

    public static void main(String[] args) {

        String name = "Amol";
        int age = 20;
        double percentage = 87.50;

        System.out.println("Student Information");
        System.out.println("-------------------");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage);

    }

}

/*
===========================================================

Expected Output

Student Information
-------------------
Name       : Amol
Age        : 20
Percentage : 87.5

===========================================================

Practice Questions

1. Store your name.
2. Store your age.
3. Store your college name.
4. Store your course.
5. Print all information.

===========================================================
*/
