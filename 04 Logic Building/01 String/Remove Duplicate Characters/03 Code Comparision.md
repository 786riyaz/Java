The first implementation is considered **better from a performance, scalability, and design perspective**, even though both produce the same functional result (removal of duplicate characters while preserving order). Below is a precise, technical comparison.

---

## 1. Time Complexity (Primary Reason)

### **First Approach (boolean array + StringBuilder)**

```java
boolean[] seen = new boolean[256];
StringBuilder result = new StringBuilder();
```

* Checking whether a character has appeared before is **O(1)**.
* Appending to `StringBuilder` is **O(1)** amortized.
* Overall loop runs once for each character.

**Time Complexity:**
**O(n)**

---

### **Second Approach (String + indexOf)**

```java
if(result.indexOf(ch) == -1) {
    result += ch;
}
```

* `indexOf(ch)` scans the `result` string → **O(n)**
* `result += ch` creates a new String every time → **O(n)** (Strings are immutable)
* Happens inside a loop that already runs **n** times.

**Time Complexity:**
**O(n²)**

This becomes noticeably slower as the input size grows.

---

## 2. Memory Efficiency

### **First Approach**

* Uses a fixed-size boolean array (`256`) → predictable, constant memory
* `StringBuilder` avoids repeated object creation

### **Second Approach**

* Each `result += ch` creates a **new String object**
* Causes unnecessary memory allocation and garbage collection

---

## 3. String Immutability (Critical Java Concept)

* `String` objects are **immutable**

* Every concatenation:

  ```java
  result += ch;
  ```

  creates a new String and copies the old content

* `StringBuilder` is **mutable**, so characters are appended in-place

---

## 4. Separation of Concerns (Design Quality)

### **First Approach**

* Logic is separated into a reusable method:

  ```java
  removeDuplicates(String str)
  ```
* Can be reused, tested, or called from anywhere

### **Second Approach**

* Logic is tightly coupled to `main`
* Poor reusability and testability

---

## 5. Scalability and Professional Code Standards

| Aspect                     | First Code | Second Code            |
| -------------------------- | ---------- | ---------------------- |
| Performance                | Excellent  | Poor for large strings |
| Memory Usage               | Efficient  | Wasteful               |
| Reusability                | High       | Low                    |
| Clean Code                 | Yes        | No                     |
| Interview/Production Ready | Yes        | No                     |

---

## 6. When the Second Approach Is Acceptable

The second version is acceptable **only** when:

* Input strings are very small
* Code is written for learning or demonstration purposes
* Performance is not a concern

---

## Final Verdict

**The first implementation is objectively better because:**

* Linear time complexity (**O(n)**)
* Efficient memory usage
* Avoids String immutability overhead
* Clean, reusable, and scalable
* Aligns with Java best practices

If this were an **interview or production scenario**, the **first approach is the correct and expected solution**.
