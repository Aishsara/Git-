package com.spring.EducationalLoan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.EducationalLoan.Model.AdminModel;
import com.spring.EducationalLoan.Model.LoanApplicationModel;
import com.spring.EducationalLoan.Model.LoginModel;
import com.spring.EducationalLoan.Model.UserModel;
import com.spring.EducationalLoan.Service.EduService;

@CrossOrigin
@RestController
@RequestMapping("/")
public class EduController {
	
	
	
	@Autowired
	EduService service;
	
	
	//Admin
	@PostMapping("admin")
	public String addAdmin(@RequestBody AdminModel am)
	{
		return service.postAdmin(am);
	}
	
	@GetMapping("admin/getAllLoans")
	public List<AdminModel> getAdminModels()
	{
		return service.getAdmin();
	}
	
	@DeleteMapping("admin/delete")
	public String deleteAdminModels(@PathVariable int adminId)
	{
		return service.deleteAdmin(adminId);
	}
	
	@PutMapping("admin/put")
	public String putAdmin(@RequestBody AdminModel adm)
	{
		return service.updateAdmin(adm);
	}
	
	//LoanApplicationModel
	
	@PostMapping("loan")
	public String addLoan(@RequestBody LoanApplicationModel lm)
	{
		return service.postLoan(lm);
	}
	
	@GetMapping("loan/get")
	public List<LoanApplicationModel> getLoanApplicationModels()
	{
		return service.getLoan();
	}
	
	@DeleteMapping("loan/delete")
	public String deleteLoanApplicationModels(@PathVariable int loanId)
	{
		return service.deleteLoan(loanId);
	}
	
	@PutMapping("loan/put")
	public String putAdmin(@RequestBody LoanApplicationModel lo)
	{
		return service.updateLoan(lo);
	}
	
	
	//login
	@PostMapping("login")
	public String addlogin(@RequestBody LoginModel lom)
	{
		return service.postLogin(lom);
	}
	
	@DeleteMapping("login/delete")
	public String deleteloginbyId()
	{
		return service.deleteLogin();
	}
	
	
	//user
	@PostMapping("user")
	public String addUser(@RequestBody UserModel m)
	{
		return service.postUser(m);
	}
	
	@GetMapping("user/get")
	public List<UserModel> getUserModel()
	{
		return service.getUser();
	}
	
	@DeleteMapping("user/delete")
	public String deleteUserModels(@PathVariable int Id)
	{
		return service.deleteUser(Id);
	}
	
	@PutMapping("user/put")
	public String putUser(@RequestBody UserModel lo)
	{
		return service.updateUser(lo);
	}
	
	

}
