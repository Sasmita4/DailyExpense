package com.daily.controller;
/*package com.daily.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.daily.model.User;
import com.daily.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/getUsers",produces="application/json")
	@ResponseBody
	public Collection<User> getUsersList(){
		return service.getAllCustomers();
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public void addUser( User user){
		service.saveCustomer(user);
	}
	
	@RequestMapping(value="/updateUser",method=RequestMethod.PUT)
	public User updateUser(User user){
		return service.modifyUser(user);
	}
	
	@RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)
	public void deleteUser(User user){
		System.out.println("ID for removal (Inside Controller)>>>>>>>>"+user.getId());
		service.removeCust(user.getId());
	}
	
}
*/