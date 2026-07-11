# ☕ Java Introduction

> **Course:** Java Masterclass
>
> **Chapter:** 01 - Java Introduction
>
> **Difficulty:** ⭐ Beginner
>
> **Estimated Reading Time:** 20 Minutes
>
> **Prerequisites:** None

---

# Table of Contents

1. Introduction
2. What is Java?
3. History of Java
4. Why Java was Created?
5. Goals of Java
6. Features of Java
7. Java Architecture
8. How Java Works?
9. Java Editions
10. Applications of Java
11. Advantages
12. Disadvantages
13. Real World Examples
14. Example Program
15. Interview Questions
16. Summary
17. Key Points

---

# 1. Introduction

Java is one of the most popular programming languages in the world.

It is a **high-level**, **object-oriented**, **class-based**, and **platform-independent** programming language.

Java is designed to build reliable, secure, and scalable applications.

Today Java is used by millions of developers worldwide and powers websites, banking software, Android applications, cloud services, enterprise systems, and microservices.

---

# 2. What is Java?

Java is a programming language and software platform.

It helps programmers write code once and run it on different operating systems.

This concept is known as

> **Write Once, Run Anywhere (WORA).**

Instead of compiling directly into machine code, Java first converts source code into **Bytecode**.

The Bytecode is executed by the **Java Virtual Machine (JVM).**

---

## Simple Definition

Java is a language that tells a computer what to do.

---

## Technical Definition

Java is a high-level, object-oriented programming language developed by Sun Microsystems that runs on the Java Virtual Machine (JVM).

---

# 3. History of Java

| Year | Event |
|------|------|
| 1991 | James Gosling started the Green Project |
| 1992 | Language named Oak |
| 1995 | Renamed to Java |
| 1996 | JDK 1.0 Released |
| 2009 | Oracle acquired Sun Microsystems |
| Today | Java is maintained by Oracle |

---

# Why was it called Oak?

Because an Oak tree stood outside James Gosling's office.

Later the name was changed because Oak was already trademarked.

The team selected the name **Java**, inspired by Java coffee.

---

# 4. Why Java was Created

Before Java, programs were dependent on operating systems.

Example:

A Windows application usually could not run on Linux.

Developers had to write separate versions.

This increased development cost.

James Gosling wanted a language that could run on any device.

This became possible through the Java Virtual Machine (JVM).

---

# 5. Goals of Java

Java was created to achieve:

- Platform Independence
- Simplicity
- Security
- Reliability
- Portability
- High Performance
- Robustness
- Network Support
- Multithreading

---

# 6. Features of Java

## Simple

Easy syntax.

## Object-Oriented

Everything is organized using classes and objects.

## Platform Independent

Runs on Windows, Linux, and macOS without changing source code.

## Secure

No pointer arithmetic.

Bytecode verification.

Security Manager.

## Robust

Automatic garbage collection.

Exception handling.

## Portable

Same bytecode runs everywhere.

## Distributed

Supports networking.

## Multithreading

Multiple tasks execute simultaneously.

## Dynamic

Classes can load during runtime.

---

# 7. Java Architecture

```
Java Source Code (.java)
          │
          ▼
      Java Compiler
         (javac)
          │
          ▼
     Bytecode (.class)
          │
          ▼
          JVM
          │
          ▼
 Operating System
          │
          ▼
      Hardware
```

---

# 8. How Java Works

Step 1

Write Java program.

↓

Step 2

Compile using

```bash
javac Hello.java
```

↓

Step 3

Compiler creates

```
Hello.class
```

↓

Step 4

Run

```bash
java Hello
```

↓

Step 5

JVM executes Bytecode.

---

# 9. Java Editions

| Edition | Usage |
|----------|------|
| Java SE | Desktop Applications |
| Java EE (Jakarta EE) | Enterprise Applications |
| Java ME | Embedded Devices |

---

# 10. Applications of Java

- Banking Systems
- ATM Software
- E-Commerce Websites
- Android Applications
- Enterprise Software
- Cloud Computing
- REST APIs
- Spring Boot Applications
- Microservices
- Desktop Software
- Games

---

# 11. Advantages

- Easy to Learn
- Secure
- Portable
- Huge Community
- Excellent Documentation
- Large Job Market
- Open Source Tools
- Automatic Memory Management

---

# 12. Disadvantages

- More Memory Usage
- Slower than C/C++
- Startup Time is Higher
- GUI libraries are less popular today

---

# 13. Real World Companies Using Java

- Amazon
- Netflix
- Uber
- LinkedIn
- Spotify
- Paytm
- Flipkart
- Google (Android)
- Oracle

---

# 14. Example Program

```java
public class Hello {

    public static void main(String[] args) {

        System.out.println("Welcome to Java");

    }

}
```

Output

```
Welcome to Java
```

---

# 15. Interview Questions

### What is Java?

Java is a high-level, object-oriented, platform-independent programming language.

---

### Who developed Java?

James Gosling.

---

### Why is Java platform independent?

Because Java programs run on the JVM instead of directly on the operating system.

---

### What is JVM?

JVM executes Java Bytecode.

---

### What is Bytecode?

Bytecode is the intermediate code generated by the Java compiler.

---

### Explain WORA.

Write Once, Run Anywhere.

---

# 16. Summary

Java is one of the most powerful programming languages for enterprise software and backend development. It uses the JVM to achieve platform independence and provides features such as object-oriented programming, security, robustness, and automatic memory management.

---

# 17. Key Points for Revision

- Java is platform independent.
- Java uses JVM.
- Java source code becomes Bytecode.
- Java follows WORA.
- Developed by James Gosling.
- Oracle currently maintains Java.
- Java is widely used in backend development.