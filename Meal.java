/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 *This class does the calculation regarding meal
 * @author Sangeetha Detne
 */
public enum Meal {
    
    /**
     *This enum VEG contains the  value for the meal price
     */
    VEG(10),   

    /**
     *This enum NON_VEG contains the  value for the meal price
     */
    NON_VEG(11),   

    /**
     *This enum HINDU_MEAL contains the value for the meal price
     */
    HINDU_MEAL(13),   

    /**
     *This enum NO contains the value for the meal price
     */
    NO(0);   
    
    private final double mealPrice;
    
    /**
     * This is constructor with one parameter
     * @param mealPrice  takes the price of the meal
     */
    Meal(double mealPrice)
    {
    this.mealPrice=mealPrice;
    }

    /**
     *This is getter method the meal price 
     * @return price of the meal
     */
    public double getMealPrice() {
        return mealPrice;
    }

    
}
