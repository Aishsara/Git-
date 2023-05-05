package com.spring.ArchitecturalFirms.ArchitectRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ArchitecturalFirms.ArchitectModel.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

	LoginModel findByusername(String username);

}
