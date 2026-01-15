Below is a **complete, structured notes-style list of Java `String` class methods**, suitable for **interview preparation, revision, and professional reference**.
The methods are grouped **logically**, from **basic to advanced**, with **clear explanations**.

---

# Java String Methods – Complete Notes

> **Class:** `java.lang.String`
> **Nature:** Immutable
> **Thread-safe:** Yes
> **Introduced in:** Java 1.0 (some methods added later)

---

## 1. String Creation & Basic Information

### `length()`

* Returns number of characters in the string

```java
str.length();
```

### `isEmpty()`

* Checks if string length is 0

```java
str.isEmpty();
```

### `isBlank()` *(Java 11+)*

* Returns true if string is empty or contains only whitespaces

```java
str.isBlank();
```

---

## 2. Character Access Methods

### `charAt(int index)`

* Returns character at given index (0-based)

```java
str.charAt(0);
```

### `toCharArray()`

* Converts string into character array

```java
char[] arr = str.toCharArray();
```

---

## 3. Comparison Methods

### `equals(Object obj)`

* Case-sensitive content comparison

```java
str1.equals(str2);
```

### `equalsIgnoreCase(String str)`

* Case-insensitive comparison

```java
str1.equalsIgnoreCase(str2);
```

### `compareTo(String str)`

* Lexicographical comparison

```java
str1.compareTo(str2);
```

### `compareToIgnoreCase(String str)`

* Lexicographical comparison ignoring case

---

## 4. Searching Methods

### `contains(CharSequence seq)`

* Checks if substring exists

```java
str.contains("java");
```

### `indexOf(char / String)`

* Returns first occurrence index

```java
str.indexOf('a');
```

### `lastIndexOf(char / String)`

* Returns last occurrence index

### `startsWith(String prefix)`

* Checks starting characters

### `endsWith(String suffix)`

* Checks ending characters

---

## 5. Substring & Extraction

### `substring(int beginIndex)`

* Extracts substring from index

### `substring(int beginIndex, int endIndex)`

* Extracts substring between indexes

```java
str.substring(1, 4);
```

---

## 6. Modification Methods (Return New String)

### `concat(String str)`

* Concatenates strings

```java
str.concat("World");
```

### `replace(char old, char new)`

* Replaces characters

### `replace(CharSequence old, CharSequence new)`

* Replaces substring

### `replaceAll(String regex, String replacement)`

* Regex-based replacement

### `replaceFirst(String regex, String replacement)`

* Replaces first regex match

---

## 7. Case Conversion

### `toUpperCase()`

* Converts to uppercase

### `toLowerCase()`

* Converts to lowercase

---

## 8. Whitespace Handling

### `trim()`

* Removes leading and trailing spaces

### `strip()` *(Java 11+)*

* Unicode-aware trim

### `stripLeading()` *(Java 11+)*

### `stripTrailing()` *(Java 11+)*

---

## 9. Splitting & Joining

### `split(String regex)`

* Splits string into array

### `split(String regex, int limit)`

* Controlled split

```java
str.split(",");
```

### `join(CharSequence delimiter, CharSequence... elements)`

* Joins multiple strings

```java
String.join("-", "A", "B", "C");
```

---

## 10. Conversion Methods

### `valueOf(anyType)`

* Converts primitive to String

```java
String.valueOf(100);
```

### `getBytes()`

* Converts to byte array

### `getBytes(Charset charset)`

* Encoding-specific conversion

---

## 11. Formatting & Interning

### `format(String format, Object... args)`

* Creates formatted string

```java
String.format("Age: %d", 25);
```

### `intern()`

* Adds string to String Constant Pool

---

## 12. Matching & Validation

### `matches(String regex)`

* Regex full-string match

```java
str.matches("[a-zA-Z]+");
```

---

## 13. Utility / Advanced Methods

### `repeat(int count)` *(Java 11+)*

* Repeats string

```java
"Hi".repeat(3); // HiHiHi
```

### `lines()` *(Java 11+)*

* Converts multiline string to Stream

---

## 14. Object Class Overrides

### `toString()`

* Returns string itself

### `hashCode()`

* Generates hash code

---

## 15. Important Interview Notes

* `String` is **immutable**
* Stored in **String Constant Pool**
* `==` compares **reference**
* `equals()` compares **content**
* Use `StringBuilder` for frequent modifications
* `StringBuffer` is thread-safe, slower

---

## 16. String vs StringBuilder vs StringBuffer

| Feature     | String    | StringBuilder | StringBuffer |
| ----------- | --------- | ------------- | ------------ |
| Mutability  | Immutable | Mutable       | Mutable      |
| Thread-safe | Yes       | No            | Yes          |
| Performance | Slow      | Fast          | Medium       |

---

## 17. Most Frequently Asked Interview Methods

* `equals()` vs `==`
* `substring()`
* `indexOf()`
* `split()`
* `replace()` vs `replaceAll()`
* `trim()` vs `strip()`
* `String` vs `StringBuilder`