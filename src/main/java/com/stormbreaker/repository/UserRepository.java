package com.stormbreaker.repository;

import com.stormbreaker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);

    String email(String email);
}
