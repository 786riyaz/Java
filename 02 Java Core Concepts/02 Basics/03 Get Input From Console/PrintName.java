// SumTwoNumbers.java
// A simple Java program to read two integers from the user and print their sum.
// Scanner :: is used to read input from the console.

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");

        sc.close();
    }
}
