package org.example.controlservice.mapper;




import org.example.controlservice.dao.entities.Car;
import org.example.controlservice.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public Car toEntity(CarDTO carDTO) {
        return modelMapper.map(carDTO, Car.class);
    }

    public CarDTO toDTO(Car car) {
        return modelMapper.map(car, CarDTO.class);
    }
}

