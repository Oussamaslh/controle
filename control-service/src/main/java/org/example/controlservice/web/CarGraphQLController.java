import org.example.controlservice.dto.CarDTO;
import org.example.controlservice.service.CarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQLController {

    private CarService carService;

    @QueryMapping
    public List<CarDTO> getCars() {
        return carService.getCars();
    }

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO car) {
        return carService.saveCar(car);
    }
}
