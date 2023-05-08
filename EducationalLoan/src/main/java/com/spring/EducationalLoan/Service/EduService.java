package com.spring.EducationalLoan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.EducationalLoan.Model.AdminModel;
import com.spring.EducationalLoan.Model.LoanApplicationModel;
import com.spring.EducationalLoan.Model.LoginModel;
import com.spring.EducationalLoan.Model.UserModel;
import com.spring.EducationalLoan.Repository.AdminRepo;
import com.spring.EducationalLoan.Repository.LoanRepo;
import com.spring.EducationalLoan.Repository.LoginRepo;
import com.spring.EducationalLoan.Repository.UserRepo;

@Service
public class EduService {
	
	//AdminModel
	
	@Autowired
	AdminRepo arepo;
	
	
	//get 
	public List<AdminModel> getAdmin()
	{
		return arepo.findAll();
	}
	
	//post 
	public String postAdmin(AdminModel am)
	{
		arepo.save(am);
		return "Data is Saved in Admin Table";
	}
	
	//delete
	public String deleteAdmin(int adminId)
	{
		arepo.deleteById(adminId);
		return "Deleted in Admin Model";
	}
	
	//update
	public  String updateAdmin(AdminModel am)
	{
		arepo.saveAndFlush(am);
		return "Data Updated in AdminModel";
	}
	
	//loan
	@Autowired
	LoanRepo lrepo;

	public String postLoan(LoanApplicationModel loan) {
		
		 lrepo.save(loan);
		 return "Data is Saved in Loan Table";
	}

	public List<LoanApplicationModel> getLoan() {
	
		return lrepo.findAll();
	}

	public String deleteLoan(int loanId) {
		
		lrepo.deleteById(loanId);
		return "Deleted in Loan Model";
	}

	public String updateLoan(LoanApplicationModel lo) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Autowired
	LoginRepo logrepo;
	//login
	public String postLogin(LoginModel lom) {

	 logrepo.save(lom);
	 return "Data is saved in Login table";
	}

	public String deleteLogin() {
		
		logrepo.deleteAll();
		return "Deleted";
	}
	
	//user

	@Autowired
	UserRepo user;
	public String postUser(UserModel m) {
	
		user.save(m);
		return "Data is saved ";
	}

	public List<UserModel> getUser() {
		
		return user.findAll();
	}

	public String deleteUser(int id) {
		
		
		user.deleteById(id);
		return "Deleted";
	}

	public String updateUser(UserModel lo) {
		
		user.saveAndFlush(lo);
		return "Updated";
	}
	
	
	


}
