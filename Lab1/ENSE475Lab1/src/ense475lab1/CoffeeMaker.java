/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense475lab1;
import java.util.ArrayList;
/**
 * Author: tdouglas
 */
/**
 * CoffeeMaker constructor
 *
 * The inventory should be created and filled up.
 */
public class CoffeeMaker
{

    public static final int MAX_NUM_RECIPES = 4; // Maximum number of recipes
    public static final int MAX_INVENTORY = 20;
    private ArrayList<Recipe> recipeArray; // This is the array of recipes
    private int numRecipes = 0;
    private Inventory inventory; // This is our inventory in the coffee maker

    /**
     * Constructor for the coffee maker The inventory should be created and
     * filled.
     */
    public CoffeeMaker()
    {
        //Setup inventory
        this.inventory = new Inventory();
    }

    /**
     * Getter of the property <tt>inventory</tt>
     *
     * @return Returns the inventory.
     */
    public Inventory getInventory()
    {
        return inventory;
    }

    /**
     * addRecipe Method
     *
     * @param Recipe Will add a recipe if possible
     * @return true or false
     */
    public boolean addRecipe(Recipe rAdd)
    {
        return false;
    }

    /**
     * getRecipe Method
     *
     * @param Recipe name String
     * @return Recipe or NULL
     */
    public Recipe getRecipe(String recipeName)
    {
        for (int i = 0; i < this.recipeArray.size(); i++)
        {
            if (this.recipeArray.get(i).getRecipeName().equalsIgnoreCase(recipeName))
            {
                return this.recipeArray.get(i);
            }
        }
        return null;
    }

    /**
     * deleteRecipe Method
     *
     * @param Recipe Will delete a recipe if possible
     * @return true or false
     */
    public boolean deleteRecipe(String recipeName)
    {
        return false;
    }

    /**
     * makeCoffee Method
     *
     * @param recipeName Will make the coffee if the recipe is there
     * @return true or false
     */
    public boolean makeCoffee(String recipeName)
    {
        return false;
    }

}
