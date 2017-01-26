/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense475lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author clayt
 */
public class InventoryTest
{
    
    public InventoryTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getMilk method, of class Inventory.
     */
    @Test
    public void testGetMilk()
    {
        System.out.println("getMilk");
        Inventory instance = new Inventory();
        int expResult = 0;
        int result = instance.getMilk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMilk method, of class Inventory.
     */
    @Test
    public void testSetMilk()
    {
        System.out.println("setMilk");
        int milk = 0;
        Inventory instance = new Inventory();
        instance.setMilk(milk);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoffee method, of class Inventory.
     */
    @Test
    public void testGetCoffee()
    {
        System.out.println("getCoffee");
        Inventory instance = new Inventory();
        int expResult = 0;
        int result = instance.getCoffee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoffee method, of class Inventory.
     */
    @Test
    public void testSetCoffee()
    {
        System.out.println("setCoffee");
        int coffee = 0;
        Inventory instance = new Inventory();
        instance.setCoffee(coffee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSugar method, of class Inventory.
     */
    @Test
    public void testGetSugar()
    {
        System.out.println("getSugar");
        Inventory instance = new Inventory();
        int expResult = 0;
        int result = instance.getSugar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSugar method, of class Inventory.
     */
    @Test
    public void testSetSugar()
    {
        System.out.println("setSugar");
        int sugar = 0;
        Inventory instance = new Inventory();
        instance.setSugar(sugar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
