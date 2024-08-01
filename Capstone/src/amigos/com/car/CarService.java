package amigos.com.car;

import amigos.com.user.User;
import amigos.com.user.UserDao;

public class CarService {

    CarDao carDao = new CarDao();
    public Car[] getAllCars(){
        return carDao.getAllCars();

    }

    public Car[] getAllEletricCars(){
        return carDao.getElectriCars();

    }
}
