# Library Management System

A simple Java-based library management system that demonstrates object-oriented programming concepts.

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

## Project Structure

```
library-system/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── library/
│                   ├── Author.java
│                   ├── Book.java
│                   ├── Librarian.java
│                   ├── LibrarySystem.java
│                   ├── Loan.java
│                   └── Member.java
├── pom.xml
└── README.md
```

## How to Run

1. Make sure you have Java and Maven installed on your system
2. Open a terminal in the project root directory
3. Compile and run the project using Maven:

```bash
mvn clean package
java -jar target/library-system-1.0-SNAPSHOT.jar
```

## Features

- Book management (add, remove, check availability)
- Author management
- Member management
- Loan tracking
- Library catalog management

## Example Output

When you run the program, you'll see a demonstration of the library system in action, including:
- Creating a librarian
- Adding books to the catalog
- Creating members
- Processing loans
- Displaying system information 