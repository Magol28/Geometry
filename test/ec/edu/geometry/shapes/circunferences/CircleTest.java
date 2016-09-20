/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.geometry.shapes.circunferences;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel_Angel
 */
public class CircleTest {
    
    public CircleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of area method, of class Circle.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Circle instance = new Circle(5f);
        Float expResult = (float)(25*Math.PI);
        Float result = instance.area();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of perimeter method, of class Circle.
     */
    @Test
    public void testPerimeter() {
        System.out.println("perimeter");
        Circle instance = new Circle(4f);
        Float expResult = (float) (Math.PI*2*5);
        Float result = instance.perimeter();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
     
    
}
