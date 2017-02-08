/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package ense475lab2;

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
public class CoffeeMakerTest {

    public CoffeeMakerTest() {
    }

    /**
     * Test of deleteRecipe method, of class CoffeeMaker.
     */
    @Test
    public void testDeleteRecipe() {
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
    public void testMakeCoffee() {
        System.out.println("makeCoffee");
        Recipe a = new Recipe("a", 1, 1, 1, 0, 0, 0);
        CoffeeMaker instance = new CoffeeMaker();
        instance.addRecipe(a);

        boolean expResult = true;
        boolean result = instance.makeCoffee(a.getRecipeName());
        assertEquals(expResult, result);

        assertEquals(instance.MAX_INVENTORY - 1, instance.getInventory().getCoffee());
        assertEquals(instance.MAX_INVENTORY - 1, instance.getInventory().getMilk());
        assertEquals(instance.MAX_INVENTORY - 1, instance.getInventory().getSugar());
    }

    @Test
    public void testAdd4Recipes() {
        System.out.println("testAdd4Recipes");
        Recipe a = new Recipe("a", 2, 2, 2, 0, 0, 0);
        Recipe b = new Recipe("b", 1, 1, 1, 0, 0, 0);
        Recipe c = new Recipe("c", 0, 0, 2, 0, 0, 0);
        Recipe d = new Recipe("d", 3, 0, 0, 0, 0, 0);

        CoffeeMaker instance = new CoffeeMaker();

        instance.addRecipe(a);
        instance.addRecipe(b);
        instance.addRecipe(c);
        instance.addRecipe(d);

        Recipe result = instance.getRecipe(a.getRecipeName());
        assertEquals(a, result);
        result = instance.getRecipe(b.getRecipeName());
        assertEquals(b, result);
        result = instance.getRecipe(c.getRecipeName());
        assertEquals(c, result);
        result = instance.getRecipe(d.getRecipeName());
        assertEquals(d, result);
    }

    @Test
    public void testAdd5Recipes() {
        System.out.println("testAdd5Recipes");
        Recipe a = new Recipe("a", 2, 2, 2, 0, 0, 0);
        Recipe b = new Recipe("b", 1, 1, 1, 0, 0, 0);
        Recipe c = new Recipe("c", 0, 0, 2, 0, 0, 0);
        Recipe d = new Recipe("d", 3, 0, 0, 0, 0, 0);
        Recipe e = new Recipe("d", 3, 3, 3, 0, 0, 0);

        CoffeeMaker instance = new CoffeeMaker();

        instance.addRecipe(a);
        instance.addRecipe(b);
        instance.addRecipe(c);
        instance.addRecipe(d);
        boolean result = instance.addRecipe(e);
        boolean expResult = false;

        assertEquals(expResult, result);
    }

    @Test
    public void testEditRecipe() {
        System.out.println("testEditRecipe");
        Recipe a = new Recipe("a", 2, 2, 2, 0, 0, 0);
        Recipe b = new Recipe("b", 1, 1, 1, 0, 0, 0);

        CoffeeMaker instance = new CoffeeMaker();

        instance.addRecipe(a);
        boolean result = instance.editRecipe(b);
        boolean expResult = true;

        assertEquals(expResult, result);
        assertEquals(b, instance.getRecipe("b"));
    }

    @Test
    public void testAddInventory() {
        System.out.println("testAddInventory");
        Inventory a = new Inventory();
        Inventory b = new Inventory();
        CoffeeMaker instance = new CoffeeMaker();
        instance.addInventory(a);
        instance.addInventory(b);
    }
}
