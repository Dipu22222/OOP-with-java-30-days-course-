# OOP-with-java-30-days-course
**Name: Dipu Mondol;<br>
**ID: IT-24040;<br>
**Language: Java;<br>
**IDE: Command Line;<br><br><br>
Day 1: classes and objects<br>
video Link: https://www.youtube.com/watch?v=lWFzm8qIR1c&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=3 <br>
Source Code: <br>

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

---



