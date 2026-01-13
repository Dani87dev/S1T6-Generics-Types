# SPRINT1.06 Java Generics

In this task, we practice the basic concepts of **Java Generics**, comparing non-generic implementations with generic methods in order to understand type safety, flexibility, and code reusability.

---

## TASK 1 — LEVEL 1

### 📌 Exercise Statement

**Exercise 1 — Non-generic class**

1. Create a class called `NoGenericMethods` that stores three elements of the same type.
2. Initialize the elements through a constructor.
3. Provide getter methods to access each element.
4. Verify from the `main` method that the elements can be passed to the constructor in any order.

This exercise focuses on understanding the limitations of non-generic code before introducing generics.

---

## TASK 2 — LEVEL 1

### 📌 Exercise Statement

**Exercise 2 — Generic method**

1. Create a `Person` class with the attributes `name`, `surname`, and `age`.
2. Create a class called `GenericMethods` with a **static generic method** that accepts three parameters of generic type.
3. Print the received parameters inside the method.
4. From the `main` method, call the generic method using different data types (objects, strings, and numeric values) and in different orders.

This exercise demonstrates how generic methods allow working with multiple data types safely and flexibly.

---

## TASK 1 — LEVEL 2

### 📌 Exercise Statement

**Exercise 1 — Partial Generic Method**

1. Modify the generic method from the previous level so that **one parameter is a fixed type** (`String`).
2. The other two parameters must remain **generic**.
3. Print all received parameters to verify correct behavior.

This exercise focuses on understanding how generic and non-generic types can coexist within the same method.

---

## TASK 2 — LEVEL 2

### 📌 Exercise Statement

**Exercise 2 — Generic Varargs**

1. Adapt the previous exercise so that the method accepts a **variable number of generic arguments** using varargs.
2. The method should be named `printAll()`.
3. Print all received parameters to verify the result.

This exercise introduces the use of **varargs with generics** and highlights the potential *unchecked warnings* caused by type erasure in Java.

---

## 🛠 Technologies

- Java: 21 (LTS)
- IDE: IntelliJ IDEA
- Version Control: Git
- Repository Hosting: GitHub

---

## 🚀 Installation and Execution

### Prerequisites
- Java Development Kit (JDK) 8+ is required.

### Clone the repository

```bash
git clone https://github.com/Dani87dev/S1T6---Generics-Types.git
