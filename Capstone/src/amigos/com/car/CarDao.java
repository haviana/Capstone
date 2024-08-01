package amigos.com.car;

import amigos.com.user.User;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
}
