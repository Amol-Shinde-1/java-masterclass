/*
===============================================================================
                           INSTANCE VARIABLE
===============================================================================

1. Definition
-------------------------------------------------------------------------------
An Instance Variable is a variable declared inside a class but outside
all methods, constructors, and blocks.

Each object of the class gets its own separate copy of instance variables.

-------------------------------------------------------------------------------
2. Why Do We Need It?
-------------------------------------------------------------------------------
Instance variables store the unique data of each object.

Every object can have different values.

-------------------------------------------------------------------------------
3. Syntax
-------------------------------------------------------------------------------

class Student {

    String name;
    int age;

}

-------------------------------------------------------------------------------
4. Rules
-------------------------------------------------------------------------------

✔ Declared inside a class but outside methods.
✔ Each object has its own copy.
✔ Stored in Heap Memory.
✔ Gets default values automatically.
✔ Accessible using object reference.

-------------------------------------------------------------------------------
5. Real-Time Example (IT Company)
-------------------------------------------------------------------------------

Employee Management System

Employee 1

Name : Amol
Salary : 40000

Employee 2

Name : Rahul
Salary : 55000

Both employees belong to the same Employee class,
but each object stores different values.

-------------------------------------------------------------------------------
6. Daily-Life Example
-------------------------------------------------------------------------------

Imagine a classroom.

Every student has

• Different Name
• Different Roll Number
• Different Marks

Each student is an object.

The information of every student is stored separately.

-------------------------------------------------------------------------------
7. Internal Working (JVM Memory)
-------------------------------------------------------------------------------

Student s1 = new Student();

            Heap Memory

      +----------------------+
      | name = "Amol"        |
      | age  = 20            |
      +----------------------+

Student s2 = new Student();

      +----------------------+
      | name = "Rahul"       |
      | age  = 22            |
      +----------------------+

Each object has its own instance variables.

-------------------------------------------------------------------------------
8. Java Program
-------------------------------------------------------------------------------
*/

class Student {

    String name;
    int age;

}

public class InstanceVariableDemo {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Amol";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.age = 22;

        System.out.println("Student 1");
        System.out.println("----------------");
        System.out.println("Name : " + s1.name);
        System.out.println("Age  : " + s1.age);

        System.out.println();

        System.out.println("Student 2");
        System.out.println("----------------");
        System.out.println("Name : " + s2.name);
        System.out.println("Age  : " + s2.age);

    }
}

/*
===============================================================================

Expected Output

Student 1
----------------
Name : Amol
Age  : 20

Student 2
----------------
Name : Rahul
Age  : 22

===============================================================================

9. Line-by-Line Code Explanation
-------------------------------------------------------------------------------

class Student
→ Creates a class.

String name;
int age;
→ Instance variables.

Student s1 = new Student();
→ Creates the first object.

Student s2 = new Student();
→ Creates another object.

Both objects have their own separate data.

===============================================================================

10. Common Mistakes
-------------------------------------------------------------------------------

❌ Thinking all objects share the same instance variables.

❌ Forgetting to create an object before accessing instance variables.

===============================================================================

11. Best Practices
-------------------------------------------------------------------------------

✔ Use meaningful variable names.
✔ Keep instance variables private (we'll learn this in Encapsulation).
✔ Create separate objects for separate data.

===============================================================================

12. Interview Questions
-------------------------------------------------------------------------------

Beginner

Q1. What is an instance variable?

Q2. Where is an instance variable declared?

Intermediate

Q3. Where are instance variables stored?

Q4. Does every object have its own copy?

Advanced

Q5. What default values do instance variables receive?

Q6. What is the difference between local and instance variables?

===============================================================================

13. Practice Questions
-------------------------------------------------------------------------------

Easy
1. Create a Car class with brand and price.

Medium
2. Create an Employee class with id, name and salary.

Hard
3. Create a BankAccount class with accountNumber, holderName and balance.

===============================================================================

14. Summary
-------------------------------------------------------------------------------

✔ Instance variables belong to objects.
✔ Stored in Heap Memory.
✔ Each object has its own copy.
✔ Automatically receive default values.

===============================================================================
*/
