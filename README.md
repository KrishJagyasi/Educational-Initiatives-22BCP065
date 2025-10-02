# Java Design Patterns & OOP Mini-Projects

![Language](https://img.shields.io/badge/Language-Java-blue.svg)
![JDK](https://img.shields.io/badge/JDK-17%2B-orange.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

This repository contains the solutions for two mini-project assignments designed to demonstrate a practical understanding of Object-Oriented Programming (OOP), SOLID principles, and common software design patterns in Java.

The project is entirely console-based, with a focus on high-quality code, logic, and adherence to software engineering best practices.

---

## Project Structure

The repository is organized into two main assignments, launched from a single, interactive menu:

```text
.
├── Assignment1
│   ├── Behavioural
│   │   ├── Observer        (Online Auction System)
│   │   └── Strategy        (Ride-Sharing Pricing)
│   ├── Creational
│   │   ├── Builder         (Custom Meal Builder)
│   │   └── Factory         (Document Converter)
│   └── Structural
│       ├── Adapter         (Third-Party Weather API)
│       └── Decorator       (Photo Editing Filters)
│
├── Assignment2
│   └── src
│       └── com
│           └── example
│               └── marsrover
│
├── CombinedMain.java       <-- The Main Entry Point for the Application
├── .gitignore
└── README.md
```

## Assignments Overview

### Assignment 1: Design Patterns Showcase

This assignment consists of six self-contained demonstrations for common software design patterns. Each demo solves a creative, real-world problem to illustrate the pattern's core intent.

* **Behavioural Patterns:**
    * **Strategy:** A ride-sharing app that dynamically switches its pricing algorithm for standard vs. peak hours.
    * **Observer:** An online auction system where multiple bidders (Observers) are automatically notified of new bids on an item (Subject).
* **Creational Patterns:**
    * **Factory Method:** A document converter application where subclasses decide which type of document (PDF, Word) to create.
    * **Builder:** A custom meal-building system at a restaurant, allowing for the step-by-step construction of a complex `Meal` object.
* **Structural Patterns:**
    * **Adapter:** An adapter that allows a modern, third-party weather API to work with an older, incompatible application interface.
    * **Decorator:** A photo editing tool that dynamically stacks multiple filters (Brightness, Sepia) onto a photo object.

### Assignment 2: Mars Rover Simulation

This is a complete, interactive console application that simulates a Mars Rover navigating a grid.

**Key Features:**
* **Interactive Setup:** The user can dynamically define the grid size, rover's starting position, obstacle locations, and the command sequence.
* **Advanced Movement Logic:** The rover's movement and turning logic is implemented using the **State Pattern**, completely avoiding `if/else` or `switch` statements for directional control.
* **Decoupled Actions:** The rover's actions (`Move`, `Turn Left`, `Turn Right`) are encapsulated using the **Command Pattern**.
* **Obstacle Detection:** The rover correctly identifies and avoids obstacles, logging each detection and including a summary in the final mission report.
* **Continuous Operation:** The simulation can be run multiple times without exiting the program.

---

## Technologies & Concepts Demonstrated

* **Language:** Java (JDK 17+)
* **Core Principles:** Object-Oriented Programming (OOP) & SOLID Design Principles
* **Design Patterns Implemented:**
    * State
    * Command
    * Observer
    * Strategy
    * Factory Method
    * Builder
    * Adapter
    * Decorator
    * Singleton
* **Core Java Concepts:**
    * Interfaces and Abstract Classes
    * Polymorphism and Encapsulation
    * Java Collections Framework (Lists, Sets, Maps)
    * Exception Handling (`try-catch`)
    * Console I/O (`java.util.Scanner`)
    * Logging (`java.util.logging`)
* **Best Practices:**
    * Clean, organized file structure.
    * Use of `.gitignore` to maintain a clean repository.
    * Defensive programming and input validation.

---

## How to Compile and Run

#### Prerequisites
* Java Development Kit (JDK) 17 or higher.
* Git.

#### Steps

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/KrishJagyasi/Educational-Initiatives-22BCP065.git
    ```

2.  **Navigate to the project directory:**
    ```bash
    cd Educational-Initiatives-22BCP065
    ```

3.  **Compile and Run from the Terminal:**
    The project includes source files in both the default package (Assignment 1) and a named package (Assignment 2). The following commands will compile everything into a `bin` directory and run the main application menu.

    ```bash
    # 1. Create a directory for the compiled files
    mkdir bin

    # 2. Compile Assignment 1 (Design Patterns)
    javac -d bin Assignment1\Behavioural\Strategy\*.java Assignment1\Behavioural\Observer\*.java Assignment1\Creational\Builder\*.java Assignment1\Creational\Factory\*.java Assignment1\Structural\Adapter\*.java Assignment1\Structural\Decorator\*.java

    # 3. Compile Assignment 2 (Mars Rover)
    javac -d bin Assignment2\src\com\example\marsrover\*.java Assignment2\src\com\example\marsrover\model\*.java Assignment2\src\com\example\marsrover\direction\*.java Assignment2\src\com\example\marsrover\command\*.java

    # 4. Compile the main menu (which depends on the others)
    javac -d bin -cp bin CombinedMain.java

    # 5. Run the final application
    java -cp bin CombinedMain
    ```

4.  **Using the Application:**
    Once running, a menu will appear. Enter the number corresponding to the demo you wish to run, or type `exit` to quit.

---

## Author

**Krish (22BCP065)**
