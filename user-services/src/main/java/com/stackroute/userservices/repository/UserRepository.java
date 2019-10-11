package com.stackroute.userservices.repository;

import com.stackroute.userservices.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
