Lesson 1: Introduction to Java
1. What is Java?

Java is a high-level, object-oriented, class-based programming language developed to create software that can run on different operating systems without changing the source code.

In simple words:

Java is a programming language used to tell a computer what to do.

With Java, we can build:

Desktop applications
Web applications
Backend systems
Android applications
Banking software
E-commerce websites
Enterprise applications
2. Why was Java Created?

Before Java, many programming languages were tied to a specific operating system.

For example:

A program written for Windows often could not run on Linux.
A program written for Linux often could not run on macOS.

Java solved this problem with its famous principle:

"Write Once, Run Anywhere (WORA)."

This means you write the Java program once, and it can run on any system that has a Java Virtual Machine (JVM).

3. History of Java
1991: Java project started at Sun Microsystems.
Creator: James Gosling (known as the "Father of Java").
Original name: Oak.
Reason for changing the name: Oak was already a registered trademark, so the language was renamed to Java.
1995: Java was officially released.
2010: Oracle Corporation acquired Sun Microsystems and became responsible for Java.
4. Features of Java
1. Platform Independent

Java programs can run on Windows, Linux, and macOS without changing the source code.

2. Object-Oriented

Java is based on objects and classes, making programs easier to organize and maintain.

3. Simple

Java has a clear syntax and removes many complex features found in older languages like C++.

4. Secure

Java provides features such as bytecode verification and automatic memory management to improve security.

5. Robust

Java handles errors using exception handling and automatically manages memory with the Garbage Collector.

6. Portable

Java programs can be moved between systems without recompiling the source code.

7. Multithreaded

Java can execute multiple tasks simultaneously using threads.

8. High Performance

Java uses the Just-In-Time (JIT) Compiler to improve execution speed.

5. Real-Life Example

Imagine you know only Marathi, and a tourist speaks English.

A translator converts English into Marathi so you can understand.

Java works similarly.

Programmer
      │
      ▼
Writes Java Code
      │
      ▼
Java Compiler
      │
      ▼
Bytecode
      │
      ▼
JVM
      │
      ▼
Computer Executes

The programmer writes Java code, and Java converts it into instructions the computer can execute.

6. How Java Works Internally

Suppose you create:

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
Step 1: Write Source Code

You write:

HelloJava.java

This file is called the source code.

Step 2: Compilation

You run:

javac HelloJava.java

The Java Compiler checks for syntax errors.

If everything is correct, it creates:

HelloJava.class

This .class file contains bytecode, not machine code.

Step 3: JVM Starts

When you run:

java HelloJava

the Java Virtual Machine starts.

Step 4: Class Loader

The Class Loader loads HelloJava.class into memory.

Step 5: Bytecode Verifier

The JVM checks whether the bytecode is safe and valid.

Step 6: Execution Engine

The Execution Engine converts the bytecode into machine code that your CPU understands.

Step 7: Output

The CPU executes the machine code, and the screen displays:

Hello Java
Complete Execution Flow
HelloJava.java
        │
        ▼
Java Compiler (javac)
        │
        ▼
HelloJava.class (Bytecode)
        │
        ▼
Java Virtual Machine (JVM)
        │
        ▼
Class Loader
        │
        ▼
Bytecode Verifier
        │
        ▼
Execution Engine
        │
        ▼
Machine Code
        │
        ▼
CPU Executes
        │
        ▼
Output on Screen
7. Applications of Java

Java is used in:

Banking software
E-commerce websites
Enterprise applications
Android applications
Cloud applications
Web servers
Financial systems
Educational software
8. Advantages of Java
Platform independent
Secure
Object-oriented
Easy to learn
Large community
Automatic memory management
Good performance
Widely used in the IT industry
9. Important Interview Questions
What is Java?
Who developed Java?
Why was Java created?
What is WORA?
Why is Java platform independent?
What is bytecode?
What is the role of the JVM?
What is the role of the Java Compiler?
Why is Java considered secure?
What are the main features of Java?
10. Summary
Java is a high-level, object-oriented programming language.
It was created by James Gosling.
It was first released in 1995.
Java follows the principle Write Once, Run Anywhere (WORA).
Java source code is compiled into bytecode.
The JVM executes bytecode on different operating systems.
Java is widely used for backend development, enterprise software, Android applications, and web services.