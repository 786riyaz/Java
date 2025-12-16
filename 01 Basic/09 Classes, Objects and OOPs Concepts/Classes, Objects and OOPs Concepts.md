# 1. Class in Java
### Definition
A class is a blueprint or template used to create objects. It defines properties (variables) and behaviors (methods).

### Syntax
```java
class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}
```

### Key Points
* Class does not occupy memory until an object is created
* One class can create multiple objects
* Class can contain variables, methods, constructors, and blocks

---

# 2. Object in Java
### Definition
An object is a real-world entity and an instance of a class.

### Creation
```java
Student s1 = new Student();
s1.id = 101;
s1.name = "Riyaz";
s1.display();
```

### Key Points
* Object occupies memory
* Created using `new` keyword
* Accesses class members using dot (`.`) operator

---

# 3. OOP Concepts in Java
Java follows Object-Oriented Programming (OOP) principles.

---

## 1. Encapsulation
### Definition
Wrapping data (variables) and code (methods) together into a single unit and restricting direct access.

### Example
```java
class Account {
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}
```

### Benefits
* Data hiding
* Better control over data
* Improves maintainability

---

## 2. Inheritance
### Definition
One class acquires the properties and methods of another class.

### Syntax
```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

### Types
* Single
* Multilevel
* Hierarchical

(Java does NOT support multiple inheritance with classes)

---

## 3. Polymorphism
### Definition
One method behaves differently in different situations.

### Types
### a) Compile-time (Method Overloading)
```java
int add(int a, int b) { return a + b; }
int add(int a, int b, int c) { return a + b + c; }
```

### b) Runtime (Method Overriding)
```java
class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child");
    }
}
```

---

## 4. Abstraction
### Definition
Showing only essential details and hiding implementation.

### Using Abstract Class
```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
```

### Using Interface
```java
interface Vehicle {
    void run();
}
```

---

# 4. Constructor in Java
### Definition
A special method used to initialize objects.

### Example
```java
class Student {
    int id;
    Student(int id) {
        this.id = id;
    }
}
```

### Rules
* Name must be same as class
* No return type
* Called automatically when object is created

---

# 5. this Keyword
### Usage
Refers to current object.

```java
this.id = id;
```

---
# 6. static Keyword
### Definition
Belongs to the class rather than object.
```java
static int count;
```

---

# 7. final Keyword
### Usage
* final variable → constant
* final method → cannot be overridden
* final class → cannot be inherited

---

# 8. Association, Aggregation, Composition
### Association
General relationship between classes.

### Aggregation
Weak relationship (HAS-A).
```java
class Department {
    Teacher t;
}
```

### Composition
Strong relationship.
```java
class House {
    Room r = new Room();
}
```

---

# 9. Access Modifiers
| Modifier  | Class | Package | Subclass | World |
| --------- | ----- | ------- | -------- | ----- |
| public    | ✔     | ✔       | ✔        | ✔     |
| protected | ✔     | ✔       | ✔        | ✖     |
| default   | ✔     | ✔       | ✖        | ✖     |
| private   | ✔     | ✖       | ✖        | ✖     |

---

# 10. Difference: Class vs Object
| Class          | Object          |
| -------------- | --------------- |
| Blueprint      | Real instance   |
| No memory      | Uses memory     |
| Logical entity | Physical entity |

---

# 11. Benefits of OOP
* Code reusability
* Security
* Scalability
* Maintainability

---

# 12. Interview One-Line Notes
* Java is partially object-oriented
* Supports encapsulation, inheritance, polymorphism, abstraction
* Uses interface to support multiple inheritance