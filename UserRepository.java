package com.shu.kart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository <User, Long> {

	@Query("Select u from User u where u.email=?1")
	User findByEmail(String email);
	
	@Query("Select u from User u where u.email=?1")
	User findPassword(String password);
}
