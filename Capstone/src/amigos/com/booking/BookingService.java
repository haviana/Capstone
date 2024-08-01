package amigos.com.booking;

import amigos.com.user.User;

public class BookingService {


    BookingDao bookingDao = new BookingDao();
    public Booking[] getAllBookings(){
        return bookingDao.getAllBookings();

    }

    public boolean addBooking(User user){
        return bookingDao.getAllBookings();

    }
}
