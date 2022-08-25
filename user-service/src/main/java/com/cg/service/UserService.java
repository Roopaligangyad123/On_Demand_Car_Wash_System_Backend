package com.cg.service;

import java.util.List;

import com.cg.models.Payment;
import com.cg.models.UserDetail;
import com.cg.models.UserDetail;
import com.cg.models.UserLogin;
public interface UserService {

	
	// public Signup addUser(Signup signup);
	  public List<UserDetail> getuser();
    // public Signup Updateuser(Signup update);
	  public void deleteUser(int id);
	  public int getSequenceNumber(String sequenceName);
	  //public void deleteUser(Signup user);
	UserDetail addUser(UserDetail signup);
	UserDetail Updateuser(UserDetail update);
	//void deleteUser(UserDetail user);
	void deleteUser(UserDetail user);
	//public String userLogin(UserLogin login);
	  
	  
	  
	
}
