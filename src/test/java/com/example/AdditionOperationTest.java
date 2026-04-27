package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionOperationTest {
@Test
public void testAddition() {
    double num1 = 5;
    double num2 = 10;

    double expected = 15;
    double actual = num1 + num2;

    assertEquals(expected, actual, 0.01);
}

}



