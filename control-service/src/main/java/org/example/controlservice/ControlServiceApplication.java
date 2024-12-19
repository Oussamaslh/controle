package org.example.controlservice;

import org.example.controlservice.dao.entities.Car;
import org.example.controlservice.dao.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ControlServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CarRepository carRepository) {
        return args -> {
            carRepository.save(new Car(null, "Toyota", "Red", "123ABC", 20000));
            carRepository.save(new Car(null, "BMW", "Black", "456DEF", 50000));
            carRepository.save(new Car(null, "Mercedes", "White", "789GHI", 60000));
            carRepository.save(new Car(null, "Ford", "Blue", "101JKL", 25000));
        };
    }
}
