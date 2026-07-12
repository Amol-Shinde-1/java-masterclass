/*
===============================================================================
                           VARIABLE RE-INITIALIZATION
===============================================================================

1. Definition
-------------------------------------------------------------------------------
Re-initialization means assigning a NEW value to an already initialized
variable.

A variable can store only one value at a time.
When a new value is assigned, the old value is replaced.

-------------------------------------------------------------------------------
2. Why Do We Need It?
-------------------------------------------------------------------------------
In real applications, data changes frequently.

Examples:
• Employee salary gets updated.
• Student marks change after revaluation.
• Bank account balance changes after every transaction.
• Product price changes during a sale.

Re-initialization allows us to update the latest value.

-------------------------------------------------------------------------------
3. Syntax
-------------------------------------------------------------------------------

dataType variableName = value;

variableName = newValue;

Example:

int age = 20;
age = 21;

-------------------------------------------------------------------------------
4. Rules
-------------------------------------------------------------------------------

✔ Variable must be declared first.
✔ Variable must be initialized before re-initialization.
✔ New value must be compatible with the variable's data type.
✔ Old value is overwritten.
✔ final variables cannot be re-initialized.

-------------------------------------------------------------------------------
5. Real-Time Example (IT Company)
-------------------------------------------------------------------------------

Employee Management System

String employeeName = "Amol";
double salary = 35000;

After promotion,

salary = 45000;

The old salary is replaced by the new salary.

-------------------------------------------------------------------------------
6. Daily-Life Example
-------------------------------------------------------------------------------

Suppose your mobile lock PIN is:

1234

Later you change it to:

5678

The old PIN is replaced.

Similarly, re-initialization replaces the old value with a new one.

-------------------------------------------------------------------------------
7. Internal Working
-------------------------------------------------------------------------------

Step 1:
Java creates memory for the variable.

salary = 35000

Memory
+-----------+
| 35000     |
+-----------+

Step 2:

salary = 45000

Memory
+-----------+
| 45000     |
+-----------+

The previous value is overwritten.

===============================================================================
*/

public class ReInitializationDemo {

    public static void main(String[] args) {

        String employeeName = "Amol";
        double salary = 35000.00;

        System.out.println("Before Promotion");
        System.out.println("----------------");
        System.out.println("Employee : " + employeeName);
        System.out.println("Salary   : " + salary);

        // Re-initialization
        salary = 45000.00;

        System.out.println();

        System.out.println("After Promotion");
        System.out.println("----------------");
        System.out.println("Employee : " + employeeName);
        System.out.println("Salary   : " + salary);

    }
}

/*
===============================================================================

Expected Output

Before Promotion
----------------
Employee : Amol
Salary   : 35000.0

After Promotion
---------------
Employee : Amol
Salary   : 45000.0

===============================================================================

10. Common Mistakes
-------------------------------------------------------------------------------

❌ Using a variable before initialization.

❌ Assigning incompatible data.

int age = 20;
age = "Twenty";

❌ Trying to change a final variable.

===============================================================================

11. Best Practices
-------------------------------------------------------------------------------

✔ Use meaningful variable names.

✔ Re-initialize variables only when necessary.

✔ Keep variable scope as small as possible.

===============================================================================

12. Interview Questions
-------------------------------------------------------------------------------

Beginner

Q1. What is re-initialization?

Q2. Can a variable be assigned a new value?

Intermediate

Q3. What happens to the old value after re-initialization?

Q4. Can local variables be re-initialized?

Advanced

Q5. Can a final variable be re-initialized? Why?

===============================================================================

13. Practice Questions
-------------------------------------------------------------------------------

Easy
1. Change your age from 20 to 21.

Medium
2. Update a student's marks after rechecking.

Hard
3. Create an employee salary program where the salary is updated three times.

===============================================================================

14. Summary
-------------------------------------------------------------------------------

✔ Re-initialization updates an existing variable.
✔ The previous value is replaced.
✔ Used in almost every real-world Java application.
✔ final variables cannot be re-initialized.

===============================================================================
*/
