package com.example.tonofrestendpoints.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip {
    private String name;
    private String captain;
    private Integer fuel;
}
