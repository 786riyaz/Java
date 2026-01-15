Below is a **clear, interview-ready comparison of `String` vs `StringBuilder`**, written in **proper notes format** with **definitions, internal behavior, performance, use cases, and examples**.

---

# String vs StringBuilder (Java)

---

## 1. Definition

### **String**

* A `String` is an **immutable** sequence of characters.
* Once created, its value **cannot be changed**.
* Any modification creates a **new String object**.

```java
String s = "Java";
s = s.concat(" World"); // creates new object
```

---

### **StringBuilder**

* A `StringBuilder` is a **mutable** sequence of characters.
* Content can be modified **without creating new objects**.
* Introduced in **Java 5** for performance improvement.

```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" World"); // modifies same object
```

---

## 2. Mutability (Core Difference)

| Aspect       | String             | StringBuilder        |
| ------------ | ------------------ | -------------------- |
| Mutable      | ❌ No               | ✅ Yes                |
| Modification | Creates new object | Modifies same object |

---

## 3. Memory Behavior

### **String**

```java
String s = "A";
s = s + "B";
s = s + "C";
```

* Creates **multiple String objects**
* Old objects become **eligible for GC**
* Inefficient for frequent changes

---

### **StringBuilder**

```java
StringBuilder sb = new StringBuilder();
sb.append("A");
sb.append("B");
sb.append("C");
```

* Uses **same object**
* Better memory utilization
* No unnecessary garbage creation

---

## 4. Performance

| Operation      | String     | StringBuilder |
| -------------- | ---------- | ------------- |
| Concatenation  | Slow       | Fast          |
| Append in loop | ❌ Poor     | ✅ Best        |
| Single value   | Acceptable | Overkill      |

---

## 5. Thread Safety

| Feature         | String            | StringBuilder    |
| --------------- | ----------------- | ---------------- |
| Thread-safe     | ✅ Yes (immutable) | ❌ No             |
| Synchronization | Not required      | Not synchronized |

> Note: `StringBuffer` is synchronized, not `StringBuilder`.

---

## 6. Commonly Used Methods

### **String Methods**

* `length()`
* `charAt()`
* `substring()`
* `equals()`
* `replace()`
* `split()`

---

### **StringBuilder Methods**

* `append()`
* `insert()`
* `delete()`
* `reverse()`
* `replace()`
* `capacity()`

---

## 7. Example: Loop Performance Comparison

### ❌ Using String (Bad Practice)

```java
String result = "";
for(int i = 0; i < 1000; i++) {
    result += i;
}
```

---

### ✅ Using StringBuilder (Best Practice)

```java
StringBuilder result = new StringBuilder();
for(int i = 0; i < 1000; i++) {
    result.append(i);
}
```

---

## 8. String Constant Pool (SCP)

* `String` literals are stored in **String Constant Pool**
* `StringBuilder` objects are stored in **Heap only**

```java
String s1 = "Java";
String s2 = "Java"; // same reference (SCP)
```

---

## 9. When to Use What

### ✅ Use **String** when:

* Value will **not change**
* Configuration keys
* Constants
* Map keys
* Multithreaded safety needed

---

### ✅ Use **StringBuilder** when:

* Frequent modifications
* Loops
* Dynamic text creation
* Performance-critical logic

---

## 10. Interview Summary (One-Line Answers)

* **String is immutable; StringBuilder is mutable**
* **String is thread-safe; StringBuilder is not**
* **StringBuilder is faster for concatenation**
* **String consumes more memory in repeated changes**

---

## 11. String vs StringBuilder vs StringBuffer (Quick Table)

| Feature     | String   | StringBuilder | StringBuffer |
| ----------- | -------- | ------------- | ------------ |
| Mutable     | ❌        | ✅             | ✅            |
| Thread-safe | ✅        | ❌             | ✅            |
| Performance | Slow     | Fastest       | Medium       |
| Introduced  | Java 1.0 | Java 5        | Java 1.0     |

---

## 12. Common Interview Question

**Q: Why is String immutable in Java?**
**A:** For security, caching, thread safety, and performance optimization in String Constant Pool.
