// SumTwoNumbers.java
// A simple Java program to read two integers from the user and print their sum.
// Scanner :: is used to read input from the console.

import java.util.Scanner;

public class PrintStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Statement to Submit : ");
        String statement = sc.nextLine();
        System.out.println("You submitted: " + statement);

        sc.close();
    }
}
