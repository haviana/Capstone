package amigos.com.booking;

import java.util.Arrays;

public class BookingDao {
     private Booking[] bookings = new Booking[10];
     private int numBookings = 0;

     public void addBooking(Booking booking){

         bookings[numBookings++] = booking;
         System.out.println("Booking $booking added");

     }

    public void deleteBooking(int id){

        bookings[id] = null;
        System.out.println("Booking $booking removed");

    }

    public Booking[] getAllBookings(){

        return Arrays.stream(bookings).filter(x->x !=null).toArray(Booking[]::new);

    }
}
