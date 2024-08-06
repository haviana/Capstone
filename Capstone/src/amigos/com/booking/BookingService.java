package amigos.com.booking;

import amigos.com.car.Car;
import amigos.com.car.CarService;
import amigos.com.user.User;

import java.time.LocalDate;
import java.util.UUID;

public class BookingService {
    BookingDao bookingDao = new BookingDao();
    CarService carService = new CarService();

    public Booking[] getAllBookings() {
        return bookingDao.getAllBookings();

    }

    public void addBooking(User user, String regNumber) {
        Car car = carService.getCarById(regNumber);

        Booking booking = new Booking(user, LocalDate.now(), car, false);
        bookingDao.addBooking(booking);
        carService.deleteById(regNumber);

    }

    public Booking[] getBookingByUserId(UUID uuid) {
        return bookingDao.getBookingByUserId(uuid);

    }
}
