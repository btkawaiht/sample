package com.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class CalculatorTest extends Calculator {

    @Test
    public void testAdd() {
        int actual = Calculator.add(1, 2);
        assertThat(actual, is(3));
    }

    @Test
    public void testAdd2() {
        int actual = Calculator.add(1, 5);
        assertThat(actual, is(6));
    }
    

}