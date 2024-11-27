package org.generation.italy.NewHouseCup.model.repositories;

import org.generation.italy.NewHouseCup.model.entities.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepositoryJpa extends JpaRepository<House, Long> {
}
