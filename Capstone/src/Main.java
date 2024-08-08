import amigos.com.booking.Booking;
import amigos.com.booking.BookingDao;
import amigos.com.booking.BookingService;
import amigos.com.car.Car;
import amigos.com.car.CarDao;
import amigos.com.car.CarService;
import amigos.com.user.User;
import amigos.com.user.UserArrayDataAccessService;
import amigos.com.user.UserFileDataAccessService;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        CarDao carDao = new CarDao();
        BookingDao bookingDao = new BookingDao();

        UserArrayDataAccessService userService = new UserArrayDataAccessService();
        CarService carService = new CarService(carDao);
        BookingService bookingService = new BookingService(bookingDao, carService);

        UserFileDataAccessService userFileDataAccessService = new UserFileDataAccessService();
        for (User allUser : userFileDataAccessService.getAllUsers()) {
            System.out.println(allUser);
        }

        int option;
        do {
            printMenu();
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    for (Car car : carService.getAllCars()) {
                        System.out.println(car);
                    }
                    String regNumber = scanner.nextLine();

                    System.out.println("User ID: ");
                    UUID userId = UUID.fromString(scanner.nextLine());
                    User userToBook = userService.getUserByID(userId);

                    bookingService.addBooking(userToBook, regNumber);
                    break;
                case 2:
                    System.out.println("UUID:");
                    UUID uuid = UUID.fromString(scanner.nextLine());
                    for (Booking booking : bookingService.getBookingByUserId(uuid) ) {
                        System.out.println(booking);
                    }
                    break;
                case 3:
                    for (Booking booking : bookingService.getAllBookings()) {
                        System.out.println(booking);
                    }
                    break;
                case 4:
                    for (Car car : carService.getAllCars()) {
                        System.out.println(car);
                    }
                    break;
                case 5:
                    for (Car car : carService.getAllEletricCars()) {
                        System.out.println(car);
                    }
                    break;
                case 6: {
                    for (User user : userService.getAllUsers()) {
                        System.out.println(user);
                    }
                    break;
                }
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println(option + " invalid option");
            }

        } while (option != 7);

    }

    private static void printMenu() {
        System.out.println("1 - Book Car");
        System.out.println("2 - View All User Booked Cars");
        System.out.println("3 - View All Bookings");
        System.out.println("4 - View Available Cars");
        System.out.println("5 - View Available Electric Cars");
        System.out.println("6 - View All Users");
        System.out.println("7 - Exit");
    }
}