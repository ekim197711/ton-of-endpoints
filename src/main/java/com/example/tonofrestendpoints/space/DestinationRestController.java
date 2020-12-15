package com.example.tonofrestendpoints.space;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/space")
public class DestinationRestController {

    @GetMapping("/firsttrip")
    public String firstTrip(){
        return "Moon";
    }
    @GetMapping("/second")
    public String secondTrip(){
        return "Mars";
    }

    @GetMapping("/third")
    public String thirdTrip(){
        return "Neptune";
    }
    @GetMapping("/fourth")
    public String fourthTrip(){
        return "Jupiter";
    }
}
