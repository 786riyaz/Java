# 1. What is Exception Handling in Java?
Exception handling in Java is a mechanism to handle runtime errors so the program does not crash.
It ensures normal program flow even when unexpected problems occur.

---

# 2. Why Use Exception Handling?
* To prevent program termination
* To handle unexpected conditions (e.g., divide by zero, invalid input)
* To provide meaningful error messages
* To maintain robust, stable applications

---

# 3. The Exception Handling Keywords
Java provides five main constructs:

1. try - Block of code where exception may occur
2. catch - Handles the exception
3. finally - Executes always (whether exception occurs or not)
4. throw - Used to manually throw an exception
5. throws - Declares exceptions a method can throw

---

# 4. Basic try-catch Example
try {
    int a = 10 / 0;   // Will cause ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}


Explanation: The exception is caught and handled, preventing program crash.

---

# 5. Multiple catch Blocks
try {
    int[] arr = new int[3];
    System.out.println(arr[5]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Invalid array index");
} catch (Exception e) {
    System.out.println("General exception");
}


Explanation:
Java will match the first suitable catch block.

---

# 6. catch with Exception Object
catch (Exception e) {
    System.out.println(e.getMessage());
    e.printStackTrace();
}


Meaning:
`getMessage()` returns error message,
`printStackTrace()` prints full error path.

---

# 7. finally Block
try {
    System.out.println("Inside try");
} catch (Exception e) {
    System.out.println("Exception");
} finally {
    System.out.println("This block always runs");
}


Use cases of finally:

* Closing files
* Closing database connections
* Releasing resources

---

# 8. throw Keyword (Manually Throw Exception)
throw new IllegalArgumentException("Invalid age");

Use this inside a method to create custom error conditions.

---

# 9. throws Keyword (Declare Exceptions)
void readFile() throws IOException {
    FileReader fr = new FileReader("data.txt");
}

Meaning:
The method can throw an exception; the caller must handle it.

---

# 10. try-with-resources (Automatic Resource Closing)
Used for files, database connections, etc.

try (FileReader fr = new FileReader("data.txt")) {
    // reading file
} catch (Exception e) {
    System.out.println(e);
}

Explanation:
Automatically closes the resource (fr) even if exception occurs.

---

# 11. Checked vs Unchecked Exceptions

## Checked Exceptions
* Detected at compile time
* Must be handled or declared using throws
Examples:
    * IOException
    * FileNotFoundException
    * SQLException

## Unchecked Exceptions
* Occur at runtime
* Not required to be handled explicitly
Examples:
    * ArithmeticException
    * NullPointerException
    * ArrayIndexOutOfBoundsException

---

# 12. Custom Exception Example
class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}

public class Test {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void validateAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Age must be 18 or above");
    }
}

---

# 13. Summary (One-Line Notes)

* try: Code that may cause exception
* catch: Handles the exception
* finally: Always runs
* throw: Used to manually throw an exception
* throws: Declares that a method may throw exceptions
* Checked exceptions: Compile-time
* Unchecked exceptions: Runtime
* try-with-resources: Auto-closes resources