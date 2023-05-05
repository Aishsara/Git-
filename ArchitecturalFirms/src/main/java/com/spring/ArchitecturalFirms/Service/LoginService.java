
package com.spring.ArchitecturalFirms.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ArchitecturalFirms.ArchitectModel.LoginModel;
import com.spring.ArchitecturalFirms.ArchitectRepository.LoginRepo;

@Service
public class LoginService {
	
	@Autowired
	public LoginRepo repo;
	
	public String checklogin(String username,String password)
	{
		LoginModel gallery = repo.findByusername(username);
		if(gallery==null)
		{
			return "no user found";
		}
		else {
			if(gallery.getPassword().equals(password))
			{
				return "Login Succefull";
			}
			else {
				
				return "Login Failed";
			}
			
		}
	}
	public LoginModel addUser(LoginModel sara)
	{
		return repo.save(sara);
	}
	public List<LoginModel> getUser()
	{
		return repo.findAll();
	}
	public String deleteById(int id)
	{
		repo.deleteById(id);
		return "Deleted";
	}
	

}
