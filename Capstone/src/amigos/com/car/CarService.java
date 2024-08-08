package amigos.com.car;

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
