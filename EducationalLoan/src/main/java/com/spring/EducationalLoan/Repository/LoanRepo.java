package com.spring.EducationalLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.EducationalLoan.Model.LoanApplicationModel;

@Repository
public interface LoanRepo extends JpaRepository<LoanApplicationModel, Integer>{

}
