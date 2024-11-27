package org.generation.italy.NewHouseCup.model.services;

import org.generation.italy.NewHouseCup.model.entities.House;

import java.util.List;

public interface HouseService {
    List<House> getAllHouses();
    House findHouseByName(String name);
}
