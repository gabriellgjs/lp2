import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import Class.Reservation;

public class AppReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Room number: ");
        int roomNumber = sc.nextInt();
        
        try {
            System.out.println("Check-in (dd/MM/yyyy):");
            Date checkInFormated = Reservation.dateFormat.parse(sc.next());
            
            System.out.println("Check-out (dd/MM/yyyy):");
            Date checkoutFormated = Reservation.dateFormat.parse(sc.next());
            
            Reservation reservation = new Reservation(roomNumber, checkInFormated, checkoutFormated);
            System.out.println(reservation.toString());
            
            System.out.println("New Check-in (dd/MM/yyyy):");
            Date newCheckInFormated = Reservation.dateFormat.parse(sc.next());
            
            System.out.println("New Check-out (dd/MM/yyyy):");
            Date newCheckoutFormated = Reservation.dateFormat.parse(sc.next());
            reservation.updateCheckInAndCheckOut(newCheckInFormated, newCheckoutFormated);
            System.out.println(reservation.toString()); 

        } catch (ParseException error) {
            System.out.println("Format date invalid: " + error.getMessage());
        } finally {
            sc.close();
        }        
    }
}
