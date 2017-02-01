/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense475lab1;

/**
 *
 * @author clayt
 */
public class ENSE475Lab1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Recipe a = new Recipe("double Double", 2, 2, 2);
        Recipe b = new Recipe("regular", 1, 1, 1);
        Recipe c = new Recipe("black", 0, 0, 2);
        Recipe d = new Recipe("milk", 3, 0, 0);
        Recipe e = new Recipe("abomination", 3, 3, 2);
        
        CoffeeMaker keurig = new CoffeeMaker();
        
        keurig.addRecipe(a);
        keurig.addRecipe(b);
        keurig.addRecipe(c);
        keurig.addRecipe(d);
        keurig.addRecipe(e);
    }

}
