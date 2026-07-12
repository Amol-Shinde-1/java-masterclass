/*
===============================================================================
                            DECLARATION OF VARIABLES
===============================================================================

TOPIC:
Variable Declaration

Definition:
Variable declaration is the process of creating a variable by specifying
its data type and name.

Syntax:
dataType variableName;

Example:
int age;

Key Points:
✔ Declaration creates a variable.
✔ Memory is reserved for the variable.
✔ No value is assigned during declaration.
✔ A local variable cannot be used until it is initialized.

Real-World Example:
Before filling water into a bottle, you first need an empty bottle.
Similarly, before storing data, Java needs a declared variable.

Interview Questions:

Q1. What is variable declaration?

Answer:
Variable declaration is the process of creating a variable by specifying
its data type and variable name.

Q2. Does declaration assign a value?

Answer:
No. It only creates the variable.

Q3. Why must a local variable be initialized before use?

Answer:
Because Java does not assign a default value to local variables.
Using one before initialization causes a compile-time error.

===============================================================================
*/

public class DeclarationDemo {

    public static void main(String[] args) {

        // Declaration
        int age;
        double salary;
        char grade;
        boolean isPassed;

        // Initialization
        age = 20;
        salary = 45000.75;
        grade = 'A';
        isPassed = true;

        System.out.println("Age       : " + age);
        System.out.println("Salary    : " + salary);
        System.out.println("Grade     : " + grade);
        System.out.println("Passed    : " + isPassed);
    }
}

/*
===============================================================================

Expected Output

Age       : 20
Salary    : 45000.75
Grade     : A
Passed    : true

===============================================================================

Practice Questions

1. Declare variables for:
   - name
   - city
   - mobile number

2. Initialize them and print the values.

3. What happens if you use a local variable before initialization?

4. Explain the difference between declaration and initialization.

===============================================================================
*/
