package com.spring.EducationalLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.EducationalLoan.Model.AdminModel;


@Repository
public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

}
