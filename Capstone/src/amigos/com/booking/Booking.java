package amigos.com.booking;

import amigos.com.user.User;

import java.time.LocalDate;
import java.util.UUID;

public record Booking(UUID bookingId, User user, LocalDate bookingTime, boolean isCanceled) {

    public Booking(User user, LocalDate bookingTime, boolean isCanceled) {

        this(UUID.randomUUID(), user, bookingTime, isCanceled);
    }
}
