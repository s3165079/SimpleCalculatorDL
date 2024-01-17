// SimpleCalculatorApplication.java
// D. Singletary
// 1/9/2024
// Template for calculator application

// Terra Brown
// 01/16/2024
// Add arithmetic methods to the calculator

package edu.fscj.cen3024c.simplecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleCalculatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleCalculatorApplication.class, args);

        // Test the multiply function
        int number1 = 10; // This can be input from the user or arguments
        int number2 = 5; // This can be input from the user or arguments
        int result = multiply(number1, number2);
        System.out.println("Multiply result is: " + result);

        // Test the divide function
        result = divide(number1, number2);
        System.out.println("Divide result is: " + result);

        // Test the add function
        result = add(number1, number2);
        System.out.println("Add result is: " + result);

        // Test the subtract function
        result = subtract(number1, number2);
        System.out.println("Add result is: " + result);
    }

    // Multiply two numbers
    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    // Divide two numbers
    public static int divide(int number1, int number2) {
        return number1 / number2;
    }

    // Add two numbers
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    // Subtract two numbers
    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }
}
