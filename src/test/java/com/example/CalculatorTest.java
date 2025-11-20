package com.example.app;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    
    private final Calculator calculator = new Calculator();
    
    @Test
    void testAdd() {
        assertThat(calculator.add(2, 3)).isEqualTo(5);
        assertThat(calculator.add(-1, 1)).isEqualTo(0);
    }
    
    @Test
    void testSubtract() {
        assertThat(calculator.subtract(5, 3)).isEqualTo(2);
        assertThat(calculator.subtract(3, 5)).isEqualTo(-2);
    }
    
    @Test
    void testMultiply() {
        assertThat(calculator.multiply(4, 5)).isEqualTo(20);
        assertThat(calculator.multiply(-2, 3)).isEqualTo(-6);
    }
    
    @Test
    void testDivide() {
        assertThat(calculator.divide(10, 2)).isEqualTo(5.0);
        assertThat(calculator.divide(5, 2)).isEqualTo(2.5);
    }
    
    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, 
            () -> calculator.divide(10, 0));
    }
}
