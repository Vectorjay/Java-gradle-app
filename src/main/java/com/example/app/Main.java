package com.example.app;

import com.example.app.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Simple Java App!");
        
        // Demonstrate calculator
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        System.out.println("5 + 3 = " + result);
        
        // Demonstrate JSON serialization
        try {
            User user = new User("John Doe", "john@example.com");
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(user);
            System.out.println("User as JSON: " + json);
        } catch (Exception e) {
            System.err.println("Error serializing user: " + e.getMessage());
        }
        
        // Demonstrate other operations
        System.out.println("10 * 2 = " + calculator.multiply(10, 2));
        System.out.println("15 - 7 = " + calculator.subtract(15, 7));
    }
}
