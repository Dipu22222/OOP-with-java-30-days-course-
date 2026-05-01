# OOP-with-java-30-days-course
**Name: Dipu Mondol;<br>
**ID: IT-24040;<br>
**Language: Java;<br>
**IDE: Command Line;<br><br><br>
## 📅 Progress Tracker<br>
***[Day 1: Classes and Objects](#-day-1-classes-and-objects)<br>
***[Day 2: Encapsulation in Java](#-day-2-Encapsulation-in-Java)

### 📅 Day 1: Classes and Objects<br>
video Link: https://www.youtube.com/watch?v=lWFzm8qIR1c&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=3 <br>
Source Code: https://github.com/Dipu22222/OOP-with-java-30-days-course-/tree/main/Day1 <br>

## 📚 Table of Contents

- [Class](#-class)
- [Subclass](#-subclass)
- [Object](#-object)
- [Access Modifiers](#-access-modifiers)
  - [Public](#i-public-access-modifier)
  - [Private](#ii-private-access-modifier)
  - [Protected](#iii-protected-access-modifier)
  - [Default](#iv-default-modifier)
- [Non-Access Modifiers](#-non-access-modifiers)
  - [Static](#i-static-modifier)
  - [Final](#ii-final-variable-modifier)
  - [Abstract](#iii-abstract-modifier)

---

## 🧱 Class

A **class** in Java serves as a blueprint or template for creating objects. It defines the **properties (attributes)** and **behavior (methods)** that objects created from the class will have.

### Example

```java
public class Car {
    // Attributes of the class
    String color;
    String model;
    int year;

    // Method to display car information
    void displayInfo() {
        System.out.println("Car model: " + model);
        System.out.println("Car color: " + color);
        System.out.println("Car year: " + year);
    }
}
```

---

## 🔗 Subclass

A **subclass** in Java inherits properties and methods from a larger class known as the **superclass**, allowing the creation of a new class with added or modified features. A subclass is created using the `extends` keyword.

---

## 🎯 Object

An **object** is an instance of a class, created when memory is allocated based on the class definition.

### Example

```java
public class Day1_Main {
    public static void main(String[] args) {

        // Creating an object of the Day1_Car class
        Day1_Car myCar = new Day1_Car();

        // Assigning values to the object's attributes
        myCar.model = "Pagani";
        myCar.color = "Silver";
        myCar.year  = 2040;

        // Showing the information of the object
        myCar.displayInfo();
    }
}
```

**Output:**
```
Car model: Pagani
Car color: Silver
Car year: 2040
```

---

## 🔐 Access Modifiers

Access modifiers in Java are **keywords** that control the visibility and accessibility of classes, methods, and variables. They help in **encapsulation** and define how different parts of a program interact.

There are **4 kinds** of access modifiers:

---

### (i) Public Access Modifier

A `public` modifier allows elements such as classes, methods, or variables to be accessible from **any other class in any package**, making the element globally accessible throughout the program.

```java
public class Car {
    public String model;
}
```

---

### (ii) Private Access Modifier

A `private` modifier restricts access to an element, allowing it to be accessed **only within the same class** where it is declared.

```java
public class Car {
    private String model;
}
```

---

### (iii) Protected Access Modifier

A `protected` modifier allows access to a class member **within the same package** and **by subclasses even in different packages**.

```java
public class Car {
    protected int year;
}
```

---

### (iv) Default Modifier

A **default** modifier in Java is used when **no access modifier is specified**. It allows an element to be accessible **only within the same package**.

---

## 🔧 Non-Access Modifiers

---

### (i) Static Modifier

The `static` modifier implies that a member **belongs to the class**, not to instances — allowing access **without creating an object**.

```java
public class Car {
    static int numberOfCar = 0; // static variable

    public Car() {
        numberOfCar++; // Incrementing the static variable
    }

    static void displayCount() { // static method
        System.out.println("Total Cars: " + numberOfCar);
    }
}
```

---

### (ii) Final Variable Modifier

The `final` modifier ensures that:
- A **variable's value** cannot be changed
- A **method** cannot be overridden
- A **class** cannot be subclassed

```java
public final class Vehicle { // final class
    final int maxSpeed = 120; // final variable

    final void displayMaxSpeed() { // final method
        System.out.println("Max speed: " + maxSpeed);
    }
}
```

---

### (iii) Abstract Modifier

`abstract` modifiers are used for **classes and methods**.
- An **abstract class** cannot be instantiated and must be extended.
- An **abstract method** must be implemented in subclasses.

```java
public abstract class Shape { // abstract class
    abstract void draw(); // abstract method
}

public class Circle extends Shape {
    @Override
    void draw() { // Implementing abstract method
        System.out.println("Drawing Circle");
    }
}
```
<br><br><br>

### 📅 Day 2: Encapsulation in Java<br>
Video Link: https://www.youtube.com/watch?v=HZUUYnIZO_0&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=4&t=37s <br>
Source Code:    <br>

---

## 📖 What is Encapsulation?

**Encapsulation** is the process of **bundling data** (known as *attributes*) and the **methods** (known as *functions*) that operate on the data into a **single unit** — a `class`.

It restricts direct access to an object's internal state and only exposes what is necessary through controlled methods.

---

## 🔑 Key Concepts

| Concept | Description |
|--------|-------------|
| **Private attributes** | Data fields hidden from outside the class |
| **Public constructor** | Initializes attributes when creating objects |
| **Getter methods** | Allow reading private data safely |
| **Setter methods** | Allow modifying private data with validation |

---

## 💻 Code Example

### `Person.java` — The Encapsulated Class

```java

public class person {

    // Private attributes
    private String name;
    private int age;

    // Initializing the attributes through public constructor while creating objects
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method to get the name
    public String getName() {
        return name;
    }

    // Public method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Public method to get age
    public int getAge() {
        return age;
    }

    // Public method to set age (with validation)
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("age can't be negative");
        }
    }
}
```

---

### `MainPerson.java` — Using the Class

```java

public class MainPerson {
    public static void main(String[] args) {

        // Creating a new person object
        person person = new person("Dipu Mondol", 23);

        // Accessing the name using getter method
        System.out.println("Name: " + person.getName());

        // Accessing the age using getter method
        System.out.println("Age: " + person.getAge());

        System.out.println("\n****** UPDATED USING SETTER METHOD ******\n");

        // Modifying information using setter
        person.setName("Dipto Mondol");
        person.setAge(28);

        // Displaying the updated information
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Trying to set negative age
        person.setAge(-20);
    }
}
```

---

## 🖥️ Expected Output

```
Name: Dipu Mondol
Age: 23

****** UPDATED USING SETTER METHOD ******

Updated Name: Dipto Mondol
Updated Age: 28
age can't be negative
```

---

## ✅ Applications of Encapsulation

- **(i)** Hides private data from outside access
- **(ii)** Prevents unauthorised access to sensitive fields
- **(iii)** Maintains security and data integrity
- **(iv)** In API development — exposes only necessary methods while hiding external complexity

---

---

---



