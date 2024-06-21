package com.TwineEngine.lustwave.repository;

import com.TwineEngine.lustwave.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
