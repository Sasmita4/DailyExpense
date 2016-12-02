/*package com.daily.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.daily.model.User;
@Repository
public class UserDao {
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired
	private MongoOperations mongoOperations;
	
	public void saveUser(User user){
		mongoTemplate.save(user);
	}
	
	public Collection<User> getUsers(){
		return mongoOperations.findAll(User.class);
	}
	
	public User updateUser(User user){
		Query query=new Query();
		query.addCriteria(Criteria.where("_id").is(user.getId()));
		Update update=new Update();
		update.set("name", user.getName());
		update.set("age", user.getAge());
		mongoOperations.findAndModify(query,update,User.class);
		User userUpdate=mongoOperations.findOne(query,User.class);
		userUpdate.setAge(user.getAge());
		userUpdate.setName(user.getName());
		mongoOperations.save(userUpdate);
		User userUpdate=mongoOperations.findOne(query,User.class);
		return userUpdate;
	}
	
	public void removeUser(String id){
		Query query=new Query();
		System.out.println("ID for removal>>>>>>>>"+id);
		query.addCriteria(Criteria.where("_id").is(id));
		mongoOperations.remove(mongoOperations.findOne(query,User.class));
	}
}
*/