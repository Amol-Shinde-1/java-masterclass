/*
===============================================================================
                          VARIABLE INITIALIZATION
===============================================================================

TOPIC:
Variable Initialization

Definition:
Variable initialization is the process of assigning a value to a variable
after or during its declaration.

Syntax:

int age = 20;

or

int age;
age = 20;

Key Points:

✔ Initialization stores data into the variable.
✔ A local variable must be initialized before use.
✔ A variable can be initialized during declaration or later.
✔ Initialization can happen only once initially, but the value can later
  be changed (reinitialization).

Real World Example:

Imagine an empty water bottle.

Declaration:
You bought the bottle.

Initialization:
You filled it with water.

Interview Questions

Q1. What is variable initialization?

Answer:
Variable initialization is the process of assigning a value to a variable.

Q2. Can we initialize a variable later?

Answer:
Yes.

Example:

int age;
age = 20;

Q3. Can we initialize a variable while declaring it?

Answer:
Yes.

Example:

int age = 20;

===============================================================================
*/

public class InitializationDemo {

    public static void main(String[] args) {

        // Declaration + Initialization
        String name = "Amol";

        // Declaration
        int age;

        // Initialization
        age = 20;

        double percentage = 87.50;

        System.out.println("Student Details");
        System.out.println("-------------------------");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Percentage  : " + percentage);

    }
}

/*
===============================================================================

Expected Output

Student Details
-------------------------
Name        : Amol
Age         : 20
Percentage  : 87.5

===============================================================================

Practice Questions

1. Initialize a variable named salary.
2. Initialize a variable named city.
3. Initialize your mobile number.
4. Print all values.

===============================================================================
*/
