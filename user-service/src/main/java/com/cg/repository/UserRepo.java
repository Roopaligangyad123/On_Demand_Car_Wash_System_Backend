package com.cg.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.models.UserDetail;
import com.cg.models.UserDetail;

@Repository
public interface UserRepo extends MongoRepository<UserDetail, Integer> 
{

//	Optional<Signup> findById(Long id);

	//UserDetail findby(String username);
	
	UserDetail findByUsername(String username);

	

}
