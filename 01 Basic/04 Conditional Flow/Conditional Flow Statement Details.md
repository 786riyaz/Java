# Java Conditional Flow Statements

## 1. if Statement
* if(condition) - Executes a block only when the condition is true.

## 2. if-else Statement
* if(condition) { } else { } - Executes the first block if true; otherwise executes the second block.

## 3. else if Ladder
* else if(condition) - Adds multiple conditional checks in sequence.

## 4. Nested if
* if inside another if - Allows checking conditions inside other conditions.

---

# Switch Statement

## 5. switch Statement
* switch(variable) - Compares a variable against multiple constant values (cases).

## 6. case
* case value: - Executes its block when the value matches the switch expression.

## 7. break
* break - Exits the switch to prevent fall-through to the next case.

## 8. default
* default: - Executes when none of the case values match.

## 9. Enhanced Switch (Java 14+)
* switch(variable) -> - Arrow-based switch that is cleaner and does not require break.

Example:
`switch(day) { case 1 -> "Monday"; case 2 -> "Tuesday"; default -> "Invalid"; }`

---

# Ternary Operator
## 10. Ternary Operator
* condition ? value1 : value2 - Returns value1 if true; otherwise value2 (used as a compact if-else).

---

# Logical Operators used in Conditions
* && - Logical AND (both conditions must be true).
* || - Logical OR (at least one condition must be true).
* ! - Logical NOT (reverses the condition).