/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.util.ArrayList;

/**
 *This class has different methods which adds the elements in the arrayList
 * and does the calculation
 * @author s530668
 */
public class ReservationList {
    
    private ArrayList <Reservation> reserveList=new ArrayList<>();
    
    /**
     *This is an array list of type reservation
     * @return reserveList
     */
    public ArrayList<Reservation> getReserveList() {
        return reserveList;
    }
   
    /**
     *This is non parameterized constructor
     */
    public ReservationList(){}
    
    /**
     *This method add reservation to the list
     * @param Reservation takes reservation
     */
    public void addReservation(Reservation Reservation){
        reserveList.add(Reservation);
    } 

    /**
     *This method takes position and reservation as input and checks whether 
     * the position is less than reserve list or not
     * if it is less, then adds elements to the reserveList
     * @param position position to be added
     * @param Reservation takes the reservation
     */
    public void addReservation(int position,Reservation Reservation)
    {
        if(position<=reserveList.size())
        {
            reserveList.add(position,Reservation);
        }
        
    }

    /**
     *This method validates the source location with the arrayList and 
     * stores it in matchedList
     * @param sourceLocation takes sourceLocation as input
     * @return matched list of array
     */
    public ArrayList<Reservation> findAllSourceLocations(String sourceLocation)
    {
        ArrayList <Reservation> matchedList1=new ArrayList<>();
       for(int i=0;i<reserveList.size();i++)
       {
           if(reserveList.get(i).getRoute().getSource().equals(sourceLocation))
               matchedList1.add(reserveList.get(i));
       }
       return matchedList1;
    }

  }
