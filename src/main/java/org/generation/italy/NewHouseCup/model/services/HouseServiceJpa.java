package org.generation.italy.NewHouseCup.model.services;

import org.generation.italy.NewHouseCup.model.entities.House;
import org.generation.italy.NewHouseCup.model.repositories.HouseRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceJpa implements HouseService {
    private HouseRepositoryJpa houseRepo;

    @Autowired
    public HouseServiceJpa(HouseRepositoryJpa houseRepo) {
        this.houseRepo = houseRepo;
    }

    @Override
    public List<House> getAllHouses() {
        return List.of();
    }

    @Override
    public House findHouseByName(String name) {
        return null;
    }
}
