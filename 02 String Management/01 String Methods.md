## 1. Basic Information Methods
* **length()** – Returns the number of characters in the string.
* **charAt(int index)** – Returns the character at the specified index.
* **isEmpty()** – Checks if the string length is 0.
* **isBlank()** – Checks if the string is empty or contains only white spaces.
---
## 2. Case Conversion
* **toUpperCase()** – Converts string to uppercase.
* **toLowerCase()** – Converts string to lowercase.
---
## 3. Comparison Methods
* **equals(String str)** – Compares two strings for exact match.
* **equalsIgnoreCase(String str)** – Compares strings ignoring case.
* **compareTo(String str)** – Lexicographical comparison.
* **compareToIgnoreCase(String str)** – Lexicographical comparison ignoring case.
* **contentEquals(CharSequence cs)** – Checks if content matches another sequence.
---
## 4. Searching Methods
* **contains(CharSequence s)** – Checks if substring exists.
* **startsWith(String prefix)** – Checks if string starts with prefix.
* **endsWith(String suffix)** – Checks if string ends with suffix.
* **indexOf(String str)** – Returns first index of substring.
* **indexOf(String str, int startIndex)** – Search from a position.
* **lastIndexOf(String str)** – Returns last index of substring.

## 5. Extraction and Substring
* **substring(int beginIndex)** – Substring from index.
* **substring(int beginIndex, int endIndex)** – Substring between indices.
---
## 6. Modification (Non-mutating: returns new String)
* **trim()** – Removes leading and trailing spaces.
* **strip()** – Unicode-aware trim.
* **stripLeading()** – Remove spaces at start.
* **stripTrailing()** – Remove spaces at end.
* **replace(char oldChar, char newChar)** – Replace all occurrences of a char.
* **replace(CharSequence target, CharSequence replacement)** – Replace substring.
* **replaceAll(String regex, String replacement)** – Replace using regex.
* **replaceFirst(String regex, String replacement)** – Replace first occurrence.
---
## 7. Splitting & Joining
* **split(String regex)** – Splits string into array.
* **split(String regex, int limit)** – Splits string with limit.
* **join(CharSequence delimiter, elements...)** – Joins strings with delimiter.
---
## 8. Conversion Methods
* **toCharArray()** – Converts string into character array.
* **getBytes()** – Converts to byte array (default charset).
* **valueOf(anyType)** – Converts value to string (static).
---
## 9. Formatting
* **format(String format, Object... args)** – Static method for formatted strings.
* **formatted(Object... args)** – Formats using placeholders (Java 15+).
---
## 10. Other Utility Methods
* **intern()** – Returns string from string pool.
* **repeat(int count)** – Repeats the string given number of times.
* **matches(String regex)** – Checks if entire string matches regex.
* **compareTo(String anotherString)** – Compare lexicographically.