package org.example.controlservice.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCar;
    private String model;
    private String color;
    private String matricul;
    private double price;

    public Car(Long id_Car, String model, String color, String matricul, int price) {
        this.idCar = id_Car;
        this.model = model;
        this.color = color;
        this.matricul = matricul;
        this.price = price;
    }
}

