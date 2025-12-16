# **1. for Loop Example**
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}
Explanation: Runs 5 times, printing numbers 1 to 5.

---

# **2. while Loop Example**
int i = 1;
while (i <= 5) {
    System.out.println("Number: " + i);
    i++;
}
Explanation: Continues running as long as the condition is true.

---

# **3. do-while Loop Example**
int i = 1;
do {
    System.out.println("Value: " + i);
    i++;
} while (i <= 5);
Explanation: Runs the loop body at least once, even if the condition is false.

---

# **4. Enhanced for Loop (for-each) Example**
int[] numbers = {10, 20, 30, 40};

for (int num : numbers) {
    System.out.println(num);
}
Explanation: Automatically loops through all elements of an array or collection.

---

# **5. break Statement Example**
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // Stops the loop completely
    }
    System.out.println(i);
}
Explanation: Loop stops when i becomes 5.

---

# **6. continue Statement Example**
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Skips this iteration
    }
    System.out.println(i);
}
Explanation: Skips printing 3 and continues with the rest.

---

# **7. Labeled Loop Example (break label)**
outer:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) {
            break outer; // Breaks the outer loop
        }
        System.out.println(i + " " + j);
    }
}
Explanation: When j becomes 2, it exits the outer loop entirely.

---

# **8. Labeled continue Example**
outer:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) {
            continue outer; // Goes to next iteration of outer loop
        }
        System.out.println(i + " " + j);
    }
}
Explanation: When j becomes 2, it skips rest of inner loop and restarts outer loop.