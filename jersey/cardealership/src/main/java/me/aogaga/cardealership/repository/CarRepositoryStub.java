package me.aogaga.cardealership.repository;

import me.aogaga.cardealership.models.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarRepositoryStub implements CarRepository {

    @Override
    public  List<Car> allCars(){
        List<Car> cars  = new ArrayList<Car>();

        Car c = new Car();
        c.setMake("Mercedes Benz");;
        c.setModel("C300");
        cars.add(c);

        Car c1 = new Car();
        c1.setMake("BMW");;
        c1.setModel("335i");
        cars.add(c1);

        Car c2 = new Car();
        c2.setMake("Land Rover");;
        c2.setModel("Range Rover Velar R Dynamic P380");

        cars.add(c2);
        return cars;
    }

    public Car get(){
        Car c = new Car();
        c.setMake("BMW");;
        c.setModel("335i");
        return c;
    }
}
