package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	
	@Query("from Users where uemail=?1 and upassword=?2")
	public Users checkLogin(String uemail,String upassword);
	
	
}
