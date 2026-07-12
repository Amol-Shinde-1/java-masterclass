/*
===============================================================================
                           VARIABLE NAMING RULES
===============================================================================

1. Definition
-------------------------------------------------------------------------------
Variable naming rules define how variables should be named in Java.

A good variable name makes code readable, maintainable, and professional.

-------------------------------------------------------------------------------
2. Why Do We Need It?
-------------------------------------------------------------------------------
Imagine a project with thousands of Java files.

If variables are named properly:
✔ Easy to understand
✔ Easy to maintain
✔ Easy to debug
✔ Better teamwork

Poor variable names make projects difficult to understand.

-------------------------------------------------------------------------------
3. Syntax
-------------------------------------------------------------------------------

dataType variableName = value;

Example:

int age = 20;

-------------------------------------------------------------------------------
4. Java Naming Rules
-------------------------------------------------------------------------------

✔ Variable names can contain:
   - Letters (A-Z, a-z)
   - Digits (0-9)
   - Underscore (_)
   - Dollar sign ($)

✔ Variable name must start with:
   - Letter
   - _
   - $

✔ Variable name cannot start with a number.

❌ 1age

✔ Variable names are case-sensitive.

age
Age
AGE

These are three different variables.

✔ Spaces are not allowed.

❌ student name

✔ Java keywords cannot be used.

❌ int class = 10;

-------------------------------------------------------------------------------
5. Java Naming Conventions (Industry Standard)
-------------------------------------------------------------------------------

Use camelCase.

Examples

studentName
employeeSalary
mobileNumber
totalMarks

Good

int studentAge;

Bad

int a;
int x;
int abc123;

-------------------------------------------------------------------------------
6. Real-Time Example (IT Company)
-------------------------------------------------------------------------------

Employee Management System

String employeeName;
double employeeSalary;
String departmentName;
long mobileNumber;

These names clearly describe the stored data.

-------------------------------------------------------------------------------
7. Daily-Life Example
-------------------------------------------------------------------------------

Imagine you have labels on storage boxes.

Good Labels

Books
Clothes
Documents

Bad Labels

Box1
ABC
XYZ

Clear labels help you quickly find items.

Similarly, meaningful variable names help developers understand code.

-------------------------------------------------------------------------------
8. Internal Working
-------------------------------------------------------------------------------

Variable names are used only by programmers.

During compilation, Java stores variable information and generates bytecode.

The JVM works with memory locations, while variable names improve readability.

===============================================================================
*/

public class NamingRulesDemo {

    public static void main(String[] args) {

        String studentName = "Amol";
        int studentAge = 20;
        double studentPercentage = 87.50;
        String collegeName = "SPPU";

        System.out.println("Student Information");
        System.out.println("--------------------------");
        System.out.println("Name        : " + studentName);
        System.out.println("Age         : " + studentAge);
        System.out.println("Percentage  : " + studentPercentage);
        System.out.println("College     : " + collegeName);

    }
}

/*
===============================================================================

Expected Output

Student Information
--------------------------
Name        : Amol
Age         : 20
Percentage  : 87.5
College     : SPPU

===============================================================================

9. Common Mistakes
-------------------------------------------------------------------------------

❌ int 1age = 20;

❌ int student age = 20;

❌ int class = 10;

❌ Using meaningless names:

int a;
int x;

===============================================================================

10. Best Practices
-------------------------------------------------------------------------------

✔ Use camelCase.
✔ Use meaningful names.
✔ Avoid single-letter variable names.
✔ Keep names short but descriptive.
✔ Follow Java naming conventions.

===============================================================================

11. Interview Questions
-------------------------------------------------------------------------------

Beginner

Q1. What are the rules for naming variables?

Q2. Can a variable start with a number?

Q3. Are Java variable names case-sensitive?

Intermediate

Q4. Why is camelCase used in Java?

Advanced

Q5. What is the difference between naming rules and naming conventions?

===============================================================================

12. Practice Questions
-------------------------------------------------------------------------------

Easy
1. Create variables for employee name, salary, and department.

Medium
2. Create variables for a bank account.

Hard
3. Design variables for an online shopping application using proper naming conventions.

===============================================================================

13. Summary
-------------------------------------------------------------------------------

✔ Variable names must follow Java rules.
✔ Use meaningful names.
✔ Follow camelCase naming convention.
✔ Good naming improves code quality and maintainability.

===============================================================================
*/
