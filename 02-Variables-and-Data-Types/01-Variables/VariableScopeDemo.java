/*
===============================================================================
                            VARIABLE SCOPE
===============================================================================

1. Definition
-------------------------------------------------------------------------------
Variable Scope defines where a variable can be accessed in a Java program.

In simple words,
Scope decides the visibility and lifetime of a variable.

If a variable is outside its scope, Java will generate a compile-time error.

-------------------------------------------------------------------------------
2. Why Do We Need It?
-------------------------------------------------------------------------------
Scope helps us:

✔ Protect variables from unwanted access.
✔ Improve code readability.
✔ Reduce memory usage.
✔ Avoid variable name conflicts.
✔ Write secure and maintainable applications.

-------------------------------------------------------------------------------
3. Types of Variable Scope
-------------------------------------------------------------------------------

1. Local Scope
2. Instance Scope
3. Static Scope
4. Block Scope

-------------------------------------------------------------------------------
4. Rules
-------------------------------------------------------------------------------

✔ Local variables are accessible only inside their method.
✔ Block variables are accessible only inside that block.
✔ Instance variables are accessible through objects.
✔ Static variables are accessible using the class name.
✔ Variables cannot be accessed outside their scope.

-------------------------------------------------------------------------------
5. Real-Time Example (IT Company)
-------------------------------------------------------------------------------

Online Banking System

Inside the login() method:

String otp = "458912";

The OTP is required only while the customer logs in.

Once login() finishes,
the OTP variable is destroyed automatically.

This improves security.

-------------------------------------------------------------------------------
6. Daily-Life Example
-------------------------------------------------------------------------------

Imagine an office.

The Manager's cabin can only be accessed by the Manager.

Employees cannot directly enter it.

Similarly,
variables can only be accessed within their own scope.

-------------------------------------------------------------------------------
7. Internal Working (JVM Memory)
-------------------------------------------------------------------------------

main()

Stack Memory

+-----------------------------+
| age = 20                    |
| name = "Amol"               |
+-----------------------------+

When main() finishes,

Stack Memory is released.

Instance variables remain inside Heap Memory
until the object is destroyed.

-------------------------------------------------------------------------------
8. Java Program
-------------------------------------------------------------------------------
*/

public class VariableScopeDemo {

    static String college = "SPPU";      // Static Variable

    String course = "B.Sc Computer Science"; // Instance Variable

    public static void main(String[] args) {

        int age = 20;                    // Local Variable

        VariableScopeDemo student = new VariableScopeDemo();

        System.out.println("Variable Scope Demo");
        System.out.println("----------------------------");
        System.out.println("Age      : " + age);
        System.out.println("College  : " + college);
        System.out.println("Course   : " + student.course);

        {
            String city = "Pune";

            System.out.println("City     : " + city);
        }

        // System.out.println(city);
        // Compile-Time Error because city is outside its block.

    }
}

/*
===============================================================================

Expected Output

Variable Scope Demo
----------------------------
Age      : 20
College  : SPPU
Course   : B.Sc Computer Science
City     : Pune

===============================================================================

9. Line-by-Line Code Explanation
-------------------------------------------------------------------------------

age
→ Local Variable

college
→ Static Variable

course
→ Instance Variable

city
→ Block Variable

Each variable has its own scope.

===============================================================================

10. Common Mistakes
-------------------------------------------------------------------------------

❌ Accessing local variables outside methods.

❌ Accessing block variables outside blocks.

❌ Confusing instance variables with static variables.

===============================================================================

11. Best Practices
-------------------------------------------------------------------------------

✔ Keep variable scope as small as possible.

✔ Declare variables only where needed.

✔ Use meaningful variable names.

✔ Avoid unnecessary global variables.

===============================================================================

12. Interview Questions
-------------------------------------------------------------------------------

Beginner

Q1. What is variable scope?

Q2. What is a block scope?

Intermediate

Q3. Why can't local variables be accessed outside methods?

Q4. What is the scope of an instance variable?

Advanced

Q5. Explain local, instance and static scope with examples.

Q6. Why is variable scope important in software development?

===============================================================================

13. Practice Questions
-------------------------------------------------------------------------------

Easy

1. Create one local variable and print it.

Medium

2. Create one instance variable and one static variable.

Hard

3. Write a program demonstrating all four variable scopes.

===============================================================================

14. Summary
-------------------------------------------------------------------------------

✔ Scope controls where a variable can be used.
✔ Local variables exist inside methods.
✔ Block variables exist inside blocks.
✔ Instance variables belong to objects.
✔ Static variables belong to the class.
✔ Proper scope improves code quality and memory management.

===============================================================================
*/
