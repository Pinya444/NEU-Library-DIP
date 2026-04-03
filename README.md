# SOLID Principles – Dependency Inversion Principle (DIP)

## Problem Statement
The NEU Library system currently allows students to borrow specific resources using methods like:
- borrowBook()
- borrowJournal()

This creates tight coupling between the Student class and specific resource types, violating the Dependency Inversion Principle (DIP).

The goal is to refactor the system so that it:
- Depends on abstractions instead of concrete classes
- Allows easy addition of new resource types (e.g., AudioBook, EJournal)
- Maintains compliance with all SOLID principles

---

## Solution Overview

We introduced a common interface called `LibraryResource` that represents all borrowable resources.

Concrete classes such as:
- Book
- Journal
- AudioBook

implement this interface.

The Student class now interacts with the abstraction (`LibraryResource`) instead of specific resource types.

---

## Benefits

- Follows Dependency Inversion Principle (DIP)
- Open for extension (OCP)
- Avoids tight coupling
- Easily scalable for future resources

---

## UML Class Diagram

(Insert diagram image or text here)

---

## Test Program

The `TestProgram` demonstrates:
- Borrowing different resource types
- Flexibility in adding new resources without modifying existing code