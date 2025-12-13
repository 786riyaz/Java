# **1. What is a Function (Method) in Java?**
A **function** (in Java called a *method*) is a reusable block of code that performs a specific task.

Functions help with:
* Code reuse
* Clean and modular programming
* Reducing duplication
* Better readability

---

# **2. Syntax of a Java Method**
returnType methodName(parameterList) {
    // method body
}

Example:
int add(int a, int b) {
    return a + b;
}

---

# **3. Types of Methods in Java**
## **A. Based on Return Type**
### 1. **Method with return value**
int square(int n) {
    return n * n;
}

### 2. **Method without return value (void)**
void greet() {
    System.out.println("Hello");
}

---

## **B. Based on Parameters**
### 3. **Method with parameters**
void printName(String name) {
    System.out.println(name);
}

### 4. **Method without parameters**
void show() {
    System.out.println("Showing data...");
}

---

## **C. Static and Non-Static Methods**
### 5. **Static Method**
* Belongs to the class, not to an object
* Called using class name

Example:
static void display() {
    System.out.println("Static method");
}

Usage:
ClassName.display();

### 6. **Non-Static Method**
* Requires an object
Example:
void hello() {
    System.out.println("Hello");
}

Usage:
MyClass obj = new MyClass();
obj.hello();

---

## **D. Method Overloading (Compile-time Polymorphism)**
Multiple methods with the **same name** but **different parameters**.

int add(int a, int b) { return a + b; }
int add(int a, int b, int c) { return a + b + c; }

---

## **E. Varargs Method**
When you don't know how many arguments will be passed.

void show(int... nums) {
    for (int n : nums) System.out.println(n);
}

---

# **4. Complete Example of Methods**
public class Demo {
    static int add(int a, int b) {     // Method with return
        return a + b;
    }

    static void greet() {             // Void method
        System.out.println("Welcome!");
    }

    void nonStaticMessage() {         // Non-static method
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        greet();
        System.out.println("Sum: " + add(5, 10));

        Demo obj = new Demo();        // Creating object for non-static method
        obj.nonStaticMessage();
    }
}

---

# **5. Important Concepts Related to Methods**
## **1. Method Signature**
Includes **method name + parameter list**
Example:
add(int, int)

## **2. return Statement**
Ends method execution and returns value.

## **3. Access Modifiers**
Control visibility:
* public
* private
* protected
* default

## **4. Call by Value**
Java **always passes arguments by value** (copies of data are sent).

---

# **6. Why Use Methods?**
* Avoid repeated code
* Improve readability
* Easier debugging
* Makes programs modular