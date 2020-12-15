package com.example.tonofrestendpoints.factory;

import com.example.tonofrestendpoints.space.SpaceShip;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/factory")
public class FactoryRestController {

    @PostMapping("/fruit")
    public String produceFruit() {
        return "Tomatoes";
    }

    @PostMapping("/spaceship")
    public SpaceShip produceSpaceship(@RequestBody String captain) {
        return new SpaceShip("round", captain, 55);
    }

    @PostMapping("/laser")
    public SpaceShip produceLaser() {
        return new SpaceShip("round", "Mike", 55);
    }


}
