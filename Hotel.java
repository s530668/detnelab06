/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 *This class gets the room cost and sets it.
 * @author Sangeetha Detne
 */
public enum Hotel {
    
    /**
     *This enum SINGLE contains the value for the room cost
     */
    SINGLE(150),

    /**
     *This enum DOUBLE contains the value for the room cost
     */
    DOUBLE(200),

    /**
     *This enum KING contains the value for the room cost
     */
    KING(250),

    /**
     *This enum QUEEN contains the value for the room cost
     */
    QUEEN(300),

    /**
     *This enum NO contains the for the room cost
     */
    NO(0);
    
    private final double roomCost;

    /**
     *This is getter method for the roomCost 
     * @return roomCost
     */
    public double getRoomCost() {
        return roomCost;
    }
    
    /**
     * This is constructor with one parameter
     * @param roomCost  stores the roomcost
     */
    Hotel(double roomCost)
    {
        this.roomCost=roomCost;
    }
    
}
