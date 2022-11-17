/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pwo.seq;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author natal
 */
class LucasGeneratorTest {
    Generator instance;

    @BeforeEach
    public void setup() {
        instance = new LucasGenerator();
    }

    @Test
    public void testReset() {
        System.out.println("reset");
        instance.reset();
        BigDecimal expResult = new BigDecimal(2);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);
    }

    @Test
    public void testNextTerm() {
        instance.nextTerm();
        BigDecimal expResult = new BigDecimal(1);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);
    }

    @Test
    void testGetTerm() {
        BigDecimal expResult = new BigDecimal(123);
        BigDecimal result = instance.getTerm(10);
        assertEquals(expResult, result);
    }
}