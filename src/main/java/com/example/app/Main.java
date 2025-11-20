package com.example.app;

import com.example.app.model.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Simple Java App!");
        
        // Demonstrate calculator
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        System.out.println("5 + 3 = " + result);
        
        // Demonstrate User object without JSON
        User user = new User("John Doe", "john@example.com");
        System.out.println("User: " + user);
        
        // Demonstrate other operations
        System.out.println("10 * 2 = " + calculator.multiply(10, 2));
        System.out.println("15 - 7 = " + calculator.subtract(15, 7));
        
        try {
            System.out.println("10 / 2 = " + calculator.divide(10, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Division error: " + e.getMessage());
        }
    }
}
