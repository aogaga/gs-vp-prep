package me.aogaga.cardealership.repository;

import me.aogaga.cardealership.models.Car;

import java.util.List;

public interface CarRepository {
    List<Car> allCars();
     Car get();
}
