/*
===============================================================================
                            FINAL VARIABLE
===============================================================================

1. Definition
-------------------------------------------------------------------------------
A final variable is a variable declared using the 'final' keyword.

Once a value is assigned to a final variable, it cannot be changed.

-------------------------------------------------------------------------------
2. Why Do We Need It?
-------------------------------------------------------------------------------
Some values should never change during program execution.

Examples:
• PI = 3.14159
• Country Name
• Company Registration Number
• Aadhaar Number (for a person)
• Employee ID

The final keyword protects such values.

-------------------------------------------------------------------------------
3. Syntax
-------------------------------------------------------------------------------

final dataType variableName = value;

Example:

final double PI = 3.14159;

-------------------------------------------------------------------------------
4. Rules
-------------------------------------------------------------------------------

✔ Declared using the final keyword.
✔ Value can be assigned only once.
✔ Cannot be re-initialized.
✔ Usually written in UPPER_CASE if it is a constant.

-------------------------------------------------------------------------------
5. Real-Time Example (IT Company)
-------------------------------------------------------------------------------

A banking application stores the bank name.

final String BANK_NAME = "State Bank of India";

The bank name should remain the same throughout the program.

-------------------------------------------------------------------------------
6. Daily-Life Example
-------------------------------------------------------------------------------

Think of your Date of Birth.

Once recorded, it never changes.

Similarly, a final variable stores a value that should remain constant.

-------------------------------------------------------------------------------
7. Internal Working
-------------------------------------------------------------------------------

final double PI = 3.14159;

Memory

+----------------------+
| PI = 3.14159         |
+----------------------+

Trying to change it:

PI = 3.14;

Compile-Time Error

-------------------------------------------------------------------------------
8. Java Program
-------------------------------------------------------------------------------
*/

public class FinalVariableDemo {

    public static void main(String[] args) {

        final double PI = 3.14159;
        final String COUNTRY = "India";

        System.out.println("PI Value      : " + PI);
        System.out.println("Country Name  : " + COUNTRY);

        // PI = 3.14; // Compile-Time Error
    }
}

/*
===============================================================================

Expected Output

PI Value      : 3.14159
Country Name  : India

===============================================================================

9. Line-by-Line Code Explanation
-------------------------------------------------------------------------------

final double PI = 3.14159;

→ PI is declared as final.
→ Its value cannot be changed later.

final String COUNTRY = "India";

→ COUNTRY is also constant.

===============================================================================

10. Common Mistakes
-------------------------------------------------------------------------------

❌ Trying to modify a final variable.

final int age = 20;
age = 21;

Compile-Time Error

===============================================================================

11. Best Practices
-------------------------------------------------------------------------------

✔ Use final for constant values.

✔ Write constants in UPPER_CASE.

✔ Do not use final unless the value should never change.

===============================================================================

12. Interview Questions
-------------------------------------------------------------------------------

Beginner

Q1. What is a final variable?

Q2. Can we change a final variable?

Intermediate

Q3. Why do we use final variables?

Advanced

Q4. Difference between final, finally and finalize()?

Q5. Can a final variable be initialized later?

===============================================================================

13. Practice Questions
-------------------------------------------------------------------------------

Easy
1. Create a final variable for your college name.

Medium
2. Store GST percentage using a final variable.

Hard
3. Create a program using multiple final constants.

===============================================================================

14. Summary
-------------------------------------------------------------------------------

✔ final variables cannot be modified.
✔ Used for constants.
✔ Improves code safety.
✔ Helps prevent accidental changes.

===============================================================================
*/
