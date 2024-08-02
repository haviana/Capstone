package amigos.com.car;

import amigos.com.user.User;
import amigos.com.user.UserDao;

public class CarService {

    CarDao carDao = new CarDao();

    public Car[] getAllCars() {
        return carDao.getAllCars();

    }
    public Car[] getAvailableCars() {
        return carDao.getAllCars();

    }
    public Car[] getAllEletricCars() {
        return carDao.getElectriCars();

    }

public Car getCarById(String regNumber){
        return carDao.getCarByID(regNumber);
}
    public void deleteById(String regNumber){
         carDao.deleteCar(regNumber);
    }
}
