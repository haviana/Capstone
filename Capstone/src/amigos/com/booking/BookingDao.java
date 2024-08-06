package amigos.com.booking;

import java.util.Arrays;
import java.util.UUID;

public class BookingDao {
    private static Booking[] bookings = new Booking[5];

    private int numBookings = 0;

    public void addBooking(Booking booking) {
        this.bookings[numBookings++] = booking;
        System.out.println("Booking $booking added");

    }

    public void deleteBooking(int id) {
        this.bookings[id] = null;
        System.out.println("Booking $booking removed");

    }

    public Booking[] getAllBookings() {
        return Arrays.stream(bookings).filter(x -> x != null).toArray(Booking[]::new);

    }

    public Booking[] getBookingByUserId(UUID uuid) {
        if (this.bookings == null || this.bookings.length == 0)
            return null;
        return Arrays.stream(this.bookings).filter(x -> x != null && x.user().uuid().equals(uuid)).toArray(Booking[]::new);

    }
}
