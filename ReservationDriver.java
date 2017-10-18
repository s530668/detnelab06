/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *This is class has main method and takes inputFile.txt and shows the output
 * @author Sangeetha Detne
 */
public class ReservationDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //Declare and initialize a scanner object to read from the file "inputFile.txt"
          Scanner scr = new Scanner(new File("inputFile.txt"));
        
        //create an object for ReservationList named as "reservationList"
        ReservationList reserveList = new ReservationList();
        
        //While inputFile.txt has more data(While loop starts here) {
        //Read in the data
        
        while (scr.hasNext()) {        
        
        Route route = new Route(scr.next(), scr.next(), scr.next(), scr.next());
        Reservation reservation = new Reservation(route, Airline.valueOf(scr.next()), scr.next(), Hotel.valueOf(scr.next()), Meal.valueOf(scr.next()));
        
        reserveList.addReservation(reservation);
        }
        System.out.println("**************************************************"
                + "****************************************\n" +
                "Reservation List\n" +
                "**************************************************"
                + "****************************************");
        for(Reservation r: reserveList.getReserveList()){
            System.out.println(r);
        }
        System.out.println("");
        System.out.println("*********************************************"
                + "*******************************************\n" +
                "Reservations that have source location \"DAL\"\n" +
                "*************************************************"
                + "*****************************************");
        for(Reservation r: reserveList.findAllSourceLocations("DAL"))
        {
            System.out.println(r);
        }
        System.out.println("");
        System.out.println("************************************************"
                + "******************************************\n" +
                 "Reservations that have source location \"MCI\"\n" +
                 "*****************************************************"
                + "***************************************"); 
        for(Reservation r: reserveList.findAllSourceLocations("MCI"))
        {
            System.out.println(r);
        }
        //create an object for Route named as "route" and 
        //initialize the multiple argument constructor with the values from file.
        
        /*create an object for Reservation named as "reservation" 
         and initialize the multiple argument constructor with the values from file.
         Hint: use valueOf() method while passing the String where enum is required.
         For example, to pass DELTA from input file to Reservation constructor, use Airline.valueOf("DELTA").*/
            
        // Invoke addReservation method on reservationList object and add reservation.
           

        
        // }While Loop ends here

        /*Use an enhanced for loop and iterate through getReserveList() method  on reservationList object.
         and print the reservations.
        */

        /*Use an enhanced for loop and iterate through findAllSourceLocations() method on reservationList object.
         pass "DAL" as parameter.
         and print the reservations.
        */

        /*Use an enhanced for loop and iterate through findAllSourceLocations() method on reservationList object.
         pass "MCI" as parameter.
         and print the reservations.
        */
    }
    
}
