package org.example.controlservice.dao.repository;

import org.example.controlservice.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
