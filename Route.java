/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *This class has different variables and methods to calculate.
 * @author Sangeetha Detne
 */
public class Route {
    
    private String Source;
    private String destination;
    private String departingDate;
    private String  returningDate;
    
    /**
     * This is parameterized constructor with four parameters
     * @param source MCI
     * @param destination HYD
     * @param departingDate 10/10/2017
     * @param returningDate 10/12/2017
     */
    Route(String source,String destination,String departingDate,String  returningDate)
    {
    this.Source=source;
    this.destination=destination;
    this.departingDate=departingDate;
    this.returningDate=returningDate;
    }

    /**
     *This is getter method for the sourceLocation
     * @return source
     */
    public String getSource() {
        return Source;
    }

    /**
     *This is setter method for the sourceLocation
     * @param Source stores the source location
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     *This is getter method for the destination 
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * This is setter method the destination 
     * @param destination stores the destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     *This is getter method the departing date
     * @return departingDate
     */
    public String getDepartingDate() {
        return departingDate;
    }

    /**
     *This is setter method the departing date
     * @param departingDate stores the departingDate
     */
    public void setDepartingDate(String departingDate) {
        this.departingDate = departingDate;
    }

    /**
     *This is getter method for the returning date 
     * @return returning date
     */
    public String getReturningDate() {
        return returningDate;
    }

    /**
     *This is setter method for the returning date 
     * @param returningDate stores the returning date
     */
    public void setReturningDate(String returningDate) {
        this.returningDate = returningDate;
    }
    
    /**
     *This is a method for the day of the week(enum)
     * @param dow day of the week 
     * @return day
     */
    public DayOfWeek getDay(String dow)
    {
      int month=Integer.parseInt(dow.substring(0,2));
      int date=Integer.parseInt(dow.substring(3,5));
      int year=Integer.parseInt(dow.substring(6));
      LocalDate ld=LocalDate.of(year,month,date);
      DayOfWeek day=ld.getDayOfWeek();
      return day;
    }

    /**
     *This is isWeekend method and checks whether the departing date and returning date are weekends
     * @return true/false
     */
    public boolean isWeekend()
     {
         DayOfWeek dd=getDay(getDepartingDate());
         DayOfWeek rd=getDay(getReturningDate());
         if((dd==DayOfWeek.FRIDAY||dd==DayOfWeek.SATURDAY||dd==DayOfWeek.SUNDAY)||(rd==DayOfWeek.FRIDAY||rd==DayOfWeek.SATURDAY||rd==DayOfWeek.SUNDAY))
             return true;
         else 
             return false;
     }
     
    @Override
     public String toString()
     {
        return"From : MCI, To : "+getSource()+", Departing On : "+getDepartingDate()+", Returning On : "+getReturningDate();
     }
    
}
