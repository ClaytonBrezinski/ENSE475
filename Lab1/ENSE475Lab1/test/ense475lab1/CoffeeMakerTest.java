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
public class CoffeeMakerTest
{

    public CoffeeMakerTest()
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
     * Test of getInventory method, of class CoffeeMaker.
     */
    @Test
    public void testGetInventory()
    {
        System.out.println("getInventory");
        CoffeeMaker instance = new CoffeeMaker();
        Inventory expResult = null;
        Inventory result = instance.getInventory();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addRecipe method, of class CoffeeMaker.
     */
    @Test
    public void testAddRecipe()
    {
        System.out.println("addRecipe");
        Recipe rAdd = null;
        CoffeeMaker instance = new CoffeeMaker();
        boolean expResult = false;
        boolean result = instance.addRecipe(rAdd);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRecipe method, of class CoffeeMaker.
     */
    @Test
    public void testGetRecipe()
    {
        System.out.println("getRecipe");
        String recipeName = "";
        CoffeeMaker instance = new CoffeeMaker();
        Recipe expResult = null;
        Recipe result = instance.getRecipe(recipeName);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteRecipe method, of class CoffeeMaker.
     */
    @Test
    public void testDeleteRecipe()
    {
        System.out.println("deleteRecipe");
        String recipeName = "";
        CoffeeMaker instance = new CoffeeMaker();
        boolean expResult = false;
        boolean result = instance.deleteRecipe(recipeName);
        assertEquals(expResult, result);
    }

    /**
     * Test of makeCoffee method, of class CoffeeMaker.
     */
    @Test
    public void testMakeCoffee()
    {
        System.out.println("makeCoffee");
        String recipeName = "";
        CoffeeMaker instance = new CoffeeMaker();
        boolean expResult = false;
        boolean result = instance.makeCoffee(recipeName);
        assertEquals(expResult, result);
    }

}
