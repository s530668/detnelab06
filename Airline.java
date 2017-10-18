/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * This class has getter and setter  methods 
 * @author s530668
 */
public enum Airline {
    
    /**
     *This enum DELTA contains the values of the economy
     * class price, business class price and discount
     */
    DELTA(750, 1500, 10),

    /**
     *This enum US_AIRWAYS contains the  values of the economy
     * class price, business class price and discount
     */
    US_AIRWAYS(570, 1400, 11),

    /**
     *This enum UNITED contains the values of the economy
     * class price, business class price and discount
     */
    UNITED(700, 1450, 9),

    /**
     *This enum CATHAY_PACIFIC contains the values of the economy
     * class price, business class price and discount
     */
    CATHAY_PACIFIC(710, 1480, 8),

    /**
     *This enum AIR_CANADA contains the  values of the economy
     * class price, business class price and discount
     */
    AIR_CANADA(640, 1590, 10),

    /**
     *This enum AMERICAN_AIRLINES contains the of the economy
     * class price, business class price and discount
     */
    AMERICAN_AIRLINES(560, 1200, 6),

    /**
     *This enum AIR_FRANCE contains the values of the economy
     * class price, business class price and discount
     */
    AIR_FRANCE(450, 1100, 5),

    /**
     *This enum AIR_INDIA contains the values of the economy
     * class price, business class price and discount
     */
    AIR_INDIA(590, 1080, 9),

    /**
     *This enum JETBLUE contains the values of the economy
     * class price, business class price and discount
     */
    JETBLUE(430, 890, 5),

    /**
     *This enum QANTAS contains the values of the economy
     * class price, business class price and discount
     */
    QANTAS(670, 1200, 9);
    
    private final double economyPrice;
    private final double businessPrice;
    private final double discountFactor;
    
    /**
     * This is parameterized constructor which takes 3 parameters
     * @param economy type of cabin
     * @param business type of cabin
     * @param discount  discount for the cabins chosen
     */
    Airline(double economy,double business,double discount)
    
    {
        this.economyPrice=economy;
        this.businessPrice= business;
        this.discountFactor=discount;
    }

    /**
     *This is getter method for the economy price
     * @return economy price
     */
    public double getEconomyPrice() {
        return economyPrice;
    }

    /**
     *This is getter method for the business price
     * @return businessPrice
     */
    public double getBusinessPrice() {
        return businessPrice;
    }

    /**
     *This is getter method for the discount 
     * @return discountFactor
     */
    public double getDiscountFactor() {
        return discountFactor;
    }
    
    
}
