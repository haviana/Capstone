package amigos.com.booking;

import amigos.com.car.Car;
import amigos.com.user.User;

import java.time.LocalDate;
import java.util.UUID;

public record Booking(UUID bookingId, User user, LocalDate bookingTime, Car car, boolean isCanceled) {

    public Booking(User user, LocalDate bookingTime, Car car, boolean isCanceled) {

        this(UUID.randomUUID(), user, bookingTime, car, isCanceled);
    }
}
