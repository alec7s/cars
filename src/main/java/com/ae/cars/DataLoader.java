package com.ae.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car = new Car("2001", "Honda", "Civic");
        repository.save(car);

        car = new Car("1997", "Dodge", "Caravan");
        repository.save(car);

        car = new Car("1988", "Lamborghini", "Countach");
        repository.save(car);
    }
}
