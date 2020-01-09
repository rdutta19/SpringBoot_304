package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarsRepository repository;
    @Override
    public void run(String... strings) throws Exception{
        Cars cars;
        cars = new Cars("2018", "Toyota", "Corolla");
        repository.save(cars);

        cars = new Cars("2019", "Honda", "Civic");
        repository.save(cars);

        cars = new Cars("2020", "Honda", "Pilot");
        repository.save(cars);
    }
}
