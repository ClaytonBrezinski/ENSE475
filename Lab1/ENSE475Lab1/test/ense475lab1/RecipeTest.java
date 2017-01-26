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
public class RecipeTest
{

    public RecipeTest()
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
     * Test of getRecipeName method, of class Recipe.
     */
    @Test
    public void testGetRecipeName()
    {
        System.out.println("getRecipeName");
        Recipe instance = null;
        String expResult = "";
        String result = instance.getRecipeName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMilkLevel method, of class Recipe.
     */
    @Test
    public void testGetMilkLevel()
    {
        System.out.println("getMilkLevel");
        Recipe instance = null;
        int expResult = 0;
        int result = instance.getMilkLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSugarLevel method, of class Recipe.
     */
    @Test
    public void testGetSugarLevel()
    {
        System.out.println("getSugarLevel");
        Recipe instance = null;
        int expResult = 0;
        int result = instance.getSugarLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoffeeLevel method, of class Recipe.
     */
    @Test
    public void testGetCoffeeLevel()
    {
        System.out.println("getCoffeeLevel");
        Recipe instance = null;
        int expResult = 0;
        int result = instance.getCoffeeLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
