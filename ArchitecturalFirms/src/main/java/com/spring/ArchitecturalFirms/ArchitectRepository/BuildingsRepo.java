package com.spring.ArchitecturalFirms.ArchitectRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ArchitecturalFirms.ArchitectModel.TopBuildings;

public interface BuildingsRepo extends JpaRepository<TopBuildings, Integer> {

}
