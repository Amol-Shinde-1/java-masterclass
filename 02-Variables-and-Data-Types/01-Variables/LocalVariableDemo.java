/*
===============================================================================
                           LOCAL VARIABLE
===============================================================================

1. Definition
-------------------------------------------------------------------------------
A Local Variable is a variable declared inside a method, constructor,
or block.

It can only be accessed within that method or block.

-------------------------------------------------------------------------------
2. Why Do We Need It?
-------------------------------------------------------------------------------
Local variables store temporary data that is required only while
executing a particular method.

Once the method finishes, the variable is destroyed automatically.

-------------------------------------------------------------------------------
3. Syntax
-------------------------------------------------------------------------------

dataType variableName = value;

Example:

int age = 20;

-------------------------------------------------------------------------------
4. Rules
-------------------------------------------------------------------------------

✔ Declared inside a method, constructor, or block.
✔ Accessible only within that method or block.
✔ Must be initialized before use.
✔ No default value is assigned.
✔ Created when the method starts.
✔ Destroyed when the method ends.

-------------------------------------------------------------------------------
5. Real-Time Example (IT Company)
-------------------------------------------------------------------------------

Online Banking Application

When a customer transfers money:

double transferAmount = 5000.00;

The transfer amount is required only while processing that transaction.

After the transaction completes, the variable is no longer needed.

-------------------------------------------------------------------------------
6. Daily-Life Example
-------------------------------------------------------------------------------

Imagine writing rough calculations on a piece of paper during an exam.

After the exam, you throw away the paper.

Similarly, a local variable exists only while the method is executing.

-------------------------------------------------------------------------------
7. Internal Working (JVM Memory)
-------------------------------------------------------------------------------

Local variables are stored in the Stack Memory.

Method Starts
        │
        ▼
+------------------------+
| int age = 20;          |
| String name = "Amol";  |
+------------------------+

Method Ends
        │
        ▼
Stack Memory is released automatically.

This makes local variables fast and memory-efficient.

-------------------------------------------------------------------------------
8. Java Program
-------------------------------------------------------------------------------
*/

public class LocalVariableDemo {

    public static void main(String[] args) {

        String studentName = "Amol";
        int studentAge = 20;
        double studentPercentage = 87.50;

        System.out.println("Student Information");
        System.out.println("-------------------------");
        System.out.println("Name       : " + studentName);
        System.out.println("Age        : " + studentAge);
        System.out.println("Percentage : " + studentPercentage);

    }
}

/*
===============================================================================

Expected Output

Student Information
-------------------------
Name       : Amol
Age        : 20
Percentage : 87.5

===============================================================================

9. Line-by-Line Explanation
-------------------------------------------------------------------------------

String studentName = "Amol";
→ Creates a local variable to store the student's name.

int studentAge = 20;
→ Creates a local variable to store the student's age.

double studentPercentage = 87.50;
→ Creates a local variable to store the student's percentage.

All three variables exist only inside the main() method.

===============================================================================

10. Common Mistakes
-------------------------------------------------------------------------------

❌ Using a local variable before initialization.

int age;
System.out.println(age);

Compile-Time Error

❌ Trying to access a local variable outside the method.

===============================================================================

11. Best Practices
-------------------------------------------------------------------------------

✔ Keep local variables inside the smallest required scope.
✔ Use meaningful names.
✔ Initialize variables before using them.
✔ Avoid unnecessary local variables.

===============================================================================

12. Interview Questions
-------------------------------------------------------------------------------

Beginner

Q1. What is a local variable?

Q2. Where is a local variable declared?

Intermediate

Q3. Does Java assign a default value to local variables?

Q4. Where are local variables stored?

Advanced

Q5. Why are local variables stored in Stack Memory?

Q6. What happens to local variables after method execution?

===============================================================================

13. Practice Questions
-------------------------------------------------------------------------------

Easy
1. Store employee details using local variables.

Medium
2. Create a method that stores product details using local variables.

Hard
3. Create a Student Result Calculator using only local variables.

===============================================================================

14. Summary
-------------------------------------------------------------------------------

✔ Local variables exist only inside a method.
✔ Stored in Stack Memory.
✔ Must be initialized before use.
✔ Automatically destroyed after method execution.

===============================================================================
*/
