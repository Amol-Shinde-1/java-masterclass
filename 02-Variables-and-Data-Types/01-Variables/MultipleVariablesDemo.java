/*
===============================================================================
                      MULTIPLE VARIABLE DECLARATION
===============================================================================

1. Definition
-------------------------------------------------------------------------------
Multiple variable declaration means declaring two or more variables of the
same data type in a single statement.

It makes the code shorter and more readable when variables have the same
data type.

-------------------------------------------------------------------------------
2. Why Do We Need It?
-------------------------------------------------------------------------------
Instead of writing:

int english;
int maths;
int science;

We can write:

int english, maths, science;

This reduces repetitive code.

-------------------------------------------------------------------------------
3. Syntax
-------------------------------------------------------------------------------

dataType variable1, variable2, variable3;

Example:

int a, b, c;

-------------------------------------------------------------------------------
4. Rules
-------------------------------------------------------------------------------

✔ All variables must have the same data type.
✔ Variables are separated using commas (,).
✔ Each variable has its own memory location.
✔ Variables can be initialized later or immediately.

-------------------------------------------------------------------------------
5. Real-Time Example (IT Company)
-------------------------------------------------------------------------------

Student Management System

int javaMarks, pythonMarks, dbmsMarks;

These variables store marks of different subjects for a student.

-------------------------------------------------------------------------------
6. Daily-Life Example
-------------------------------------------------------------------------------

Imagine you are buying fruits.

You buy:

5 Apples
10 Bananas
7 Oranges

Instead of writing each separately, you keep all fruit counts together.

Similarly, Java allows multiple variables of the same type in one statement.

-------------------------------------------------------------------------------
7. Internal Working
-------------------------------------------------------------------------------

Declaration:

int javaMarks, pythonMarks, dbmsMarks;

Java allocates separate memory for each variable.

+-----------+
| javaMarks |
+-----------+

+-------------+
| pythonMarks |
+-------------+

+-----------+
| dbmsMarks |
+-----------+

Even though they are declared together, each variable has its own memory.

===============================================================================
*/

public class MultipleVariablesDemo {

    public static void main(String[] args) {

        // Declaration
        int javaMarks, pythonMarks, dbmsMarks;

        // Initialization
        javaMarks = 85;
        pythonMarks = 90;
        dbmsMarks = 88;

        System.out.println("Student Marks");
        System.out.println("---------------------");
        System.out.println("Java     : " + javaMarks);
        System.out.println("Python   : " + pythonMarks);
        System.out.println("DBMS     : " + dbmsMarks);

    }
}

/*
===============================================================================

Expected Output

Student Marks
---------------------
Java     : 85
Python   : 90
DBMS     : 88

===============================================================================

10. Common Mistakes
-------------------------------------------------------------------------------

❌ Declaring different data types together.

Wrong:

int age, double salary;

Correct:

int age;
double salary;

❌ Using variables before initialization.

===============================================================================

11. Best Practices
-------------------------------------------------------------------------------

✔ Declare multiple variables together only if they are closely related.

✔ Use meaningful variable names.

✔ Avoid declaring too many variables in one line.

===============================================================================

12. Interview Questions
-------------------------------------------------------------------------------

Beginner

Q1. What is multiple variable declaration?

Q2. Can multiple variables be declared in one statement?

Intermediate

Q3. Do multiple variables share the same memory location?

Advanced

Q4. Why should we avoid declaring too many variables in one line?

===============================================================================

13. Practice Questions
-------------------------------------------------------------------------------

Easy
1. Declare three integer variables and print them.

Medium
2. Store marks of five subjects using multiple variables.

Hard
3. Store product prices for three different products and calculate the total.

===============================================================================

14. Summary
-------------------------------------------------------------------------------

✔ Multiple variables can be declared in one statement.
✔ All variables must have the same data type.
✔ Each variable has its own memory.
✔ Improves code readability when used properly.

===============================================================================
*/
