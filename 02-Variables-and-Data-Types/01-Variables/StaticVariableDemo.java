/*
===============================================================================
                            STATIC VARIABLE
===============================================================================

1. Definition
-------------------------------------------------------------------------------
A Static Variable is a variable declared with the 'static' keyword inside a
class but outside all methods, constructors, and blocks.

A static variable belongs to the class, not to individual objects.

-------------------------------------------------------------------------------
2. Why Do We Need It?
-------------------------------------------------------------------------------
If all objects need to share the same value, using an instance variable
would create unnecessary duplicate copies.

A static variable stores only one shared value.

-------------------------------------------------------------------------------
3. Syntax
-------------------------------------------------------------------------------

class Student {

    static String college = "SPPU";

}

-------------------------------------------------------------------------------
4. Rules
-------------------------------------------------------------------------------

✔ Declared using the static keyword.
✔ Belongs to the class.
✔ Only one copy exists.
✔ Shared by all objects.
✔ Stored in Method Area (Class Area).

-------------------------------------------------------------------------------
5. Real-Time Example (IT Company)
-------------------------------------------------------------------------------

Employee Management System

Company Name = "Infosys"

Thousands of Employee objects exist.

Every employee belongs to the same company.

Instead of storing "Infosys" inside every object,
Java stores it only once using a static variable.

-------------------------------------------------------------------------------
6. Daily-Life Example
-------------------------------------------------------------------------------

Imagine a classroom.

Every student has

• Different Name
• Different Roll Number

But

School Name = ABC Public School

The school name is common for everyone.

Therefore, it should be stored only once.

-------------------------------------------------------------------------------
7. Internal Working (JVM Memory)
-------------------------------------------------------------------------------

                Method Area
        +------------------------+
        | college = "SPPU"       |
        +------------------------+

             Heap Memory

Student s1          Student s2

Name = Amol         Name = Rahul
Age = 20            Age = 21

Both objects use the SAME college variable.

-------------------------------------------------------------------------------
8. Java Program
-------------------------------------------------------------------------------
*/

class Student {

    String name;
    int age;

    static String college = "SPPU";

}

public class StaticVariableDemo {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Amol";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.age = 21;

        System.out.println("Student 1");
        System.out.println("----------------");
        System.out.println("Name    : " + s1.name);
        System.out.println("Age     : " + s1.age);
        System.out.println("College : " + Student.college);

        System.out.println();

        System.out.println("Student 2");
        System.out.println("----------------");
        System.out.println("Name    : " + s2.name);
        System.out.println("Age     : " + s2.age);
        System.out.println("College : " + Student.college);

    }
}

/*
===============================================================================

Expected Output

Student 1
----------------
Name    : Amol
Age     : 20
College : SPPU

Student 2
----------------
Name    : Rahul
Age     : 21
College : SPPU

===============================================================================

9. Line-by-Line Code Explanation
-------------------------------------------------------------------------------

static String college = "SPPU";

→ One copy is created for the entire class.

Student.college

→ Accessing the static variable using the class name.

Both Student objects share the same college value.

===============================================================================

10. Common Mistakes
-------------------------------------------------------------------------------

❌ Thinking every object has its own static variable.

❌ Accessing static variables only through objects.

Preferred:

Student.college

===============================================================================

11. Best Practices
-------------------------------------------------------------------------------

✔ Access static variables using the class name.

✔ Use static only for common/shared data.

✔ Do not store object-specific information in static variables.

===============================================================================

12. Interview Questions
-------------------------------------------------------------------------------

Beginner

Q1. What is a static variable?

Q2. Why is it called a class variable?

Intermediate

Q3. Where are static variables stored?

Q4. How many copies of a static variable exist?

Advanced

Q5. What is the difference between instance and static variables?

Q6. Can a static variable be accessed without creating an object?

===============================================================================

13. Practice Questions
-------------------------------------------------------------------------------

Easy
1. Create a Company class with a static companyName.

Medium
2. Create a School class with a static schoolName.

Hard
3. Create an Employee class where all employees share the same company name.

===============================================================================

14. Summary
-------------------------------------------------------------------------------

✔ Static variables belong to the class.
✔ Only one copy exists.
✔ Shared by all objects.
✔ Stored in Method Area.
✔ Used for common data.

===============================================================================
*/
