/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

/**
 * This class has different methods for calculation and toString method 
 * @author Sangeetha Detne
 */
public class Reservation {
    
    private Route Route;
    private Airline Airline;
    private String cabin;
    private Hotel hotel;
    private Meal Meal;
    
    /**
      This is a parameterized constructor which takes route,Airline,cabin,hotel,Meal as parameter
     * @param Route stores route value
     * @param Airline DELTA
     * @param cabin ECONOMY
     * @param hotel  NO
     * @param Meal  VEG
     */
    
   Reservation(Route Route,Airline Airline,String cabin,Hotel hotel,Meal Meal)
   {
   this.Route=Route;
   this.Airline=Airline;
   this.cabin=cabin;
   this.hotel=hotel;
   this.Meal=Meal;
   }

    /**
     *This is getter method for route
     * @return route
     */
    public Route getRoute() {
        return Route;
    }
    
    /**
     *This is method for calculating airFare if it is weekdays then discount is given
     * else discount isn't given
     * @return airfare
     */
    public double calcAirlinefare()
    {
       if(!Route.isWeekend())
       {
           if(cabin.toLowerCase().equals("economy"))
            {
                return Airline.getEconomyPrice()- Airline.getEconomyPrice() * Airline.getDiscountFactor() / 100;
            } else 
            {
                return Airline.getBusinessPrice() - Airline.getBusinessPrice() * Airline.getDiscountFactor() / 100;
            }
        }
       else 
       {
            if (cabin.toLowerCase().equals("economy")) 
            {
                return Airline.getEconomyPrice();
            } 
            else 
            {
                return Airline.getBusinessPrice();
            }
        }
               
    }
    
    /**
     *This is method to calculate room cost 
     * @return room cost
     */
    public double calcRoomCost(){
        return hotel.getRoomCost();
    } 
    
    /**
     *This is to calculate the meal cost
     * @return cost of meal
     */
    public double calcMealPrice(){
       return  Meal.getMealPrice();
    } 

    /**
     *This is to calculate totalFare
     * @return total cost of the  fare
     */
    public double calcTotalFare(){
     return calcAirlinefare()+calcRoomCost()+calcMealPrice();
    }
    @Override
    public String toString(){
   return "From : "+Route.getSource()+", To : "+Route.getDestination()+", "
           + "Departing On : "+Route.getDepartingDate()
                +", Returning On : "+Route.getReturningDate()+", Airline : "+Airline+
                         ", Cabin : "+cabin+", Hotel : "+hotel+", Meal : "+Meal+
           ", Total fare : "+"$"+calcTotalFare();
        }
}
