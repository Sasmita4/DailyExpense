/*package com.daily.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daily.dao.UserDao;
import com.daily.model.User;
@Service
public class UserService {
	@Autowired
	private UserDao userRepository;
	
	public void saveCustomer(User user){
		userRepository.saveUser(user);
	}
	
	public Collection<User> getAllCustomers(){
		Collection<User> userDetails= userRepository.getUsers();
		return userDetails;
	}
	
	public User modifyUser(User user){
		return userRepository.updateUser(user);
	}
	
	public void removeCust(String id){
		userRepository.removeUser(id);
	}
}
*/