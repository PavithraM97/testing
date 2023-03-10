/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pmadu
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int no1 = 2;
        int no2 = 3;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.add(no1, no2);
        assertEquals(expResult, result);
     
    }
    
    public void testAddNegative(){
       System.out.println("add Negatives");
        int no1 = -5;
        int no2 = -3;
        Calculator instance = new Calculator();
        int expResult = -8;
        int result = instance.add(no1, no2);
        assertEquals(expResult, result);  
    }
    
}
