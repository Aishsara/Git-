package com.spring.EducationalLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.EducationalLoan.Model.UserModel;
@Repository


public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
