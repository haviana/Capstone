package amigos.com.car;

import java.math.BigDecimal;
import java.util.Arrays;

public class CarDao {

    private static Car[] cars;

    static {
        cars = new Car[] { new Car("1234", new BigDecimal(89), "Tesla",true),
                new Car("12345", new BigDecimal(50), "Audi",false),
                new Car("123456", new BigDecimal(77), "Mercedes",false)
        };
    }

    public Car[] getAllCars(){
        return cars;
    }

    public Car[] getElectriCars(){

        return Arrays.stream(cars).filter(car -> car.isEletric()).toArray(Car[]::new);
    }
    public Car getCarByID(String regNumber){

        return Arrays.stream(cars).filter(car -> car.regNumber().equals(regNumber)).findAny().get();
    }

    public void deleteCar(String regNumber){

        cars= Arrays.stream(cars).filter(car -> !car.regNumber().equals(regNumber)).toArray(Car[]::new);

    }
}
