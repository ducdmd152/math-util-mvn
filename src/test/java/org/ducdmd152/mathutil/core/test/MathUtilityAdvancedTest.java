package org.ducdmd152.mathutil.core.test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.ducdmd152.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author MSI
 */
public class MathUtilityAdvancedTest {
    
    public static Object[][] initTestData() {
        Object testData[][] = { // gán cứng value
            {0, 1},
            {1, 1},
            {2, 2},
            {4, 24},
            {5, 120},
            {6, 720}
        };
        return testData;
    }
    
//    @Test
    @ParameterizedTest                                      // col 0    cot 1
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
    
}
