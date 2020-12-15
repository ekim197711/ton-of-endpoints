package com.example.tonofrestendpoints.space;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/station")
public class SpaceStationRestController {

    @GetMapping("/science")
    public String doScience(){
        return "Mixing... stuff";
    }

    @GetMapping("/communication")
    public String comm(){
        return "Hi...";
    }


    @PostMapping("/fuelship")
    public SpaceShip fuelUp(@RequestBody SpaceShip ship){
        ship.setFuel(100);
        return ship;
    }


    @PostMapping("/addmodule")
    public String addModule(@RequestBody String module){
        return "New module added: " + module;
    }



}
