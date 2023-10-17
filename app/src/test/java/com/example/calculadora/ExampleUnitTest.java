package com.example.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Object calculadora;

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testAdd2Operands() {
        int total = calculadora.calculate("5 + 3");
        assertEquals("Addition operation not working correctly", 8, total);
    }

    @Test
    public void testAdd1Operand() {
        int total = calculadora.calculate("4 + 3 + 1");
        assertEquals("Addition operation not working correctly", 8, total);
    }

    @Test
    public void testMult2Operands() {
        int total = calculadora.calculate("4 * 2");
        assertEquals("Multiplication operation not working correctly", 8, total);
    }

    @Test
    public void test1() {
        int total = calculadora.calculate("2 * 3");
        assertEquals("Multiplication operation not working correctly", 6, total);
    }

    @Test
    public void test2() {
        int total = calculadora.calculate("1 * 2 * 8");
        assertEquals("Multiplication operation not working correctly", 16, total);
    }

    @Test
    public void test3() {
        int total = calculadora.calculate("2 * 2 + 3");
        assertEquals("Addition and multiplication operations not working correctly", 7, total);
    }

    @Test
    public void test5() {
        int total = calculadora.calculate("3 + 2 * 2 + 4");
        assertEquals("Addition and multiplication operations not working correctly", 11, total);
    }
}
